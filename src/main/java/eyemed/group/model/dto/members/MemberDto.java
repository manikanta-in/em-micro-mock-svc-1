package eyemed.group.model.dto.members;

import eyemed.group.model.dto.CodeDataDto;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/8/2018.
 */
public class MemberDto {

    private String subscriberId, subscriberCK, subscriberSuffix, memberCK, memberSuffix, legacyMemberId, clientMemberId,clientHealthId,memberType,
             firstName, middleInitial, lastName, suffix,ssn, gender, relationshipCode, relationshipDescription,
             status, clientType, homePhone, homeExtension, cellPhone, workPhone, workExtension,email, clientEmail,
             parentGroupId, parentGroupName,groupId, groupName, groupCk, subgroupId, subgroupName, subgroupCk, productId, productDescription,
             classPlanEnrollBegin, classPlanEnrollEnd, classPlanYearBeginMonth,accountManagerId, outOfNetworkFormName,
             underwriterName, reportingFieldText, eligibilityPhoneNumber,cardMemberWebURL, cardMemberIdDisplay, cardGroupNameDisplay, cardCode, generateIdCard;
    private DateTime dateOfBirth, enrollmentDate, effectiveDate, terminationDate,
            groupEffectiveDate, groupTerminationDate, subGroupEffectiveDate,subGroupTerminationDate,planEntryDate, previousEffectiveDate, previousTerminationDate, cardMailedDate;
    private CodeDataDto ethnicity, race, spokenLanguage, writtenLanguage;
    private boolean cardEnabled, ivrEnabled, eobEnabled, languageAssistanceEnabled,electronicEOBAllowed, paperEOBRequired, onlineEOBSelected,
            memberVoided,dependentMemberVoided,pendingEligibility,effDateChanged,termDateChanged, enrollDateChgAllowed,requestIdCard;

    private AddressDto address;
    private PrivacyDto privacy;
    private ReportingCodesDto reportingCodes;
    private List<CoverageDto> coverage;
    private List<MaintenanceDto> maintenance;
    private List<EligibilityDto> eligibility;
    private List<RelatedMemberServiceDto> family;
    private List<LatestFamilyCoverageDates> latestFamilyCoverageDates;

