package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/16/2018.
 */
public class GetMemberResultsDto {

    private String subscriberId;
    private long subscriberCk;
    private long memberCk;
    private String memberSuffix;
    private String legacyMemberId;
    private String eyemedMemberId;
    private String clientHealthId;
    private String memberType;
    private String relationshipCode;
    private String relationshipCodeText;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String suffix;
    private String ssn;
    private DateTime dateOfBirth;
    private String gender;
    private AddressDto homeAddress;
    private String homePhoneNumber;
    private String cellPhoneNumber;
    private String workPhoneNumber;
    private String workPhoneNumberExt;
    private String emailAddress;
    private String clientSuppliedEmailAddress;
    private DateTime enrollmentDate;
    private String memberStatus;
    private String groupId;
    private String groupName;
    private String groupCk;
    private String subgroupId;
    private String subgroupName;
    private String subgroupCk;
    private String clientType;
    private DateTime groupEffectiveDate;
    private DateTime groupTermDate;
    private String cardCode;
    private DateTime planEntryDate;
    private String classPlanEnrollBegin;
    private String classPlanEnrollEnd;
    private String classPlanYearBeginMonth;
    private String productId;
    private String productDescription;
    private String subscriberSuffix;
    private List<CoverageDto> coverageHistory;
    private PrivacyDto privacyInfo;
    private List<String> reportingCodes;
    private AdditionalMemberInfoDto additionalMemberInfo;
    private String benefitServiceDate;
    private String token;

    // Added additional parameter private String status;
    private String subscriberLastName;
    private String subscriberFirstName;
    private String subscriberMiddleInitial;
    private boolean hidePrivateData;
    private String networkName;
    private String location;
    private String companyCode;
    private String divisionCode;
    private String benefitOption;
    private String relationship;
    private DateTime effectiveDate;
    private DateTime termDate;
    private boolean cardEnabled;
    private boolean pendingEligibility;
    private String classPlan;
    private String classId;
    private String planId;

    private String clientGroupNbr;
    private boolean memberVoided;
    private boolean enrollDateChg;
    private String underwritingCode;
    private DateTime currentCoverageEffectiveDate;
    private DateTime cardMailDate;
    private String generateIdCard;
    private boolean requestIdCard;

    private List<RelatedMemberDto> relatedMembers;
    private List<EligibilityDto> eligibility;
    private List<MaintenanceDto> memberMaintenance;

