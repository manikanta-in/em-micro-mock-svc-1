package eyemed.group.model.dto.users;

import java.io.Serializable;

public class UserSearchRequestDto implements Serializable {
    private String userId;
    private String groupId;
    private String groupName;
    private String groupCk;
    private String subGroupCk;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private String createdBy;
    private String modifiedBy;
    private String createdDateSearchStart;
    private String createdDateSearchEnd;
    private String modifiedDateSearchStart;
    private String modifiedDateSearchEnd;
    private boolean relatedUsersRequired;
    private boolean requiredUserProfileOnly;
    private boolean userIdWildCardSearch;
    private String externalUserId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public boolean isRelatedUsersRequired() {
        return relatedUsersRequired;
    }

    public void setRelatedUsersRequired(boolean relatedUsersRequired) {
        this.relatedUsersRequired = relatedUsersRequired;
    }

    public boolean isRequiredUserProfileOnly() {
        return requiredUserProfileOnly;
    }

    public void setRequiredUserProfileOnly(boolean requiredUserProfileOnly) {
        this.requiredUserProfileOnly = requiredUserProfileOnly;
    }

    public boolean isUserIdWildCardSearch() {
        return userIdWildCardSearch;
    }

    public void setUserIdWildCardSearch(boolean userIdWildCardSearch) {
        this.userIdWildCardSearch = userIdWildCardSearch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getCreatedDateSearchStart() {
        return createdDateSearchStart;
    }

    public void setCreatedDateSearchStart(String createdDateSearchStart) {
        this.createdDateSearchStart = createdDateSearchStart;
    }

    public String getCreatedDateSearchEnd() {
        return createdDateSearchEnd;
    }

    public void setCreatedDateSearchEnd(String createdDateSearchEnd) {
        this.createdDateSearchEnd = createdDateSearchEnd;
    }

    public String getModifiedDateSearchStart() {
        return modifiedDateSearchStart;
    }

    public void setModifiedDateSearchStart(String modifiedDateSearchStart) {
        this.modifiedDateSearchStart = modifiedDateSearchStart;
    }

    public String getModifiedDateSearchEnd() {
        return modifiedDateSearchEnd;
    }

    public void setModifiedDateSearchEnd(String modifiedDateSearchEnd) {
        this.modifiedDateSearchEnd = modifiedDateSearchEnd;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }
}
