package eyemed.group.model.dto.benefits;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/26/2018.
 */
public class DisplayCategoryDto {
    protected String name;
    protected String additionalVerbiage;
    protected int displayOrder;
    protected List<DisplayServiceDto> displayServices;
    protected List<ProductAddlInfoDto> additionalInfo = new ArrayList<ProductAddlInfoDto>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalVerbiage() {
        return additionalVerbiage;
    }

    public void setAdditionalVerbiage(String additionalVerbiage) {
        this.additionalVerbiage = additionalVerbiage;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public List<DisplayServiceDto> getDisplayServices() {
        return displayServices;
    }

    public void setDisplayServices(List<DisplayServiceDto> displayServices) {
        this.displayServices = displayServices;
    }

    public List<ProductAddlInfoDto> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<ProductAddlInfoDto> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
