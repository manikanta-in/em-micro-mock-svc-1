package eyemed.group.model.dto.groups.maintenance;



import java.io.Serializable;

public class ParentGroupDto implements Serializable {

    private String clientId;
    private String parentGroupCk;
    private String parentGroupId;
    private String parentGroupName;
    private String parentGroupMctrType;
    private AddressDto address;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getParentGroupCk() { return parentGroupCk; }

    public void setParentGroupCk(String parentGroupCk) { this.parentGroupCk = parentGroupCk; }

    public String getParentGroupId() { return parentGroupId; }

    public void setParentGroupId(String parentGroupId) { this.parentGroupId = parentGroupId; }

    public String getParentGroupName() { return parentGroupName; }

    public void setParentGroupName(String parentGroupName) { this.parentGroupName = parentGroupName; }

    public String getParentGroupMctrType() { return parentGroupMctrType; }

    public void setParentGroupMctrType(String parentGroupMctrType) { this.parentGroupMctrType = parentGroupMctrType; }

    public AddressDto getAddress() { return address; }

    public void setAddress(AddressDto address) { this.address = address; }
}
