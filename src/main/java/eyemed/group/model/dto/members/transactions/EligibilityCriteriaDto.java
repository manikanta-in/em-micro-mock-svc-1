package eyemed.group.model.dto.members.transactions;

import eyemed.group.model.dto.BaseRequest;
import eyemed.group.model.dto.members.RelatedMemberServiceDto;
import eyemed.group.model.dto.members.ReportingCodesDto;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Criteria for a void or reinstate request.
 * Scenario 1: flagChange + 1 item in list. [ term/eff/subGroup change flag ]
 * @author Vijayakumar Ramaswamy
 * @since 11/19/2018
 */
public class EligibilityCriteriaDto extends BaseRequest implements Serializable {

    private List<MemberEligibleDto> eligibility;
    private boolean effDateChanged, termDateChanged, subscriberVoided, dependentVoided, subGroupChanged, addCoverage, completeVoid, reportingCodesOnly, reinstateOnly ,subGroupTermed;
    private String previousClassId, previousClassPlanId, previousSubGroupCK, subscriberId, memberType;
    private String fileBoundID, fileTrackerNo;
    private DateTime previousSubGroupTermDate;
    private List<String> terminateMemberCK;
    private ReportingCodesDto reportingCodesDto;
    private List<RelatedMemberServiceDto> family;

    public EligibilityCriteriaDto() {
        super();
        this.eligibility = new ArrayList<MemberEligibleDto>();
        this.terminateMemberCK = new ArrayList<String>();
        this.family = new ArrayList<>();
    }

    public List<MemberEligibleDto> getEligibility() { return eligibility; }

    public void setEligibility(List<MemberEligibleDto> eligibility) { this.eligibility = eligibility; }

    public boolean isEffDateChanged() { return effDateChanged; }

    public void setEffDateChanged(boolean effDateChanged) { this.effDateChanged = effDateChanged; }

    public boolean isTermDateChanged() { return termDateChanged; }

    public void setTermDateChanged(boolean termDateChanged) { this.termDateChanged = termDateChanged; }

    public boolean isSubscriberVoided() { return subscriberVoided; }

    public void setSubscriberVoided(boolean subscriberVoided) { this.subscriberVoided = subscriberVoided; }

    public boolean isDependentVoided() { return dependentVoided; }

    public void setDependentVoided(boolean dependentVoided) { this.dependentVoided = dependentVoided; }

    public boolean isSubGroupChanged() {
        return subGroupChanged;
    }

    public void setSubGroupChanged(boolean subGroupChanged) {
        this.subGroupChanged = subGroupChanged;
    }

    public boolean isCompleteVoid() {
        return completeVoid;
    }

    public void setCompleteVoid(boolean completeVoid) {
        this.completeVoid = completeVoid;
    }

    public boolean isReportingCodesOnly() {
        return reportingCodesOnly;
    }

    public void setReportingCodesOnly(boolean reportingCodesOnly) {
        this.reportingCodesOnly = reportingCodesOnly;
    }

    public String getPreviousClassId() { return previousClassId; }

    public void setPreviousClassId(String previousClassId) { this.previousClassId = previousClassId; }

    public String getPreviousClassPlanId() { return previousClassPlanId; }

    public void setPreviousClassPlanId(String previousClassPlanId) { this.previousClassPlanId = previousClassPlanId; }

    public String getPreviousSubGroupCK() { return previousSubGroupCK; }

    public void setPreviousSubGroupCK(String previousSubGroupCK) { this.previousSubGroupCK = previousSubGroupCK; }

    public List<String> getTerminateMemberCK() { return terminateMemberCK; }

    public void setTerminateMemberCK(List<String> terminateMemberCK) { this.terminateMemberCK = terminateMemberCK; }

    public String getSubscriberId() { return subscriberId; }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setSubscriberId(String subscriberId) { this.subscriberId = subscriberId; }

    public boolean isAddCoverage() {
        return addCoverage;
    }

    public void setAddCoverage(boolean addCoverage) {
        this.addCoverage = addCoverage;
    }

    public ReportingCodesDto getReportingCodesDto() {
        return reportingCodesDto;
    }

    public void setReportingCodesDto(ReportingCodesDto reportingCodesDto) {
        this.reportingCodesDto = reportingCodesDto;
    }

    public List<RelatedMemberServiceDto> getFamily() {
        return family;
    }

    public void setFamily(List<RelatedMemberServiceDto> family) {
        this.family = family;
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

    public boolean isReinstateOnly() {
        return reinstateOnly;
    }

    public void setReinstateOnly(boolean reinstateOnly) {
        this.reinstateOnly = reinstateOnly;
    }

    public boolean isSubGroupTermed() {
        return subGroupTermed;
    }

    public void setSubGroupTermed(boolean subGroupTermed) {
        this.subGroupTermed = subGroupTermed;
    }

    public DateTime getPreviousSubGroupTermDate() {
        return previousSubGroupTermDate;
    }

    public void setPreviousSubGroupTermDate(DateTime previousSubGroupTermDate) {
        this.previousSubGroupTermDate = previousSubGroupTermDate;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString( this );
    }
}