package eyemed.group.model.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.DateTime;

public class EventProductKeyDto {

    private int eventRequestId;
    private int parentGroupCk;
    private String bsbsPrefix;
    private String embePrefix;
    private String copkPrefix;
    private int groupCk;
    private String classId;
    private String classPlanId;
    private DateTime planEffectiveDate;

    @JsonIgnore
    public int getEventRequestId() { return eventRequestId; }

    public void setEventRequestId(int eventRequestId) { this.eventRequestId = eventRequestId; }

    @JsonIgnore
    public int getParentGroupCk() { return parentGroupCk; }

    public void setParentGroupCk(int parentGroupCk) { this.parentGroupCk = parentGroupCk; }

    public String getBsbsPrefix() { return bsbsPrefix; }

    public void setBsbsPrefix(String bsbsPrefix) { this.bsbsPrefix = bsbsPrefix; }

    public String getEmbePrefix() { return embePrefix; }

    public void setEmbePrefix(String embePrefix) { this.embePrefix = embePrefix; }

    public String getCopkPrefix() { return copkPrefix; }

    public void setCopkPrefix(String copkPrefix) { this.copkPrefix = copkPrefix; }

    public int getGroupCk() { return groupCk; }

    public void setGroupCk(int groupCk) { this.groupCk = groupCk; }

    public String getClassId() { return classId; }

    public void setClassId(String classId) { this.classId = classId; }

    public String getClassPlanId() { return classPlanId; }

    public void setClassPlanId(String classPlanId) { this.classPlanId = classPlanId; }

    public DateTime getPlanEffectiveDate() { return planEffectiveDate; }

    public void setPlanEffectiveDate(DateTime planEffectiveDate) { this.planEffectiveDate = planEffectiveDate; }
}
