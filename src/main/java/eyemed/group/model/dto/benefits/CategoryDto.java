package eyemed.group.model.dto.benefits;

/**
 * Created by c09368 on 11/26/2018.
 */
public class CategoryDto {
    protected String categoryID;
    protected int displayOrder;
    protected String name;

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
