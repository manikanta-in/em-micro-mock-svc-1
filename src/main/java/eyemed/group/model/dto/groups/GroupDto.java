package eyemed.group.model.dto.groups;

import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by c09368 on 10/1/2018.
 */
public class GroupDto {
    private String groupId;
    private String groupName;
    private String groupAlias;
    private String groupCk;
    private String groupStatus;
    private String parentGroupCk;
    private String parentGroupId;
    private String parentGroupName;
    private String primaryContact;
    private String accountManagerName;
    private String accountManagerPhone;
    private String accountManagerEmail;
    private String accountManagerFax;
    private DateTime effectiveDate;
    private DateTime terminationDate;
    private String memberIdSource;
    private List<SubGroupDto> subGroups;

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

    public String getGroupAlias() {
        return groupAlias;
    }

    public void setGroupAlias(String groupAlias) {
        this.groupAlias = groupAlias;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getParentGroupCk() { return parentGroupCk; }

    public void setParentGroupCk(String parentGroupCk) { this.parentGroupCk = parentGroupCk; }

    public String getParentGroupId() { return parentGroupId; }

    public void setParentGroupId(String parentGroupId) { this.parentGroupId = parentGroupId; }

    public String getParentGroupName() { return parentGroupName; }

    public void setParentGroupName(String parentGroupName) { this.parentGroupName = parentGroupName; }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getAccountManagerName() {
        return accountManagerName;
    }

    public void setAccountManagerName(String accountManagerName) {
        this.accountManagerName = accountManagerName;
    }

    public String getAccountManagerPhone() {
        return accountManagerPhone;
    }

    public void setAccountManagerPhone(String accountManagerPhone) {
        this.accountManagerPhone = accountManagerPhone;
    }

    public String getAccountManagerEmail() {
        return accountManagerEmail;
    }

    public void setAccountManagerEmail(String accountManagerEmail) {
        this.accountManagerEmail = accountManagerEmail;
    }

    public String getAccountManagerFax() {
        return accountManagerFax;
    }

    public void setAccountManagerFax(String accountManagerFax) {
        this.accountManagerFax = accountManagerFax;
    }

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

    public String getMemberIdSource() {
        return memberIdSource;
    }

    public void setMemberIdSource(String memberIdSource) {
        this.memberIdSource = memberIdSource;
    }

    public List<SubGroupDto> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(List<SubGroupDto> subGroups) {
        this.subGroups = subGroups;
    }
}