    public MemberDto() {
        super();
        this.coverage    = new ArrayList<CoverageDto>();
        this.maintenance = new ArrayList<MaintenanceDto>();
        this.eligibility = new ArrayList<EligibilityDto>();
        this.family = new ArrayList<RelatedMemberServiceDto>();
        this.latestFamilyCoverageDates = new ArrayList<>();
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberCK() {
        return subscriberCK;
    }

    public void setSubscriberCK(String subscriberCK) {
        this.subscriberCK = subscriberCK;
    }

    public String getSubscriberSuffix() {
        return subscriberSuffix;
    }

    public void setSubscriberSuffix(String subscriberSuffix) {
        this.subscriberSuffix = subscriberSuffix;
    }

    public String getMemberCK() {
        return memberCK;
    }

    public void setMemberCK(String memberCK) {
        this.memberCK = memberCK;
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

    public String getClientMemberId() {
        return clientMemberId;
    }

    public void setClientMemberId(String clientMemberId) {
        this.clientMemberId = clientMemberId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getHomeExtension() {
        return homeExtension;
    }

    public void setHomeExtension(String homeExtension) {
        this.homeExtension = homeExtension;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getWorkExtension() {
        return workExtension;
    }

    public void setWorkExtension(String workExtension) {
        this.workExtension = workExtension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
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

    public String getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public String getOutOfNetworkFormName() {
        return outOfNetworkFormName;
    }

    public void setOutOfNetworkFormName(String outOfNetworkFormName) {
        this.outOfNetworkFormName = outOfNetworkFormName;
    }

    public String getUnderwriterName() {
        return underwriterName;
    }

    public void setUnderwriterName(String underwriterName) {
        this.underwriterName = underwriterName;
    }

    public String getReportingFieldText() {
        return reportingFieldText;
    }

    public void setReportingFieldText(String reportingFieldText) {
        this.reportingFieldText = reportingFieldText;
    }

    public String getEligibilityPhoneNumber() {
        return eligibilityPhoneNumber;
    }

    public void setEligibilityPhoneNumber(String eligibilityPhoneNumber) {
        this.eligibilityPhoneNumber = eligibilityPhoneNumber;
    }

    public String getCardMemberWebURL() {
        return cardMemberWebURL;
    }

    public void setCardMemberWebURL(String cardMemberWebURL) {
        this.cardMemberWebURL = cardMemberWebURL;
    }

    public String getCardMemberIdDisplay() {
        return cardMemberIdDisplay;
    }

    public void setCardMemberIdDisplay(String cardMemberIdDisplay) {
        this.cardMemberIdDisplay = cardMemberIdDisplay;
    }

    public String getCardGroupNameDisplay() {
        return cardGroupNameDisplay;
    }

    public void setCardGroupNameDisplay(String cardGroupNameDisplay) {
        this.cardGroupNameDisplay = cardGroupNameDisplay;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public DateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(DateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
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

    public DateTime getGroupEffectiveDate() {
        return groupEffectiveDate;
    }

    public void setGroupEffectiveDate(DateTime groupEffectiveDate) {
        this.groupEffectiveDate = groupEffectiveDate;
    }

    public DateTime getGroupTerminationDate() {
        return groupTerminationDate;
    }

    public void setGroupTerminationDate(DateTime groupTerminationDate) {
        this.groupTerminationDate = groupTerminationDate;
    }

    public DateTime getSubGroupEffectiveDate() {
        return subGroupEffectiveDate;
    }

    public void setSubGroupEffectiveDate(DateTime subGroupEffectiveDate) {
        this.subGroupEffectiveDate = subGroupEffectiveDate;
    }

    public DateTime getSubGroupTerminationDate() {
        return subGroupTerminationDate;
    }

    public void setSubGroupTerminationDate(DateTime subGroupTerminationDate) {
        this.subGroupTerminationDate = subGroupTerminationDate;
    }

    public DateTime getPlanEntryDate() {
        return planEntryDate;
    }

    public void setPlanEntryDate(DateTime planEntryDate) {
        this.planEntryDate = planEntryDate;
    }

    public DateTime getPreviousEffectiveDate() {
        return previousEffectiveDate;
    }

    public void setPreviousEffectiveDate(DateTime previousEffectiveDate) {
        this.previousEffectiveDate = previousEffectiveDate;
    }

    public DateTime getPreviousTerminationDate() {
        return previousTerminationDate;
    }

    public void setPreviousTerminationDate(DateTime previousTerminationDate) {
        this.previousTerminationDate = previousTerminationDate;
    }

    public DateTime getCardMailedDate() {
        return cardMailedDate;
    }

    public void setCardMailedDate(DateTime cardMailedDate) {
        this.cardMailedDate = cardMailedDate;
    }


    public boolean isCardEnabled() {
        return cardEnabled;
    }

    public void setCardEnabled(boolean cardEnabled) {
        this.cardEnabled = cardEnabled;
    }

    public boolean isIvrEnabled() {
        return ivrEnabled;
    }

    public void setIvrEnabled(boolean ivrEnabled) {
        this.ivrEnabled = ivrEnabled;
    }

    public boolean isEobEnabled() {
        return eobEnabled;
    }

    public void setEobEnabled(boolean eobEnabled) {
        this.eobEnabled = eobEnabled;
    }

    public boolean isLanguageAssistanceEnabled() {
        return languageAssistanceEnabled;
    }

    public void setLanguageAssistanceEnabled(boolean languageAssistanceEnabled) {
        this.languageAssistanceEnabled = languageAssistanceEnabled;
    }

    public boolean isElectronicEOBAllowed() {
        return electronicEOBAllowed;
    }

    public void setElectronicEOBAllowed(boolean electronicEOBAllowed) {
        this.electronicEOBAllowed = electronicEOBAllowed;
    }

    public boolean isPaperEOBRequired() {
        return paperEOBRequired;
    }

    public void setPaperEOBRequired(boolean paperEOBRequired) {
        this.paperEOBRequired = paperEOBRequired;
    }

    public boolean isOnlineEOBSelected() {
        return onlineEOBSelected;
    }

    public void setOnlineEOBSelected(boolean onlineEOBSelected) {
        this.onlineEOBSelected = onlineEOBSelected;
    }

    public boolean isMemberVoided() {
        return memberVoided;
    }

    public void setMemberVoided(boolean memberVoided) {
        this.memberVoided = memberVoided;
    }

    public boolean isDependentMemberVoided() {
        return dependentMemberVoided;
    }

    public void setDependentMemberVoided(boolean dependentMemberVoided) {
        this.dependentMemberVoided = dependentMemberVoided;
    }

    public boolean isPendingEligibility() {
        return pendingEligibility;
    }

    public void setPendingEligibility(boolean pendingEligibility) {
        this.pendingEligibility = pendingEligibility;
    }

    public boolean isEffDateChanged() {
        return effDateChanged;
    }

    public void setEffDateChanged(boolean effDateChanged) {
        this.effDateChanged = effDateChanged;
    }

    public boolean isTermDateChanged() {
        return termDateChanged;
    }

    public void setTermDateChanged(boolean termDateChanged) {
        this.termDateChanged = termDateChanged;
    }

    public boolean isEnrollDateChgAllowed() {
        return enrollDateChgAllowed;
    }

    public void setEnrollDateChgAllowed(boolean enrollDateChgAllowed) {
        this.enrollDateChgAllowed = enrollDateChgAllowed;
    }

    public CodeDataDto getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(CodeDataDto ethnicity) {
        this.ethnicity = ethnicity;
    }

    public CodeDataDto getRace() {
        return race;
    }

    public void setRace(CodeDataDto race) {
        this.race = race;
    }

    public CodeDataDto getSpokenLanguage() {
        return spokenLanguage;
    }

    public void setSpokenLanguage(CodeDataDto spokenLanguage) {
        this.spokenLanguage = spokenLanguage;
    }

    public CodeDataDto getWrittenLanguage() {
        return writtenLanguage;
    }

    public void setWrittenLanguage(CodeDataDto writtenLanguage) {
        this.writtenLanguage = writtenLanguage;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public PrivacyDto getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyDto privacy) {
        this.privacy = privacy;
    }

    public ReportingCodesDto getReportingCodes() {
        return reportingCodes;
    }

    public void setReportingCodes(ReportingCodesDto reportingCodes) {
        this.reportingCodes = reportingCodes;
    }

    public List<CoverageDto> getCoverage() {
        return coverage;
    }

    public void setCoverage(List<CoverageDto> coverage) {
        this.coverage = coverage;
    }

    public List<MaintenanceDto> getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(List<MaintenanceDto> maintenance) {
        this.maintenance = maintenance;
    }

    public List<EligibilityDto> getEligibility() {
        return eligibility;
    }

    public void setEligibility(List<EligibilityDto> eligibility) {
        this.eligibility = eligibility;
    }

    public List<RelatedMemberServiceDto> getFamily() {
        return family;
    }

    public void setFamily(List<RelatedMemberServiceDto> family) {
        this.family = family;
    }

    public List<LatestFamilyCoverageDates> getLatestFamilyCoverageDates() {
        return latestFamilyCoverageDates;
    }

    public void setLatestFamilyCoverageDates(List<LatestFamilyCoverageDates> latestFamilyCoverageDates) {
        this.latestFamilyCoverageDates = latestFamilyCoverageDates;
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
}
