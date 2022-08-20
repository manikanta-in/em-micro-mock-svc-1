package eyemed.group.model.dto.applications;

import org.joda.time.DateTime;

public class ClientApplicationSubGroupDto {
    private int applicationId;
    private long groupCk;
    private String groupId;
    private String subGroupId;
    private String subGroupName;
    private DateTime subGroupEffectiveDate;
    private String classId;
    private String classDescription;
    private DateTime classEffectiveDate;
    private int quoteId;

    public ClientApplicationSubGroupDto() {
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public long getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(long groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public DateTime getSubGroupEffectiveDate() {
        return subGroupEffectiveDate;
    }

    public void setSubGroupEffectiveDate(DateTime subGroupEffectiveDate) {
        this.subGroupEffectiveDate = subGroupEffectiveDate;
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

    public DateTime getClassEffectiveDate() {
        return classEffectiveDate;
    }

    public void setClassEffectiveDate(DateTime classEffectiveDate) {
        this.classEffectiveDate = classEffectiveDate;
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }
}
