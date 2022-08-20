package eyemed.group.model.dto;

public class EventGlobalSettingsDto {

    Integer totalEmployeeQuantity;
    Integer staffedEventMaximumQuantityOverride;
    Integer staffedEventMinimumEmployeeQuantity;
    Integer materialsMinimumEmployeeQuantity;
    
    public Integer getTotalEmployeeQuantity() {
        return totalEmployeeQuantity;
    }

    public void setTotalEmployeeQuantity(Integer totalEmployeeQuantity) {
        this.totalEmployeeQuantity = totalEmployeeQuantity;
    }

    public Integer getStaffedEventMaximumQuantityOverride() {
        return staffedEventMaximumQuantityOverride;
    }

    public void setStaffedEventMaximumQuantityOverride(Integer staffedEventMaximumQuantityOverride) {
        this.staffedEventMaximumQuantityOverride = staffedEventMaximumQuantityOverride;
    }

    public Integer getStaffedEventMinimumEmployeeQuantity() {
        return staffedEventMinimumEmployeeQuantity;
    }

    public void setStaffedEventMinimumEmployeeQuantity(Integer staffedEventMinimumEmployeeQuantity) {
        this.staffedEventMinimumEmployeeQuantity = staffedEventMinimumEmployeeQuantity;
    }

    public Integer getMaterialsMinimumEmployeeQuantity() {
        return materialsMinimumEmployeeQuantity;
    }

    public void setMaterialsMinimumEmployeeQuantity(Integer materialsMinimumEmployeeQuantity) {
        this.materialsMinimumEmployeeQuantity = materialsMinimumEmployeeQuantity;
    }
}
