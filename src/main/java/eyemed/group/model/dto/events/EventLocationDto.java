package eyemed.group.model.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class EventLocationDto {
    private int eventLocationId;
    private int parentGroupCk;
    private String locationName;
    private EventAddressDto locationAddress = new EventAddressDto();
    private int employeeQuantity;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
    private String contactExt;
    private String multilingualIndicator;
    private String updatedBy;
    private Date updatedDate;
    private String createdBy;
    private Date createdDate;

    public int getEventLocationId() {
        return eventLocationId;
    }

    public void setEventLocationId(int eventLocationId) {
        this.eventLocationId = eventLocationId;
    }

    public int getParentGroupCk() {
        return parentGroupCk;
    }

    public void setParentGroupCk(int parentGroupCk) {
        this.parentGroupCk = parentGroupCk;
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

    public void setLocationAddress(EventAddressDto location) {
        this.locationAddress = location;
    }

    public int getEmployeeQuantity() {
        return employeeQuantity;
    }

    public void setEmployeeQuantity(int employeeQuantity) {
        this.employeeQuantity = employeeQuantity;
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

    public String getMultilingualIndicator() {
        return multilingualIndicator;
    }

    public void setMultilingualIndicator(String multilingualIndicator) {
        this.multilingualIndicator = multilingualIndicator;
    }

    @JsonIgnore
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonIgnore
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @JsonIgnore
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonIgnore
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
