package eyemed.group.model.dto.groups.maintenance;

import java.io.Serializable;

public class BillingContactDto implements Serializable {
    private String atSystemId;
    private String description;
    private String billingContactName;
    private AddressDto address;

    public String getAtSystemId() {
        return atSystemId;
    }

    public void setAtSystemId(String atSystemId) {
        this.atSystemId = atSystemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingContactName() {
        return billingContactName;
    }

    public void setBillingContactName(String billingContactName) {
        this.billingContactName = billingContactName;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
