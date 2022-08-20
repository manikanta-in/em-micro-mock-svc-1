package eyemed.group.model.dto.members.transactions;

/**
 * Created by c09368 on 12/14/2018.
 */
public class VoidCoverageDto extends AbstractCoverageCriteria{

    private String effectiveDate;
    private String terminationDate;
    private boolean voidMember;

    public VoidCoverageDto(){
        super();
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }

    public boolean isVoidMember() {
        return voidMember;
    }

    public void setVoidMember(boolean voidMember) {
        this.voidMember = voidMember;
    }
}
