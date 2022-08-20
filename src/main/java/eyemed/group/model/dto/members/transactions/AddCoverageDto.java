package eyemed.group.model.dto.members.transactions;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 12/12/2018.
 */
public class AddCoverageDto extends AbstractCoverageCriteria {
    private DateTime effectiveDate;
    private DateTime terminationDate;
    private boolean reinstate;
    private List<MemberCoverageDto> members;


    public AddCoverageDto(){
        super();
        members = new ArrayList<>();
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

    public boolean isReinstate() {
        return reinstate;
    }

    public void setReinstate(boolean reinstate) {
        this.reinstate = reinstate;
    }

    public List<MemberCoverageDto> getMembers() {
        return members;
    }

    public void setMembers(List<MemberCoverageDto> members) {
        this.members = members;
    }
}
