package eyemed.group.model.dto.members.transactions;

import java.io.Serializable;

/**
 * Encapsulates the data for a save request.
 *
 * @author Vijayakumar Ramaswamy
 * @since 11/19/2018
 */
public class SaveCriteriaDto implements Serializable {
    private String systemName, actionType, memberType, fileBoundID, fileTrackerNo, memberIdSource;
    private boolean updatedID, subscriberMemberVoided, dependentMemberVoided, originalEffectiveDateChange ,subGroupTermed;
    private MemberDemographicsDto member;
    private MemberEligibleDto eligibility;

    public SaveCriteriaDto() {
        this.memberIdSource = "CS";
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getFileBoundID() {
        return fileBoundID;
    }

    public void setFileBoundID(String fileBoundID) {
        this.fileBoundID = fileBoundID;
    }

    public String getFileTrackerNo() {
        return fileTrackerNo;
    }

    public void setFileTrackerNo(String fileTrackerNo) {
        this.fileTrackerNo = fileTrackerNo;
    }

    public String getMemberIdSource() {
        return memberIdSource;
    }

    public void setMemberIdSource(String memberIdSource) {
        this.memberIdSource = memberIdSource;
    }

    public boolean isUpdatedID() { return updatedID; }

    public void setUpdatedID(boolean updatedID) { this.updatedID = updatedID; }

    public boolean isSubscriberMemberVoided() { return subscriberMemberVoided; }

    public void setSubscriberMemberVoided(boolean subscriberMemberVoided) { this.subscriberMemberVoided = subscriberMemberVoided; }

    public boolean isDependentMemberVoided() { return dependentMemberVoided; }

    public void setDependentMemberVoided(boolean dependentMemberVoided) { this.dependentMemberVoided = dependentMemberVoided; }

    public boolean isOriginalEffectiveDateChange() { return originalEffectiveDateChange; }

    public void setOriginalEffectiveDateChange(boolean originalEffectiveDateChange) { this.originalEffectiveDateChange = originalEffectiveDateChange; }

    public MemberDemographicsDto getMember() { return member; }

    public void setMember(MemberDemographicsDto member) { this.member = member; }

    public MemberEligibleDto getEligibility() {
        return eligibility;
    }

    public void setEligibility(MemberEligibleDto eligibility) {
        this.eligibility = eligibility;
    }

    public boolean isSubGroupTermed() {
        return subGroupTermed;
    }

    public void setSubGroupTermed(boolean subGroupTermed) {
        this.subGroupTermed = subGroupTermed;
    }
}