package eyemed.group.model.validation;

import eyemed.group.model.dto.EventGlobalSettingsDto;
import eyemed.group.model.dto.events.EventDto;
import eyemed.group.model.dto.events.EventLocationDto;
import eyemed.group.model.dto.events.EventProductKeyDto;
import eyemed.utils.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.*;

public class EventValidator extends MultiResultValidator {

    private static final String MSG_YES_NO = "yes-no";
    private final EventDto event;
    private final EventGlobalSettingsDto settings;
    private final List<EventDto> existingEvents;
    private EventLocationDto location;

    public EventValidator(EventDto event, EventGlobalSettingsDto settings, List<EventDto> existingEvents, EventLocationDto location) {
        this.event = event;
        this.settings = settings;
        this.existingEvents = existingEvents;
        this.location = location;
    }

    @Override
    public List<ValidationErrorResult> validate() {
        isValid = true;
        validationResults.clear(); //Reset validation results.

        if(event == null) {
            logValidationError("validator", "empty", "null");
            return validationResults; //hard error
        }

        if(event.getEventLocationId() <= 0) {
            logValidationError("event.location", "empty");
        }

        if(location == null || location.getEventLocationId() <= 0) {
            logValidationError("event.location", "invalid");
        }

        //Event type must be 1 or 2
        if(!"1".equals(event.getEventType()) && !"2".equals(event.getEventType())) {
            logValidationError("event.type", "range");
        }

        validateEventDates();

        //Digital request
        if(!validateYesNoIndicatorField(event.getRequestDigitalInd())) {
            logValidationError("validator", MSG_YES_NO, "Request Digital");
        }

        //Material request
        if(!validateYesNoIndicatorField(event.getRequestMaterialsInd())) {
            logValidationError("validator", MSG_YES_NO, "Request Materials");
        } else if ("Y".equalsIgnoreCase(event.getRequestStandardInd())
                && settings.getTotalEmployeeQuantity() < settings.getMaterialsMinimumEmployeeQuantity()) {
            logValidationError("event.request.materials", "ineligible");
        }

        //Full Staffed event request
        if(!validateYesNoIndicatorField(event.getRequestStandardInd())) {
            logValidationError("validator", MSG_YES_NO, "Request Standard");
        } else if ("Y".equalsIgnoreCase(event.getRequestStandardInd())
                && settings.getTotalEmployeeQuantity() < settings.getStaffedEventMinimumEmployeeQuantity()) {
            logValidationError("event.request.standard", "ineligible");
        }

        boolean dateDuplicateFlag = false;
        int existingStaffedEventQty = 0;
        for (EventDto existingEvent : existingEvents) {
            //Find out if this date has already been scheduled this year, if it has, make sure it's not at the same
            //location.
            DateTime eventOrShipDate = event.getEventStartDate();
            if(eventOrShipDate == null)
                eventOrShipDate = event.getShipDeliverDate();

            DateTime existingEventOrShipDate = existingEvent.getEventStartDate();
            if(existingEventOrShipDate == null)
                existingEventOrShipDate = existingEvent.getShipDeliverDate();

            if(eventOrShipDate != null && existingEventOrShipDate != null
                    && existingEventOrShipDate.toLocalDate().toString().equals(eventOrShipDate.toLocalDate().toString())
                    && existingEvent.getEventLocationId() == event.getEventLocationId()
                    && !dateDuplicateFlag) {
                logValidationError("event.start", "duplicate");
                dateDuplicateFlag = true;
            }
            //Get count of staffed events.
            if("Y".equalsIgnoreCase(existingEvent.getRequestStandardInd())) {
                existingStaffedEventQty++;
            }
        }

        //If we're already at or over the staffed events for the year, then don't allow a new one to be created.
        if("Y".equalsIgnoreCase(event.getRequestStandardInd())) {
            if (settings.getStaffedEventMaximumQuantityOverride() != null) {
                if (existingStaffedEventQty >= settings.getStaffedEventMaximumQuantityOverride()) {
                    logValidationError("event.start", "quantity");
                }
            } else {
                int maxStaffedEvent = 0;
                if (settings.getTotalEmployeeQuantity() >= 500
                        && settings.getTotalEmployeeQuantity() <= 1000) {
                    maxStaffedEvent = 1;
                } else if (settings.getTotalEmployeeQuantity() >= 1001
                        && settings.getTotalEmployeeQuantity() <= 5000) {
                    maxStaffedEvent = 2;
                } else if (settings.getTotalEmployeeQuantity() >= 5001
                        && settings.getTotalEmployeeQuantity() <= 12000) {
                    maxStaffedEvent = 7;
                } else if (settings.getTotalEmployeeQuantity() >= 12001) {
                    maxStaffedEvent = 10;
                }

                if (existingStaffedEventQty >= maxStaffedEvent) {
                    logValidationError("event.start", "quantity");
                }
            }
        }


        //Business rules dictate that if Standard is selected, then digital and materials must also be selected.
        boolean isRequestBenefit   = "Y".equalsIgnoreCase(event.getRequestBenefitInd());
        boolean isRequestDigital   = "Y".equalsIgnoreCase(event.getRequestDigitalInd());
        boolean isRequestMaterials = "Y".equalsIgnoreCase(event.getRequestMaterialsInd());
        boolean isRequestStandard  = "Y".equalsIgnoreCase(event.getRequestStandardInd());

        boolean isRequestBenefitOnly = isRequestBenefit && !isRequestDigital && !isRequestMaterials && !isRequestStandard;
        boolean isRequestDigitalOnly = isRequestDigital && !isRequestMaterials && !isRequestStandard;
//        boolean isRequestMaterialsOnly = isRequestMaterials && !isRequestDigital && !isRequestStandard;

        if(isRequestStandard && (!isRequestDigital || !isRequestMaterials)) {
            logValidationError("event.request.standard", "min");
        }

        //Only required for internal users, but should default to "No"
        if(!StringUtils.isBlank(event.getExchangeType())
                && !Arrays.asList("No", "Aon", "Towers").contains(event.getExchangeType())){
           logValidationError("event.exchange-type", "value-list");
        }

        //Contact Name
        if(StringUtils.isBlank(event.getContactName())) {
            logValidationError("event.contact.name", "empty");
        }
        else if(event.getContactName().length() > 50) {
            logValidationError("event.contact.name", "max", "50");
        }

        //Contact Email
        if(StringUtils.isBlank(event.getContactEmail())) {
            logValidationError("event.contact.email", "empty");
        }
        else if(event.getContactEmail().length() > 255) {
            logValidationError("event.contact.email", "max", "255");
        }

        //Contact Phone
        if(StringUtils.isBlank(event.getContactPhone())) {
            logValidationError("event.contact.phone", "empty");
        }
        else if(event.getContactPhone().length() > 20) {
            logValidationError("event.contact.phone", "max", "20");
        }

        //Contact Phone Ext
        if(event.getContactExt() != null && event.getContactExt().length() > 6) {
            logValidationError("event.contact.ext", "max", "6");
        }

        //Packet Requested
        if(!validateYesNoIndicatorField(event.getPacketRequestedInd(), false)) {
            logValidationError("validator", MSG_YES_NO, "Packet Requested");
        }

        if("Y".equalsIgnoreCase(event.getPacketRequestedInd())) {
            //Packet Quantity Minimum
            if (event.getPacketQty() < 1) {
                logValidationError("event.packet.quantity", "min");
            }

            //Packet Quantity Maximum - Doesn't apply for digital.
            if ((isRequestMaterials || isRequestStandard)
                    && event.getPacketQty() > location.getEmployeeQuantity()) {
                logValidationError("event.packet.quantity", "max");
            }
        }

        //Spanish Materials (Packet) Requested
        if(!validateYesNoIndicatorField(event.getSpanishMatNeededInd(), false)) {
            logValidationError("validator", MSG_YES_NO, "Spanish Materials Needed");
        }


        if("Y".equalsIgnoreCase(event.getSpanishMatNeededInd())) {
            //Spanish Materials (Packet) Quantity Minimum
            if (!isRequestBenefitOnly && !isRequestDigitalOnly
                    && event.getSpanishMatQty() < 1) {
                logValidationError("event.packet.spanish.quantity", "min", "1");
            }

            //Spanish Materials (Packet) Quantity Maximum
            if ((isRequestMaterials || isRequestStandard)
                    && (event.getSpanishMatQty() > location.getEmployeeQuantity() && event.getSpanishMatQty() > event.getPacketQty())) {
                logValidationError("event.packet.spanish.quantity", "max");
            }
        }

        //Staffed Event Confirmation (Internal Only)
        if(!validateYesNoIndicatorField(event.getStaffedEventConfirmedInd(), false)) {
            logValidationError("validator", MSG_YES_NO, "Staffed Event Confirmation");
        }

        //Staffed Event Associate Name (Internal Only)
        if(event.getStaffedEventAssocName() != null && event.getStaffedEventAssocName().length() > 255) {
            logValidationError("event.staffed.name", "max", "255");
        }

        //Raffle Item Indicator (Internal Only)
        if(!validateYesNoIndicatorField(event.getRaffleItemInd(), false)) {
            logValidationError("validator", MSG_YES_NO, "Raffle Item Indicator");
        } else if("Y".equalsIgnoreCase(event.getRaffleItemInd())
                && !"Y".equalsIgnoreCase(event.getRequestStandardInd())) {
            logValidationError("event.raffle", "ineligible");
        }

        if(event.getEventLocationId() <= 0) {
            logValidationError("event.location.address", "missing");
        }

        //Shipping EventAddressDto
        if(!validateYesNoIndicatorField(event.getShipAddrSeparateInd())) {
            logValidationError("validator", MSG_YES_NO, "Separate Shipping Address");
        }

        //Validate Shipping Address
        if("Y".equalsIgnoreCase(event.getShipAddrSeparateInd())) {
            EventAddressValidator eventAddressValidator = new EventAddressValidator(event.getShipAddress(), "Shipping");
            validationResults.addAll(eventAddressValidator.validate());
            if(!eventAddressValidator.isValid()) { isValid = false; }
        }
        validateBenefits();

        if(!StringUtils.isBlank(event.getLocationSpecialNotes()) && event.getLocationSpecialNotes().length() > 255) {
            logValidationError("event.notes", "max", "255");
        }

        return validationResults;
    }


