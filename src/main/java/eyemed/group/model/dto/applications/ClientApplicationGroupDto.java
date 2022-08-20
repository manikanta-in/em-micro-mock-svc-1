package eyemed.group.model.dto.applications;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class ClientApplicationGroupDto {
    private int applicationId;
    private String groupId;
    private Long groupCk;
    private String groupName;
    private DateTime groupEffectiveDate;
    private List<ClientApplicationSubGroupDto> subgroups = new ArrayList<>();

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(Long groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DateTime getGroupEffectiveDate() {
        return groupEffectiveDate;
    }

    public void setGroupEffectiveDate(DateTime groupEffectiveDate) {
        this.groupEffectiveDate = groupEffectiveDate;
    }

    public List<ClientApplicationSubGroupDto> getSubgroups() {
        return subgroups;
    }

    public void setSubgroups(List<ClientApplicationSubGroupDto> subgroups) {
        this.subgroups = subgroups;
    }
}
