package eyemed.group.model.dto.reports;

/**
 * Created by c09368 on 2/4/2019.
 */
public class RequestEnrollDto {

    private String groupCk;
    private String subGroupCk;
    private String filterType;


    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }
}
