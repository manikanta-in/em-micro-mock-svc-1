package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class GroupDto implements Serializable {

    private String clientId;
    private String groupCk;
    private String groupId;
    private String groupName;
    private String groupStatus;
    private String groupMctrType;
    private String billLevel;
    private String parentGroupId;
    private String classId;
    private DateTime groupEffectiveDate;
    private DateTime groupTerminationDate;
    private String groupMctrTermReason;
    private AddressDto address;
    private List<SubGroupDto> subgroups;
    private List<ClassDto> classes;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getGroupCk() { return groupCk; }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

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

    public String getGroupMctrType() {
        return groupMctrType;
    }

    public void setGroupMctrType(String groupMctrType) {
        this.groupMctrType = groupMctrType;
    }

    public String getBillLevel() {
        return billLevel;
    }

    public void setBillLevel(String billLevel) {
        this.billLevel = billLevel;
    }

    public String getParentGroupId() { return parentGroupId; }

    public void setParentGroupId(String parentGroupId) { this.parentGroupId = parentGroupId; }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public DateTime getGroupEffectiveDate() {
        return groupEffectiveDate;
    }

    public void setGroupEffectiveDate(DateTime groupEffectiveDate) {
        this.groupEffectiveDate = groupEffectiveDate;
    }

    public DateTime getGroupTerminationDate() {
        return groupTerminationDate;
    }

    public void setGroupTerminationDate(DateTime groupTerminationDate) { this.groupTerminationDate = groupTerminationDate; }

    public String getGroupMctrTermReason() { return groupMctrTermReason; }

    public void setGroupMctrTermReason(String groupMctrTermReason) { this.groupMctrTermReason = groupMctrTermReason; }

    public AddressDto getAddress() { return address; }

    public void setAddress(AddressDto address) { this.address = address; }

    public List<SubGroupDto> getSubgroups() { return subgroups; }

    public void setSubgroups(List<SubGroupDto> subgroups) {
        this.subgroups = subgroups;
    }

    public List<ClassDto> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassDto> classes) {
        this.classes = classes;
    }
}
