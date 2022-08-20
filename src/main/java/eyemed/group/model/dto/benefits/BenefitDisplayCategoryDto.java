package eyemed.group.model.dto.benefits;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/26/2018.
 */
public class BenefitDisplayCategoryDto {
    protected String id;
    protected String name;
    protected int displayOrder;
    protected List<DisplayCategoryDto> displayCategories;
    protected List<ServiceFrequenciesDto> serviceFrequencies;
    protected List <ProductAddlInfoDto> productAdditionalInfo = null;

    public BenefitDisplayCategoryDto(){
        productAdditionalInfo = new ArrayList<ProductAddlInfoDto>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public List<DisplayCategoryDto> getDisplayCategories() {
        return displayCategories;
    }

    public void setDisplayCategories(List<DisplayCategoryDto> displayCategories) {
        this.displayCategories = displayCategories;
    }

    public List<ServiceFrequenciesDto> getServiceFrequencies() {
        return serviceFrequencies;
    }

    public void setServiceFrequencies(List<ServiceFrequenciesDto> serviceFrequencies) {
        this.serviceFrequencies = serviceFrequencies;
    }

    public List<ProductAddlInfoDto> getProductAdditionalInfo() {
        return productAdditionalInfo;
    }

    public void setProductAdditionalInfo(List<ProductAddlInfoDto> productAdditionalInfo) {
        this.productAdditionalInfo = productAdditionalInfo;
    }
}
