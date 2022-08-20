package eyemed.group.model.dto.groups.maintenance;

import java.io.Serializable;
import java.util.List;

public class ClassDto implements Serializable {

    private String groupCk;
    private String groupId;
    private String classId;
    private String classDescription;
    private String classPrefix;
    private List<ClassPlanDto> plans;

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public String getClassPrefix() {
        return classPrefix;
    }

    public void setClassPrefix(String classPrefix) {
        this.classPrefix = classPrefix;
    }

    public List<ClassPlanDto> getPlans() {
        return plans;
    }

    public void setPlans(List<ClassPlanDto> plans) {
        this.plans = plans;
    }
}
