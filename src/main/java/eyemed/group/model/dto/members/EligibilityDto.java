package eyemed.group.model.dto.members;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/8/2018.
 */
public class EligibilityDto {

    private String benefitCategoryId;
    private String benefitCategory;
    private int sortOrder;
    private List<String> inNetworkServiceRestrictions;
    private List<String> outOfNetworkServiceRestrictions;
    private List<String> inNetworkDisclaimers;
    private List<String> outOfNetworkDisclaimers;
    private List<EligibilityCategoryDto> eligibilityCategories;

    public EligibilityDto(){
        super();
        this.inNetworkServiceRestrictions = new ArrayList<>();
        this.outOfNetworkServiceRestrictions = new ArrayList<>();
        this.inNetworkDisclaimers = new ArrayList<>();
        this.outOfNetworkDisclaimers = new ArrayList<>();
        this.eligibilityCategories = new ArrayList<>();
    }

    public String getBenefitCategoryId() {
        return benefitCategoryId;
    }

    public void setBenefitCategoryId(String benefitCategoryId) {
        this.benefitCategoryId = benefitCategoryId;
    }

    public String getBenefitCategory() {
        return benefitCategory;
    }

    public void setBenefitCategory(String benefitCategory) {
        this.benefitCategory = benefitCategory;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<String> getInNetworkServiceRestrictions() {
        return inNetworkServiceRestrictions;
    }

    public void setInNetworkServiceRestrictions(List<String> inNetworkServiceRestrictions) {
        this.inNetworkServiceRestrictions = inNetworkServiceRestrictions;
    }

    public List<String> getOutOfNetworkServiceRestrictions() {
        return outOfNetworkServiceRestrictions;
    }

    public void setOutOfNetworkServiceRestrictions(List<String> outOfNetworkServiceRestrictions) {
        this.outOfNetworkServiceRestrictions = outOfNetworkServiceRestrictions;
    }

    public List<String> getInNetworkDisclaimers() {
        return inNetworkDisclaimers;
    }

    public void setInNetworkDisclaimers(List<String> inNetworkDisclaimers) {
        this.inNetworkDisclaimers = inNetworkDisclaimers;
    }

    public List<String> getOutOfNetworkDisclaimers() {
        return outOfNetworkDisclaimers;
    }

    public void setOutOfNetworkDisclaimers(List<String> outOfNetworkDisclaimers) {
        this.outOfNetworkDisclaimers = outOfNetworkDisclaimers;
    }

    public List<EligibilityCategoryDto> getEligibilityCategories() {
        return eligibilityCategories;
    }

    public void setEligibilityCategories(List<EligibilityCategoryDto> eligibilityCategories) {
        this.eligibilityCategories = eligibilityCategories;
    }
}
