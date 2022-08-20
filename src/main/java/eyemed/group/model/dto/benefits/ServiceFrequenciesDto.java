package eyemed.group.model.dto.benefits;

/**
 * Created by c09368 on 11/26/2018.
 */
public class ServiceFrequenciesDto {

    protected int serviceCategoryId;
    protected String serviceCategoryName;
    protected String serviceCategoryDisplayOrder;
    protected String frequency;
    protected String juvenileFrequency;
    protected String calendarType;

    protected String demographicType;
    protected int demographicBegAge;
    protected int demographicEndAge;
    protected String displayType;
    protected String benefitCategoryId;
    protected String benefitCategoryName;
    protected int benefitCategorySortOrder;

    public int getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(int serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

    public String getServiceCategoryName() {
        return serviceCategoryName;
    }

    public void setServiceCategoryName(String serviceCategoryName) {
        this.serviceCategoryName = serviceCategoryName;
    }

    public String getServiceCategoryDisplayOrder() {
        return serviceCategoryDisplayOrder;
    }

    public void setServiceCategoryDisplayOrder(String serviceCategoryDisplayOrder) {
        this.serviceCategoryDisplayOrder = serviceCategoryDisplayOrder;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getJuvenileFrequency() {
        return juvenileFrequency;
    }

    public void setJuvenileFrequency(String juvenileFrequency) {
        this.juvenileFrequency = juvenileFrequency;
    }

    public String getCalendarType() {
        return calendarType;
    }

    public void setCalendarType(String calendarType) {
        this.calendarType = calendarType;
    }

    public String getDemographicType() {
        return demographicType;
    }

    public void setDemographicType(String demographicType) {
        this.demographicType = demographicType;
    }

    public int getDemographicBegAge() {
        return demographicBegAge;
    }

    public void setDemographicBegAge(int demographicBegAge) {
        this.demographicBegAge = demographicBegAge;
    }

    public int getDemographicEndAge() {
        return demographicEndAge;
    }

    public void setDemographicEndAge(int demographicEndAge) {
        this.demographicEndAge = demographicEndAge;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

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

    public int getBenefitCategorySortOrder() {
        return benefitCategorySortOrder;
    }

    public void setBenefitCategorySortOrder(int benefitCategorySortOrder) {
        this.benefitCategorySortOrder = benefitCategorySortOrder;
    }
}
