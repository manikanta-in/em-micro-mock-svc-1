package eyemed.group.model.dto.benefits;

import java.util.List;

/**
 * Created by c09368 on 11/21/2018.
 */
public class BenefitCategoryLimits {

    protected String benefitCategoryId;
    protected String benefitCategoryName;
    List<LimitsDto> limits ;
    List<OrderedValue> serviceLineDisclaimers;
    protected boolean inNetworkElig;
    protected boolean outNetworkElig;

    public String getBenefitCategoryId() {
        return benefitCategoryId;
    }

    public void setBenefitCategoryId(String benefitCategoryId) {
        this.benefitCategoryId = benefitCategoryId;
    }

    public String getBenefitCategoryName() {
        return benefitCategoryName;
    }

    public void setBenefitCategoryName(String benefitCategoryName) {
        this.benefitCategoryName = benefitCategoryName;
    }

    public List<LimitsDto> getLimits() {
        return limits;
    }

    public void setLimits(List<LimitsDto> limits) {
        this.limits = limits;
    }

    public List<OrderedValue> getServiceLineDisclaimers() {
        return serviceLineDisclaimers;
    }

    public void setServiceLineDisclaimers(List<OrderedValue> serviceLineDisclaimers) {
        this.serviceLineDisclaimers = serviceLineDisclaimers;
    }

    public boolean isInNetworkElig() {
        return inNetworkElig;
    }

    public void setInNetworkElig(boolean inNetworkElig) {
        this.inNetworkElig = inNetworkElig;
    }

    public boolean isOutNetworkElig() {
        return outNetworkElig;
    }

    public void setOutNetworkElig(boolean outNetworkElig) {
        this.outNetworkElig = outNetworkElig;
    }
}
