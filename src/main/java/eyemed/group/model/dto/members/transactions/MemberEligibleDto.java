package eyemed.group.model.dto.members.transactions;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Encapsulates the data for a void or reinstate request.
 * @author Vijayakumar Ramaswamy
 * @since 11/19/2018
 */
public class MemberEligibleDto implements Serializable {
    private String subscriberCK, memberCK, groupCK, subGroupCK, classId, classPlanId, type, memberType;
    private DateTime effectiveDate, terminationDate, previousEffectiveDate, previousTerminationDate, subGroupTerminationDate, enrollmentDate;

    public MemberEligibleDto() {
        super();
    }

    public String getSubscriberCK() { return subscriberCK; }

    public void setSubscriberCK(String subscriberCK) { this.subscriberCK = subscriberCK; }

    public String getMemberCK() { return memberCK; }

    public void setMemberCK(String memberCK) { this.memberCK = memberCK; }

    public String getGroupCK() { return groupCK; }

    public void setGroupCK(String groupCK) { this.groupCK = groupCK; }

    public String getSubGroupCK() { return subGroupCK; }

    public void setSubGroupCK(String subGroupCK) { this.subGroupCK = subGroupCK; }

    public String getClassId() { return classId; }

    public void setClassId(String classId) { this.classId = classId; }

    public String getClassPlanId() { return classPlanId; }

    public void setClassPlanId(String classPlanId) { this.classPlanId = classPlanId; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
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

    public DateTime getPreviousEffectiveDate() { return previousEffectiveDate; }

    public void setPreviousEffectiveDate(DateTime previousEffectiveDate) { this.previousEffectiveDate = previousEffectiveDate; }

    public DateTime getPreviousTerminationDate() { return previousTerminationDate;  }

    public void setPreviousTerminationDate(DateTime previousTerminationDate) { this.previousTerminationDate = previousTerminationDate; }

    public DateTime getSubGroupTerminationDate() { return this.subGroupTerminationDate; }

    public void setSubGroupTerminationDate(DateTime subGroupTerminationDate) { this.subGroupTerminationDate = subGroupTerminationDate; }

    public DateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(DateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString( this );
    }
}