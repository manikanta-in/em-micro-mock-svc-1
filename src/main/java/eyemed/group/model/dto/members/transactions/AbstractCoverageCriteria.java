package eyemed.group.model.dto.members.transactions;

import eyemed.group.model.dto.members.ReportingCodesDto;

/**
 * Created by c09368 on 12/14/2018.
 */
public class AbstractCoverageCriteria {
    private String fileBoundId;
    private String memberCk;
    private String subscriberCk;
    private String groupCk;
    private String subGroupCk;
    private String classId;
    private String planId;
    private String divisionCode;
    private String benefitOption;
    private String locationCode;
    private String companyCode;
    private ReportingCodesDto reportingCodes;
    private String memberType;
    private boolean memberVoided;
    private boolean subGroupChg;

    public AbstractCoverageCriteria(){
        super();
    }

    public String getFileBoundId() {
        return fileBoundId;
    }

    public void setFileBoundId(String fileBoundId) {
        this.fileBoundId = fileBoundId;
    }

    public String getMemberCk() {
        return memberCk;
    }

    public void setMemberCk(String memberCk) {
        this.memberCk = memberCk;
    }

    public String getSubscriberCk() {
        return subscriberCk;
    }

    public void setSubscriberCk(String subscriberCk) {
        this.subscriberCk = subscriberCk;
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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getBenefitOption() {
        return benefitOption;
    }

    public void setBenefitOption(String benefitOption) {
        this.benefitOption = benefitOption;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public ReportingCodesDto getReportingCodes() {
        return reportingCodes;
    }

    public void setReportingCodes(ReportingCodesDto reportingCodes) {
        this.reportingCodes = reportingCodes;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public boolean isMemberVoided() {
        return memberVoided;
    }

    public void setMemberVoided(boolean memberVoided) {
        this.memberVoided = memberVoided;
    }

    public boolean isSubGroupChg() {
        return subGroupChg;
    }

    public void setSubGroupChg(boolean subGroupChg) {
        this.subGroupChg = subGroupChg;
    }
}
