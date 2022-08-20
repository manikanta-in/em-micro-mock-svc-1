package eyemed.group.model.dto.benefits;

import java.util.List;

/**
 * Created by c09368 on 11/21/2018.
 */
public class AmountLimitsServiceDto {

    protected String limitCategoryDesc;
    List<BenefitCategoryLimits> benefitCategoryLimits;

    public String getLimitCategoryDesc() {
        return limitCategoryDesc;
    }

    public void setLimitCategoryDesc(String limitCategoryDesc) {
        this.limitCategoryDesc = limitCategoryDesc;
    }

    public List<BenefitCategoryLimits> getBenefitCategoryLimits() {
        return benefitCategoryLimits;
    }

    public void setBenefitCategoryLimits(List<BenefitCategoryLimits> benefitCategoryLimits) {
        this.benefitCategoryLimits = benefitCategoryLimits;
    }
}

