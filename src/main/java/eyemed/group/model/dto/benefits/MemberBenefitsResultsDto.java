package eyemed.group.model.dto.benefits;

import java.util.List;

/**
 * Created by c09368 on 11/21/2018.
 */
public class MemberBenefitsResultsDto {

    protected List<BenefitDisplayCategoryDto> benefitDisplayCategories;
    protected List<ProductAddlInfoDto> additionalInfo;
    protected List<ServiceFrequenciesDto> serviceFrequencies;

    public List<BenefitDisplayCategoryDto> getBenefitDisplayCategories() {
        return benefitDisplayCategories;
    }

    public void setBenefitDisplayCategories(List<BenefitDisplayCategoryDto> benefitDisplayCategories) {
        this.benefitDisplayCategories = benefitDisplayCategories;
    }

    public List<ProductAddlInfoDto> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<ProductAddlInfoDto> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<ServiceFrequenciesDto> getServiceFrequencies() {
        return serviceFrequencies;
    }

    public void setServiceFrequencies(List<ServiceFrequenciesDto> serviceFrequencies) {
        this.serviceFrequencies = serviceFrequencies;
    }
}
