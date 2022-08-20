package eyemed.group.model.dto.members.transactions;

import eyemed.group.model.dto.CodeDataDto;
import eyemed.group.model.dto.members.AddressDto;
import eyemed.group.model.dto.members.PrivacyDto;
import eyemed.group.model.dto.members.RelatedMemberDto;
import eyemed.group.model.dto.members.ReportingCodesDto;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates the data for a member.
 *
 * @author Vijayakumar Ramaswamy
 * @since 11/19/2018
 */
public class MemberDemographicsDto implements Serializable {
    private String clientMemberId, firstName, middleInitial, lastName, memberShortName, suffix, ssn, relationshipCode, gender, homePhone, email;
    private String homeExtension, workPhone, workExtension, cellPhone, memberSuffix, subscriberId,subscriberCK, memberCK;
    private DateTime dateOfBirth, enrollmentDate;
    private boolean addressChanged;

    private CodeDataDto ethnicity, race, spokenLanguage, writtenLanguage;
    private ReportingCodesDto reportingCodes;
    private List<RelatedMemberDto> family;
    private AddressDto address;
    private PrivacyDto privacy;

    public MemberDemographicsDto() {
        this.family = new ArrayList<RelatedMemberDto>();
    }

    public String getClientMemberId() {
        return clientMemberId;
    }

    public void setClientMemberId(String clientMemberId) {
        this.clientMemberId = clientMemberId;
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

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMemberShortName() {
        return memberShortName;
    }

    public void setMemberShortName(String memberShortName) {
        this.memberShortName = memberShortName;
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

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomePhone() { return homePhone; }

    public void setHomePhone(String homePhone) { this.homePhone = homePhone; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isAddressChanged() {
        return addressChanged;
    }

    public void setAddressChanged(boolean addressChanged) {
        this.addressChanged = addressChanged;
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

    public ReportingCodesDto getReportingCodes() {
        return reportingCodes;
    }

    public void setReportingCodes(ReportingCodesDto reportingCodes) {
        this.reportingCodes = reportingCodes;
    }

    public List<RelatedMemberDto> getFamily() {
        return family;
    }

    public void setFamily(List<RelatedMemberDto> family) {
        this.family = family;
    }

    public AddressDto getAddress() { return address; }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public PrivacyDto getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyDto privacy) {
        this.privacy = privacy;
    }

    public String getHomeExtension() { return homeExtension; }

    public void setHomeExtension(String homeExtension) { this.homeExtension = homeExtension; }

    public String getWorkPhone() { return workPhone; }

    public void setWorkPhone(String workPhone) { this.workPhone = workPhone; }

    public String getWorkExtension() { return workExtension; }

    public void setWorkExtension(String workExtension) { this.workExtension = workExtension; }

    public String getCellPhone() { return cellPhone; }

    public void setCellPhone(String cellPhone) { this.cellPhone = cellPhone; }

    public String getMemberSuffix() { return memberSuffix; }

    public void setMemberSuffix(String memberSuffix) { this.memberSuffix = memberSuffix; }

    public String getSubscriberId() { return subscriberId; }

    public void setSubscriberId(String subscriberId) { this.subscriberId = subscriberId; }

    public String getSubscriberCK() {
        return subscriberCK;
    }

    public void setSubscriberCK(String subscriberCK) {
        this.subscriberCK = subscriberCK;
    }

    public String getMemberCK() {
        return memberCK;
    }

    public void setMemberCK(String memberCK) {
        this.memberCK = memberCK;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}