    private void validateEventDates() {
        //Event Date
        if("Y".equalsIgnoreCase(event.getRequestStandardInd())) {

            if(event.getEventStartDate() == null) {
                logValidationError("event.start", MSG_BLANK);
            } else {
                //Event cannot be earlier than 30 days in the future
                final Calendar minimumDate = Calendar.getInstance();
                minimumDate.add(Calendar.DATE, 30); //TODO Make configurable
                if (minimumDate.after(event.getEventStartDate().toCalendar(Locale.getDefault()))) {
                    logValidationError("event.start", "min", "30"); //TODO Make configurable
                }

                //Staffed events require a start and end time and cannot start on a weekend.
                if ("Y".equalsIgnoreCase(event.getRequestStandardInd())) {

                    //Event cannot start on a weekend.
                    final Calendar startDate = Calendar.getInstance();
                    startDate.setTime(event.getEventStartDate().toLocalDate().toDate());
                    final int startDateDayOfWeek = startDate.get(Calendar.DAY_OF_WEEK);

                    if (startDateDayOfWeek == Calendar.SATURDAY || startDateDayOfWeek == Calendar.SUNDAY) {
                        logValidationError("event.start", "weekend");
                    }

                    final int startDateHourOfDay = event.getEventStartDate().getHourOfDay();

                    //Start time needs to be between 7am and 6pm.
                    if (startDateHourOfDay < 7
                            || startDateHourOfDay > 18
                            || (startDateHourOfDay == 18 && event.getEventStartDate().getMinuteOfHour() > 0)) {
                        logValidationError("event.start", "range", new Object[]{"7AM", "6PM"});
                    }

                    //Handle the end date being blank elsewhere, but just in case it is:
                    if (event.getEventEndDate() != null) {

                        final Calendar endDate = Calendar.getInstance();
                        endDate.setTime(event.getEventEndDate().toLocalDate().toDate());

                        //Event start needs to be before end
                        if (endDate.before(startDate)) {
                            logValidationError("event.end", "before");
                        }

                        //Event needs to have the same date portion as start date
                        final Date startDateTruncated = DateUtils.truncate(event.getEventStartDate().toLocalDate().toDate(), Calendar.DAY_OF_MONTH);
                        final Date endDateTruncated = DateUtils.truncate(event.getEventEndDate().toLocalDate().toDate(), Calendar.DAY_OF_MONTH);
                        boolean datesAreNotEqual = !startDateTruncated.equals(endDateTruncated);
                        if (datesAreNotEqual) {
                            logValidationError("event.end", "match");
                        }

                        final int endDateHourOfDay = event.getEventEndDate().getHourOfDay();
                        //End time needs to be between 8am and 7pm.
                        if (endDateHourOfDay < 8
                                || endDateHourOfDay > 19
                                || (endDateHourOfDay == 19 && event.getEventEndDate().getMinuteOfHour() > 0)) {
                            logValidationError("event.end", "range", new Object[]{"8AM", "7PM"});
                        }

                        Duration eventDuration = new Duration(event.getEventStartDate(), event.getEventEndDate());
                        //End time cannot be more than 8 hours after start time
                        if (eventDuration.isLongerThan(Duration.standardHours(8))) {
                            logValidationError("event.end", "max", "8");
                        }

                        //End time cannot be less than 1 hour after the start time.
                        if (eventDuration.isShorterThan(Duration.standardHours(1))) {
                            logValidationError("event.end", "min");
                        }
                    }
                }
            }
        }

        //End date is blank, but staffed event is requested.
        if("Y".equalsIgnoreCase(event.getRequestStandardInd())
                && event.getEventEndDate() == null) {
            logValidationError("event.end", "blank");
        }

        //Deliver Date (Need Date)
        if("Y".equalsIgnoreCase(event.getRequestDigitalInd())
                || "Y".equalsIgnoreCase(event.getRequestMaterialsInd())) {

            if(event.getShipDeliverDate() == null) {
                logValidationError("event.shipping.date", MSG_BLANK);
            } else {
                //Shipping date cannot be earlier than 14 days in the future for Materials
                final Calendar minimumMaterialsDate = Calendar.getInstance();
                final int minMaterialsDays = 14;
                minimumMaterialsDate.add(Calendar.DATE, minMaterialsDays);
                if("Y".equalsIgnoreCase(event.getRequestMaterialsInd())
                        && minimumMaterialsDate.after(event.getShipDeliverDate())) {
                    logValidationError("event.shipping.date", "min", "14");
                }

                //If they're not doing materials and only digital, then the ship date would be just 5 days
                final Calendar minimumDigitalDate = Calendar.getInstance();
                final int minDigitalDays = 5;
                minimumDigitalDate.add(Calendar.DATE, minDigitalDays);
                if("N".equalsIgnoreCase(event.getRequestMaterialsInd())
                        && "Y".equalsIgnoreCase(event.getRequestDigitalInd())
                        && minimumDigitalDate.after(event.getShipDeliverDate())) {
                    logValidationError("event.shipping.date", "min", "5");
                }

                //Removed per QC Defect 7387
//                //Ship date cannot be after event start date
//                if(event.getEventStartDate() != null
//                        && event.getEventStartDate().isBefore(event.getShipDeliverDate())
//                        ) {
//                    logValidationError("event.shipping.date", "max");
//                }

            }
        }
    }


