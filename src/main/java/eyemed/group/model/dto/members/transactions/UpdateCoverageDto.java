package eyemed.group.model.dto.members.transactions;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 12/12/2018.
 */
public class UpdateCoverageDto extends AbstractCoverageCriteria {

    private DateTime effectiveDate;
    private DateTime terminationDate;
    private DateTime previousEffectiveDate;
    private DateTime previousTerminationDate;
    private String previousSubGroupCk;
    private String previousClassId;
    private String previousPlanId;
    private boolean subscriberTermed;
    private List<String> termMembers;

    public UpdateCoverageDto(){
        super();
        termMembers = new ArrayList<>();
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

    public boolean isSubscriberTermed() {
        return subscriberTermed;
    }

    public void setSubscriberTermed(boolean subscriberTermed) {
        this.subscriberTermed = subscriberTermed;
    }

    public List<String> getTermMembers() {
        return termMembers;
    }

    public void setTermMembers(List<String> termMembers) {
        this.termMembers = termMembers;
    }
}
