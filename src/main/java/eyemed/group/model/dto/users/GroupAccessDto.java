package eyemed.group.model.dto.users;

import java.io.Serializable;

public class GroupAccessDto implements Serializable {
    private Long parentGroupCk;
    private String parentGroupId;
    private String parentGroupName;
    private Long groupCk;
    private String groupId;
    private Long subGroupCk;
    private String subGroupId;
    private String groupName;
    private String subGroupName;
    private String groupEffectiveDate;
    private String groupTerminationDate;
    private String subGroupEffectiveDate;
    private String subGroupTerminationDate;
    private String status;
    private AccessDto access;

    public GroupAccessDto() {}

    public GroupAccessDto(GroupAccessDto group) {
        this.parentGroupCk = group.getParentGroupCk();
        this.parentGroupId = group.getParentGroupId();
        this.parentGroupName = group.getParentGroupName();
        this.groupCk = group.getGroupCk();
        this.groupId = group.groupId;
        this.subGroupCk = group.getSubGroupCk();
        this.subGroupId = group.getSubGroupId();
        this.groupName = group.getGroupName();
        this.subGroupName = group.getSubGroupName();
        this.groupEffectiveDate = group.getGroupEffectiveDate();
        this.groupTerminationDate = group.getGroupTerminationDate();
        this.subGroupEffectiveDate = group.getSubGroupEffectiveDate();
        this.subGroupTerminationDate = group.getSubGroupTerminationDate();
        this.status = group.getStatus();
        this.access = group.getAccess();
    }

    public Long getParentGroupCk() {
        return parentGroupCk;
    }

    public void setParentGroupCk(Long parentGroupCk) {
        this.parentGroupCk = parentGroupCk;
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public String getParentGroupName() {
        return parentGroupName;
    }

    public void setParentGroupName(String parentGroupName) {
        this.parentGroupName = parentGroupName;
    }

    public Long getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(Long groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(Long subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public String getSubGroupEffectiveDate() {
        return subGroupEffectiveDate;
    }

    public void setSubGroupEffectiveDate(String subGroupEffectiveDate) {
        this.subGroupEffectiveDate = subGroupEffectiveDate;
    }

    public String getSubGroupTerminationDate() {
        return subGroupTerminationDate;
    }

    public void setSubGroupTerminationDate(String subGroupTerminationDate) {
        this.subGroupTerminationDate = subGroupTerminationDate;
    }

    public String getGroupEffectiveDate() {
        return groupEffectiveDate;
    }

    public void setGroupEffectiveDate(String groupEffectiveDate) {
        this.groupEffectiveDate = groupEffectiveDate;
    }

    public String getGroupTerminationDate() {
        return groupTerminationDate;
    }

    public void setGroupTerminationDate(String groupTerminationDate) {
        this.groupTerminationDate = groupTerminationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccessDto getAccess() {
        return access;
    }

    public void setAccess(AccessDto access) {
        this.access = access;
    }
}
