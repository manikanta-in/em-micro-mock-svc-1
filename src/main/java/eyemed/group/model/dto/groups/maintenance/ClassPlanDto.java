package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class ClassPlanDto implements Serializable {

    private String groupCk;
    private String groupId;
    private String classId;
    private String planId;
    private String planDescription;
    private String planCategory;
    private DateTime planEffectiveDate;
    private DateTime planTerminationDate;
    private String productId;
    private String network;
    private String cardCode;
    private int classPlanHedisDays;

    public String getGroupCk() { return groupCk; }

    public void setGroupCk(String groupCk) { this.groupCk = groupCk; }

    public String getGroupId() { return groupId; }

    public void setGroupId(String groupId) { this.groupId = groupId; }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public String getPlanCategory() { return planCategory; }

    public void setPlanCategory(String planCategory) { this.planCategory = planCategory; }

    public DateTime getPlanEffectiveDate() {
        return planEffectiveDate;
    }

    public void setPlanEffectiveDate(DateTime planEffectiveDate) {
        this.planEffectiveDate = planEffectiveDate;
    }

    public DateTime getPlanTerminationDate() {
        return planTerminationDate;
    }

    public void setPlanTerminationDate(DateTime planTerminationDate) {
        this.planTerminationDate = planTerminationDate;
    }

    public String getProductId() { return productId; }

    public void setProductId(String productId) { this.productId = productId; }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public int getClassPlanHedisDays() {
        return classPlanHedisDays;
    }

    public void setClassPlanHedisDays(int classPlanHedisDays) {
        this.classPlanHedisDays = classPlanHedisDays;
    }
}
