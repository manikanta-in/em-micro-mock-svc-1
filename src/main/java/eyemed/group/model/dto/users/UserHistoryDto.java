package eyemed.group.model.dto.users;

import java.io.Serializable;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 10/15/18
 */

public class UserHistoryDto implements Serializable {

    private static final long serialVersionUID = 3425124341086578798L;
    private String clientId;
    private String firstName;
    private String lastName;
    private String email;
    private String recordType;
    private String groupId;
    private String subGroupId;
    private String groupCk;
    private String subGroupCk;
    private String groupName;
    private String subGroupName;
    private String access;
    private String accessAction;
    private String manageUserRole;
    private String modifiedUser;
    private String modifiedDate;

    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecordType() {
        return recordType;
    }
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
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

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccessAction() {
        return accessAction;
    }

    public void setAccessAction(String accessAction) {
        this.accessAction = accessAction;
    }

    public String getManageUserRole() {
        return manageUserRole;
    }

    public void setManageUserRole(String manageUserRole) {
        this.manageUserRole = manageUserRole;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
