package eyemed.group.model.dto.members.transactions;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 12/12/2018.
 */
public class EnrollmentChgDto extends AbstractCoverageCriteria{

    private DateTime enrollmentDate;
    private DateTime previousEnrollmentDate;
    private DateTime terminationDate;
    private DateTime previousTerminationDate;
    private String previousSubGroupCk;
    private String previousClassId;
    private String previousPlanId;


    public EnrollmentChgDto(){
        super();
    }

    public DateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(DateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public DateTime getPreviousEnrollmentDate() {
        return previousEnrollmentDate;
    }

    public void setPreviousEnrollmentDate(DateTime previousEnrollmentDate) {
        this.previousEnrollmentDate = previousEnrollmentDate;
    }

    public DateTime getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(DateTime terminationDate) {
        this.terminationDate = terminationDate;
    }

    public DateTime getPreviousTerminationDate() {
        return previousTerminationDate;
    }

    public void setPreviousTerminationDate(DateTime previousTerminationDate) {
        this.previousTerminationDate = previousTerminationDate;
    }

    public String getPreviousSubGroupCk() {
        return previousSubGroupCk;
    }

    public void setPreviousSubGroupCk(String previousSubGroupCk) {
        this.previousSubGroupCk = previousSubGroupCk;
    }

    public String getPreviousClassId() {
        return previousClassId;
    }

    public void setPreviousClassId(String previousClassId) {
        this.previousClassId = previousClassId;
    }

    public String getPreviousPlanId() {
        return previousPlanId;
    }

    public void setPreviousPlanId(String previousPlanId) {
        this.previousPlanId = previousPlanId;
    }
}
