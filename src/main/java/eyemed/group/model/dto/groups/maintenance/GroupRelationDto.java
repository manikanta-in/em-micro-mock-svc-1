package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class GroupRelationDto extends GroupDto implements Serializable {

    private String groupRelationId;
    private String groupRelationCategory;
    private String groupRelationMctrType;
    private DateTime groupRelationEffectiveDate;
    private DateTime groupRelationTerminationDate;

    public String getGroupRelationId() { return groupRelationId; }

    public void setGroupRelationId(String groupRelationId) { this.groupRelationId = groupRelationId; }

    public String getGroupRelationCategory() { return groupRelationCategory; }

    public void setGroupRelationCategory(String groupRelationCategory) { this.groupRelationCategory = groupRelationCategory; }

    public String getGroupRelationMctrType() { return groupRelationMctrType; }

    public void setGroupRelationMctrType(String groupRelationMctrType) { this.groupRelationMctrType = groupRelationMctrType; }

    public DateTime getGroupRelationEffectiveDate() { return groupRelationEffectiveDate; }

    public void setGroupRelationEffectiveDate(DateTime groupRelationEffectiveDate) { this.groupRelationEffectiveDate = groupRelationEffectiveDate; }

    public DateTime getGroupRelationTerminationDate() { return groupRelationTerminationDate; }

    public void setGroupRelationTerminationDate(DateTime groupRelationTerminationDate) { this.groupRelationTerminationDate = groupRelationTerminationDate; }

}
