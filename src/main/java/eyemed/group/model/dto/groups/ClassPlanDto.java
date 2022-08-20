package eyemed.group.model.dto.groups;

import eyemed.group.security.SecurityHelper;
import org.joda.time.DateTime;

/**
 * Created by c09368 on 10/2/2018.
 */
public class ClassPlanDto {

    private String planId;
    private String planDescription;
    private String cardCode;
    private DateTime planEffectiveDate;
    private DateTime planTerminationDate;
    private String network;
    private String product;
    private String classId;
    private String classDescription;
    private DateTime classEffectiveDate;
    private DateTime classTerminationDate;
    private String benefitServiceDate;

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

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

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

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public DateTime getClassTerminationDate() {
        return classTerminationDate;
    }

    public void setClassTerminationDate(DateTime classTerminationDate) {
        this.classTerminationDate = classTerminationDate;
    }

    public String getBenefitServiceDate() {
        if(this.planEffectiveDate != null) {
            return SecurityHelper.getBenefitServiceDate(this.planEffectiveDate);
        }
        return new DateTime().toLocalDate().toString();
    }


}
