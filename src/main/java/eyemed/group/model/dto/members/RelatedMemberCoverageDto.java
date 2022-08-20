package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 11/8/2018.
 */
public class RelatedMemberCoverageDto {

    private DateTime effectiveDate;
    private DateTime terminationDate;
    private DateTime previousEffectiveDate;
    private DateTime previousTerminationDate;

    public RelatedMemberCoverageDto() {
        super();
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
}
