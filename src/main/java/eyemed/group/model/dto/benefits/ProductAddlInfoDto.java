package eyemed.group.model.dto.benefits;

import java.util.Comparator;
import java.util.List;

/**
 * Created by c09368 on 11/26/2018.
 */
public class ProductAddlInfoDto implements Comparator<ProductAddlInfoDto> {
    protected String type;
    protected Integer orderType;
    protected CategoryDto benefitCategory;
    protected CategoryDto serviceCategory;
    protected List<OrderedValueWithLink> orderedValueList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CategoryDto getBenefitCategory() {
        return benefitCategory;
    }

    public void setBenefitCategory(CategoryDto benefitCategory) {
        this.benefitCategory = benefitCategory;
    }

    public CategoryDto getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(CategoryDto serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public List<OrderedValueWithLink> getOrderedValueList() {
        return orderedValueList;
    }

    public void setOrderedValueList(List<OrderedValueWithLink> orderedValueList) {
        this.orderedValueList = orderedValueList;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public int compare(ProductAddlInfoDto orderedValue, ProductAddlInfoDto orderedValue2) {
        return orderedValue.getOrderType().compareTo(orderedValue2.getOrderType());
    }
}