    public GetMemberResultsDto(){
        super();
        memberMaintenance = new ArrayList<>();
        eligibility = new ArrayList<>();
        reportingCodes = new ArrayList<>();
        relatedMembers = new ArrayList<>();
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public long getSubscriberCk() {
        return subscriberCk;
    }

    public void setSubscriberCk(long subscriberCk) {
        this.subscriberCk = subscriberCk;
    }

    public long getMemberCk() {
        return memberCk;
    }

    public void setMemberCk(long memberCk) {
        this.memberCk = memberCk;
    }

    public String getMemberSuffix() {
        return memberSuffix;
    }

    public void setMemberSuffix(String memberSuffix) {
        this.memberSuffix = memberSuffix;
    }

    public String getLegacyMemberId() {
        return legacyMemberId;
    }

    public void setLegacyMemberId(String legacyMemberId) {
        this.legacyMemberId = legacyMemberId;
    }

    public String getEyemedMemberId() {
        return eyemedMemberId;
    }

    public void setEyemedMemberId(String eyemedMemberId) {
        this.eyemedMemberId = eyemedMemberId;
    }

    public String getClientHealthId() {
        return clientHealthId;
    }

    public void setClientHealthId(String clientHealthId) {
        this.clientHealthId = clientHealthId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    public String getRelationshipCodeText() {
        return relationshipCodeText;
    }

    public void setRelationshipCodeText(String relationshipCodeText) {
        this.relationshipCodeText = relationshipCodeText;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AddressDto getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(AddressDto homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getWorkPhoneNumberExt() {
        return workPhoneNumberExt;
    }

    public void setWorkPhoneNumberExt(String workPhoneNumberExt) {
        this.workPhoneNumberExt = workPhoneNumberExt;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getClientSuppliedEmailAddress() {
        return clientSuppliedEmailAddress;
    }

    public void setClientSuppliedEmailAddress(String clientSuppliedEmailAddress) {
        this.clientSuppliedEmailAddress = clientSuppliedEmailAddress;
    }

    public DateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(DateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
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

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubgroupId() {
        return subgroupId;
    }

    public void setSubgroupId(String subgroupId) {
        this.subgroupId = subgroupId;
    }

    public String getSubgroupName() {
        return subgroupName;
    }

    public void setSubgroupName(String subgroupName) {
        this.subgroupName = subgroupName;
    }

    public String getSubgroupCk() {
        return subgroupCk;
    }

    public void setSubgroupCk(String subgroupCk) {
        this.subgroupCk = subgroupCk;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public DateTime getGroupEffectiveDate() {
        return groupEffectiveDate;
    }

    public void setGroupEffectiveDate(DateTime groupEffectiveDate) {
        this.groupEffectiveDate = groupEffectiveDate;
    }

    public DateTime getGroupTermDate() {
        return groupTermDate;
    }

    public void setGroupTermDate(DateTime groupTermDate) {
        this.groupTermDate = groupTermDate;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public DateTime getPlanEntryDate() {
        return planEntryDate;
    }

    public void setPlanEntryDate(DateTime planEntryDate) {
        this.planEntryDate = planEntryDate;
    }

    public String getClassPlanEnrollBegin() {
        return classPlanEnrollBegin;
    }

    public void setClassPlanEnrollBegin(String classPlanEnrollBegin) {
        this.classPlanEnrollBegin = classPlanEnrollBegin;
    }

    public String getClassPlanEnrollEnd() {
        return classPlanEnrollEnd;
    }

    public void setClassPlanEnrollEnd(String classPlanEnrollEnd) {
        this.classPlanEnrollEnd = classPlanEnrollEnd;
    }

    public String getClassPlanYearBeginMonth() {
        return classPlanYearBeginMonth;
    }

    public void setClassPlanYearBeginMonth(String classPlanYearBeginMonth) {
        this.classPlanYearBeginMonth = classPlanYearBeginMonth;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSubscriberSuffix() {
        return subscriberSuffix;
    }

    public void setSubscriberSuffix(String subscriberSuffix) {
        this.subscriberSuffix = subscriberSuffix;
    }

    public List<CoverageDto> getCoverageHistory() {
        return coverageHistory;
    }

    public void setCoverageHistory(List<CoverageDto> coverageHistory) {
        this.coverageHistory = coverageHistory;
    }

    public PrivacyDto getPrivacyInfo() {
        return privacyInfo;
    }

    public void setPrivacyInfo(PrivacyDto privacyInfo) {
        this.privacyInfo = privacyInfo;
    }

    public List<String> getReportingCodes() {
        return reportingCodes;
    }

    public void setReportingCodes(List<String> reportingCodes) {
        this.reportingCodes = reportingCodes;
    }

    public AdditionalMemberInfoDto getAdditionalMemberInfo() {
        return additionalMemberInfo;
    }

    public void setAdditionalMemberInfo(AdditionalMemberInfoDto additionalMemberInfo) {
        this.additionalMemberInfo = additionalMemberInfo;
    }

    public String getSubscriberLastName() {
        return subscriberLastName;
    }

    public void setSubscriberLastName(String subscriberLastName) {
        this.subscriberLastName = subscriberLastName;
    }

    public String getSubscriberFirstName() {
        return subscriberFirstName;
    }

    public void setSubscriberFirstName(String subscriberFirstName) {
        this.subscriberFirstName = subscriberFirstName;
    }

    public String getSubscriberMiddleInitial() {
        return subscriberMiddleInitial;
    }

    public void setSubscriberMiddleInitial(String subscriberMiddleInitial) {
        this.subscriberMiddleInitial = subscriberMiddleInitial;
    }

    public boolean isHidePrivateData() {
        return hidePrivateData;
    }

    public void setHidePrivateData(boolean hidePrivateData) {
        this.hidePrivateData = hidePrivateData;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public DateTime getTermDate() {
        return termDate;
    }

    public void setTermDate(DateTime termDate) {
        this.termDate = termDate;
    }

    public boolean isCardEnabled() {
        return cardEnabled;
    }

    public void setCardEnabled(boolean cardEnabled) {
        this.cardEnabled = cardEnabled;
    }

    public boolean isPendingEligibility() {
        return pendingEligibility;
    }

    public void setPendingEligibility(boolean pendingEligibility) {
        this.pendingEligibility = pendingEligibility;
    }

    public String getClassPlan() {
        return classPlan;
    }

    public void setClassPlan(String classPlan) {
        this.classPlan = classPlan;
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



    public String getClientGroupNbr() {
        return clientGroupNbr;
    }

    public void setClientGroupNbr(String clientGroupNbr) {
        this.clientGroupNbr = clientGroupNbr;
    }

    public boolean isMemberVoided() {
        return memberVoided;
    }

    public void setMemberVoided(boolean memberVoided) {
        this.memberVoided = memberVoided;
    }

    public boolean isEnrollDateChg() {
        return enrollDateChg;
    }

    public void setEnrollDateChg(boolean enrollDateChg) {
        this.enrollDateChg = enrollDateChg;
    }

    public String getUnderwritingCode() {
        return underwritingCode;
    }

    public void setUnderwritingCode(String underwritingCode) {
        this.underwritingCode = underwritingCode;
    }

    public DateTime getCurrentCoverageEffectiveDate() {
        return currentCoverageEffectiveDate;
    }

    public void setCurrentCoverageEffectiveDate(DateTime currentCoverageEffectiveDate) {
        this.currentCoverageEffectiveDate = currentCoverageEffectiveDate;
    }

    public DateTime getCardMailDate() {
        return cardMailDate;
    }

    public void setCardMailDate(DateTime cardMailDate) {
        this.cardMailDate = cardMailDate;
    }

    public String getGenerateIdCard() {
        return generateIdCard;
    }

    public void setGenerateIdCard(String generateIdCard) {
        this.generateIdCard = generateIdCard;
    }

    public boolean isRequestIdCard() {
        return requestIdCard;
    }

    public void setRequestIdCard(boolean requestIdCard) {
        this.requestIdCard = requestIdCard;
    }

    public List<RelatedMemberDto> getRelatedMembers() {
        return relatedMembers;
    }

    public void setRelatedMembers(List<RelatedMemberDto> relatedMembers) {
        this.relatedMembers = relatedMembers;
    }

    public List<EligibilityDto> getEligibility() {
        return eligibility;
    }

    public void setEligibility(List<EligibilityDto> eligibility) {
        this.eligibility = eligibility;
    }

    public List<MaintenanceDto> getMemberMaintenance() {
        return memberMaintenance;
    }

    public void setMemberMaintenance(List<MaintenanceDto> memberMaintenance) {
        this.memberMaintenance = memberMaintenance;
    }

    public String getBenefitServiceDate() {
        return benefitServiceDate;
    }

    public void setBenefitServiceDate(String benefitServiceDate) {
        this.benefitServiceDate = benefitServiceDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
