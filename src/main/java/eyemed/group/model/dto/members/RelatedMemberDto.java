package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 11/8/2018.
 */
public class RelatedMemberDto {

    private String eyemedMemberId;
    private String clientHealthId;
    private String memberCk;
    private String memberSuffix;
    private String memberShortName;
    private String relationshipCode;
    private String relationshipDescription;
    private String firstName;
    private String lastName;
    private String gender;
    private String ssn;
    private DateTime dateOfBirth;
    private String memberStatus;
    private String memberStatusCode;
    private String addressType;
    private String memberType;
    private boolean memberVoided;
    private DateTime coverageStartDate;
    private DateTime coverageEndDate;
    private DateTime enrollmentDate;

    public RelatedMemberDto() {
        super();

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

    public String getMemberSuffix() {
        return memberSuffix;
    }

    public void setMemberSuffix(String memberSuffix) {
        this.memberSuffix = memberSuffix;
    }

    public String getMemberShortName() {
        return memberShortName;
    }

    public void setMemberShortName(String memberShortName) {
        this.memberShortName = memberShortName;
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

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String memberStatusCode) {
        this.memberStatusCode = memberStatusCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
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

    public DateTime getCoverageStartDate() {
        return coverageStartDate;
    }

    public void setCoverageStartDate(DateTime coverageStartDate) {
        this.coverageStartDate = coverageStartDate;
    }

    public DateTime getCoverageEndDate() {
        return coverageEndDate;
    }

    public void setCoverageEndDate(DateTime coverageEndDate) {
        this.coverageEndDate = coverageEndDate;
    }

    public DateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(DateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
