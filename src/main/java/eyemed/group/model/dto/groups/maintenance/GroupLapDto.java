package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class GroupLapDto implements Serializable {

    private String lapCoverage;
    private String lapDomiciledState;
    private List<String> lapRegulatoryEntity;
    private String lapLockedBy;
    private DateTime lapLockedDate;

    public String getLapCoverage() {
        return lapCoverage;
    }

    public void setLapCoverage(String lapCoverage) {
        this.lapCoverage = lapCoverage;
    }

    public String getLapDomiciledState() {
        return lapDomiciledState;
    }

    public void setLapDomiciledState(String lapDomiciledState) {
        this.lapDomiciledState = lapDomiciledState;
    }

    public List<String> getLapRegulatoryEntity() {
        return lapRegulatoryEntity;
    }

    public void setLapRegulatoryEntity(List<String> lapRegulatoryEntity) {
        this.lapRegulatoryEntity = lapRegulatoryEntity;
    }

    public String getLapLockedBy() {
        return lapLockedBy;
    }

    public void setLapLockedBy(String lapLockedBy) {
        this.lapLockedBy = lapLockedBy;
    }

    public DateTime getLapLockedDate() {
        return lapLockedDate;
    }

    public void setLapLockedDate(DateTime lapLockedDate) {
        this.lapLockedDate = lapLockedDate;
    }
}
