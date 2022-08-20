package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class ResultDto implements Serializable {

    private String groupCk;
    private String clientId;
    private String groupId;
    private String parentGroupCk;
    private String groupName;
    private String groupStatus;
    private String groupMctrType;
    private DateTime effectiveDate;
    private DateTime terminationDate;
    private AddressDto address;

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getClientId() { return clientId; }

    public void setClientId(String clientId) { this.clientId = clientId; }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getParentGroupCk() { return parentGroupCk; }

    public void setParentGroupCk(String parentGroupCk) { this.parentGroupCk = parentGroupCk; }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getGroupMctrType() { return groupMctrType; }

    public void setGroupMctrType(String groupMctrType) { this.groupMctrType = groupMctrType; }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public DateTime getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(DateTime terminationDate) {
        this.terminationDate = terminationDate;
    }

    public AddressDto getAddress() { return address; }

    public void setAddress(AddressDto address) { this.address = address; }

}
