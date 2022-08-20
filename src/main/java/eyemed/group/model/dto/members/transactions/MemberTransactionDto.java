package eyemed.group.model.dto.members.transactions;

import eyemed.group.model.dto.CodeDataDto;
import eyemed.group.model.dto.members.AddressDto;
import eyemed.group.model.dto.members.CoverageDto;
import eyemed.group.model.dto.members.PrivacyDto;
import eyemed.group.model.dto.members.ReportingCodesDto;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 11/14/2018
 */

public class MemberTransactionDto  implements Serializable {
    //Transaction related
    private String transactionType; //add or hold
    private Long transactionId;
    private ArrayList<String> listOfTransactionId; //for delete
    private DateTime memberDateOfBirth;
    private String statusDate,createdDate,modifiedDate;

    private String transactionUserRole;
    private String fileBoundId;
    private String notes;
    private String action;
    private String saveAction;
    private String status;

    private String statusUpdateByFirstName;     //firstName
    private String statusUpdateByFullName; //full Name

    private String createdBy;
    private String modifiedBy;

    //Member related
    private String memberType;   //subscriber or dependent
    private String eyemedMemberId;
    private String clientHealthId;
    private String memberCk;
    private String subscriberCk;
    private String subscriberMemberCk;

    private String memberFirstName;
    private String memberLastName;
    private String memberShortName;
    private String memberNameSuffix;
    private String memberMidInitial;
    private String relationship;
    private String gender;
    private String ssn;
    private String phone;
    private String email;
    private String memberIdSource;

    private AddressDto primaryAddress;
    private CoverageDto coverage;
    private ReportingCodesDto reportingCodes;
    private PrivacyDto privacy;
    private CodeDataDto ethnicity, race, spokenLanguage, writtenLanguage;

    private String groupCk;
    private String subGroupCk;

    private boolean origEffDateChange;

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



    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public ArrayList<String> getListOfTransactionId() {
        return listOfTransactionId;
    }

    public void setListOfTransactionId(ArrayList<String> listOfTransactionId) {
        this.listOfTransactionId = listOfTransactionId;
    }

    public String getTransactionUserRole() {
        return transactionUserRole;
    }

    public void setTransactionUserRole(String transactionUserRole) {
        this.transactionUserRole = transactionUserRole;
    }

    public String getFileBoundId() {
        return fileBoundId;
    }

    public void setFileBoundId(String fileBoundId) {
        this.fileBoundId = fileBoundId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSaveAction() {
        return saveAction;
    }

    public void setSaveAction(String saveAction) {
        this.saveAction = saveAction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatusUpdateByFirstName() {
        return statusUpdateByFirstName;
    }

    public void setStatusUpdateByFirstName(String statusUpdateByFirstName) {
        this.statusUpdateByFirstName = statusUpdateByFirstName;
    }

    public String getStatusUpdateByFullName() {
        return statusUpdateByFullName;
    }

    public void setStatusUpdateByFullName(String statusUpdateByFullName) {
        this.statusUpdateByFullName = statusUpdateByFullName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
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

    public String getSubscriberMemberCk() {
        return subscriberMemberCk;
    }

    public void setSubscriberMemberCk(String subscriberMemberCk) {
        this.subscriberMemberCk = subscriberMemberCk;
    }

    public DateTime getMemberDateOfBirth() {
        return memberDateOfBirth;
    }

    public void setMemberDateOfBirth(DateTime memberDateOfBirth) {
        this.memberDateOfBirth = memberDateOfBirth;
    }

    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public String getMemberShortName() {
        return memberShortName;
    }

    public void setMemberShortName(String memberShortName) {
        this.memberShortName = memberShortName;
    }

    public String getMemberNameSuffix() {
        return memberNameSuffix;
    }

    public void setMemberNameSuffix(String memberNameSuffix) {
        this.memberNameSuffix = memberNameSuffix;
    }

    public String getMemberMidInitial() {
        return memberMidInitial;
    }

    public void setMemberMidInitial(String memberMidInitial) {
        this.memberMidInitial = memberMidInitial;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberIdSource() {
        return memberIdSource;
    }

    public void setMemberIdSource(String memberIdSource) {
        this.memberIdSource = memberIdSource;
    }

    public AddressDto getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(AddressDto primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public CoverageDto getCoverage() {
        return coverage;
    }

    public void setCoverage(CoverageDto coverage) {
        this.coverage = coverage;
    }

    public ReportingCodesDto getReportingCodes() {
        return reportingCodes;
    }

    public void setReportingCodes(ReportingCodesDto reportingCodes) {
        this.reportingCodes = reportingCodes;
    }

    public PrivacyDto getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyDto privacy) {
        this.privacy = privacy;
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

    public boolean isOrigEffDateChange() {
        return origEffDateChange;
    }

    public void setOrigEffDateChange(boolean origEffDateChange) {
        this.origEffDateChange = origEffDateChange;
    }

}
