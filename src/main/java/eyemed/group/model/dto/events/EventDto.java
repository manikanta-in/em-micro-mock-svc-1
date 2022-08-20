package eyemed.group.model.dto.events;

import org.joda.time.DateTime;

import java.util.List;

public class EventDto {
    private int eventRequestId;
    private int parentGroupCk;
    private int eventLocationId;
    private String requestBenefitInd;
    private String requestDigitalInd;
    private String requestMaterialsInd;
    private String requestStandardInd;
    private String requestStatus;
    private String eventType;
    private String representativeType;
    private String SupportType;
    private String SupportDetails;
    private String exchangeType;
    private DateTime eventStartDate;
    private DateTime eventEndDate;
    private String contactName;
    private String contactEmail;
    private String contactName2;
    private String contactEmail2;
    private String contactName3;
    private String contactEmail3;
    private String contactName4;
    private String contactEmail4;
    private String contactPhone;
    private String contactExt;
    private String packetRequestedInd;
    private int packetQty;
    private String spanishMatNeededInd;
    private int spanishMatQty;
    private String staffedEventConfirmedInd;
    private String staffedEventAssocName;
    private String presentationInd;
    private String raffleItemInd;
    private DateTime shipDeliverDate;
    private String shipAddrSeparateInd;
    private EventAddressDto shipAddress;
    private String locationName;
    private EventAddressDto locationAddress;
    private String locationSpecialNotes;
    private int locationEmployeeQty;
    private List<EventProductKeyDto> benefits;
    private String requestedBy;
    private DateTime requestedDate;

    public int getEventRequestId() {
        return eventRequestId;
    }

    public void setEventRequestId(int eventRequestId) {
        this.eventRequestId = eventRequestId;
    }

    public int getParentGroupCk() {
        return parentGroupCk;
    }

    public void setParentGroupCk(int parentGroupCk) {
        this.parentGroupCk = parentGroupCk;
    }

    public int getEventLocationId() {
        return eventLocationId;
    }

    public void setEventLocationId(int eventLocationId) {
        this.eventLocationId = eventLocationId;
    }

    public String getRequestBenefitInd() {
        return requestBenefitInd;
    }

    public void setRequestBenefitInd(String requestBenefitInd) {
        this.requestBenefitInd = requestBenefitInd;
    }

    public String getRepresentativeType() {
        return representativeType;
    }

    public void setRepresentativeType(String representativeType) {
        this.representativeType = representativeType;
    }

    public String getSupportType() {
        return SupportType;
    }

    public void setSupportType(String supportType) {
        SupportType = supportType;
    }

    public String getSupportDetails() {
        return SupportDetails;
    }

    public void setSupportDetails(String supportDetails) {
        SupportDetails = supportDetails;
    }

    public String getRequestDigitalInd() {
        return requestDigitalInd;
    }

    public void setRequestDigitalInd(String requestDigitalInd) {
        this.requestDigitalInd = requestDigitalInd;
    }

    public String getRequestMaterialsInd() {
        return requestMaterialsInd;
    }

    public void setRequestMaterialsInd(String requestMaterialsInd) {
        this.requestMaterialsInd = requestMaterialsInd;
    }

    public String getRequestStandardInd() {
        return requestStandardInd;
    }

    public void setRequestStandardInd(String requestStandardInd) {
        this.requestStandardInd = requestStandardInd;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public DateTime getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(DateTime eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public DateTime getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(DateTime eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName2() {
        return contactName2;
    }

    public void setContactName2(String contactName2) {
        this.contactName2 = contactName2;
    }

    public String getContactEmail2() {
        return contactEmail2;
    }

    public void setContactEmail2(String contactEmail2) {
        this.contactEmail2 = contactEmail2;
    }

    public String getContactName3() {
        return contactName3;
    }

    public void setContactName3(String contactName3) {
        this.contactName3 = contactName3;
    }

    public String getContactEmail3() {
        return contactEmail3;
    }

    public void setContactEmail3(String contactEmail3) {
        this.contactEmail3 = contactEmail3;
    }

    public String getContactName4() {
        return contactName4;
    }

    public void setContactName4(String contactName4) {
        this.contactName4 = contactName4;
    }

    public String getContactEmail4() {
        return contactEmail4;
    }

    public void setContactEmail4(String contactEmail4) {
        this.contactEmail4 = contactEmail4;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactExt() {
        return contactExt;
    }

    public void setContactExt(String contactExt) {
        this.contactExt = contactExt;
    }

    public String getPacketRequestedInd() {
        return packetRequestedInd;
    }

    public void setPacketRequestedInd(String packetRequestedInd) {
        this.packetRequestedInd = packetRequestedInd;
    }

    public int getPacketQty() {
        return packetQty;
    }

    public void setPacketQty(int packetQty) {
        this.packetQty = packetQty;
    }

    public String getSpanishMatNeededInd() {
        return spanishMatNeededInd;
    }

    public void setSpanishMatNeededInd(String spanishMatNeededInd) {
        this.spanishMatNeededInd = spanishMatNeededInd;
    }

    public int getSpanishMatQty() {
        return spanishMatQty;
    }

    public void setSpanishMatQty(int spanishMatQty) {
        this.spanishMatQty = spanishMatQty;
    }

    public String getStaffedEventConfirmedInd() {
        return staffedEventConfirmedInd;
    }

    public void setStaffedEventConfirmedInd(String staffedEventConfirmedInd) {
        this.staffedEventConfirmedInd = staffedEventConfirmedInd;
    }

    public String getStaffedEventAssocName() {
        return staffedEventAssocName;
    }

    public void setStaffedEventAssocName(String staffedEventAssocName) {
        this.staffedEventAssocName = staffedEventAssocName;
    }

    public String getPresentationInd() {
        return presentationInd;
    }

    public void setPresentationInd(String presentationInd) {
        this.presentationInd = presentationInd;
    }

    public String getRaffleItemInd() {
        return raffleItemInd;
    }

    public void setRaffleItemInd(String raffleItemInd) {
        this.raffleItemInd = raffleItemInd;
    }

    public DateTime getShipDeliverDate() {
        return shipDeliverDate;
    }

    public void setShipDeliverDate(DateTime shipDeliverDate) {
        this.shipDeliverDate = shipDeliverDate;
    }

    public String getShipAddrSeparateInd() {
        return shipAddrSeparateInd;
    }

    public void setShipAddrSeparateInd(String shipAddrSeparateInd) {
        this.shipAddrSeparateInd = shipAddrSeparateInd;
    }

    public EventAddressDto getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(EventAddressDto shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public EventAddressDto getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(EventAddressDto locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationSpecialNotes() {
        return locationSpecialNotes;
    }

    public void setLocationSpecialNotes(String locationSpecialNotes) {
        this.locationSpecialNotes = locationSpecialNotes;
    }

    public int getLocationEmployeeQty() {
        return locationEmployeeQty;
    }

    public void setLocationEmployeeQty(int locationEmployeeQty) {
        this.locationEmployeeQty = locationEmployeeQty;
    }

    public List<EventProductKeyDto> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<EventProductKeyDto> benefits) {
        this.benefits = benefits;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public DateTime getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(DateTime requestedDate) {
        this.requestedDate = requestedDate;
    }
}
