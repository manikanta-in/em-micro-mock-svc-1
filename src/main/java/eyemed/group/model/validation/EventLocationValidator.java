package eyemed.group.model.validation;

import eyemed.group.model.dto.events.EventLocationDto;
import eyemed.utils.StringUtils;

import java.util.List;

public class EventLocationValidator extends MultiResultValidator {

    private final EventLocationDto location;
    public EventLocationValidator(EventLocationDto location) {
        this.location = location;
    }

    @Override
    public List<ValidationErrorResult> validate() {
        isValid = true;

        validationResults.clear(); //Reset validation results.

        if(location == null) {
            logValidationError("validator", MSG_BLANK);
            return validationResults;
        }

        //Location Name
        if(StringUtils.isBlank(location.getLocationName())) {
            logValidationError("event.location.name", MSG_BLANK);
        } else if(location.getLocationName().length() > 30) {
            logValidationError("event.location.name", "max", "30");
        }

        EventAddressValidator eventAddressValidator = new EventAddressValidator(location.getLocationAddress());
        validationResults.addAll(eventAddressValidator.validate());
        if(!eventAddressValidator.isValid()) { isValid = false; }

        if(location.getEmployeeQuantity() < 1) {
            logValidationError("event.location.employee", "min");
        }

        //Contact Name
        if(StringUtils.isBlank(location.getContactName())) {
            logValidationError("event.contact.name", "empty");
        }
        else if(location.getContactName().length() > 50) {
            logValidationError("event.contact.name", "max", "50");
        }

        //Contact Email
        if(StringUtils.isBlank(location.getContactEmail())) {
            logValidationError("event.contact.email", "empty");
        }
        else if(location.getContactEmail().length() > 255) {
            logValidationError("event.contact.email", "max", "255");
        }

        //Contact Phone
        if(StringUtils.isBlank(location.getContactPhone())) {
            logValidationError("event.contact.phone", "empty");
        }
        else if(location.getContactPhone().length() > 20) {
            logValidationError("event.contact.phone", "max", "20");
        }

        //Contact Phone Ext
        if(location.getContactExt() != null && location.getContactExt().length() > 6) {
            logValidationError("event.contact.ext", "max", "6");
        }

        return validationResults;
    }


}