    private void validateBenefits() {
        //At least one benefit must be selected.
        if(event.getBenefits() == null || event.getBenefits().size() < 1) {
            logValidationError("event.benefits", "blank");
        } else {
            //Validate benefits
            boolean isBenefitValid = true;
            for (EventProductKeyDto benefit : event.getBenefits()) {

                //BSBS
                if(StringUtils.isBlank(benefit.getBsbsPrefix())) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.bsbs", MSG_BLANK);
                } else if(benefit.getBsbsPrefix().length() > 4) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.bsbs", "max");
                }

                //EMBE
                if(benefit.getEmbePrefix() != null && benefit.getEmbePrefix().length() > 4) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.embe", "max");
                }

                //COPK
                if(benefit.getCopkPrefix() != null && benefit.getCopkPrefix().length() > 4) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.copk", "max");
                }

                //GRGCK
                if(benefit.getGroupCk() == 0) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.grgr", MSG_BLANK);
                }

                //CSCS
                if(StringUtils.isBlank(benefit.getClassId())) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.cscs", MSG_BLANK);
                } else if(benefit.getBsbsPrefix().length() > 4) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.cscs", "max");
                }

                //CSPI
                if(StringUtils.isBlank(benefit.getClassPlanId())) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.cspi", MSG_BLANK);
                } else if(benefit.getClassPlanId().length() > 8) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.cspi", "max");
                }

                //CSPI Effective Date
                if(benefit.getPlanEffectiveDate() == null) {
                    isBenefitValid = false;
                    logValidationError("event.benefit.cspi.effective-date", MSG_BLANK);
                }

                if(!isBenefitValid) {
                    break; //Only analyze until we find one benefit with at least one error.
                }
            }

        }
    }

}
