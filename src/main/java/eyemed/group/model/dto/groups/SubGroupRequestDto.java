package eyemed.group.model.dto.groups;

import eyemed.group.model.dto.BaseRequest;
import org.joda.time.DateTime;

/**
 * Created by c09368 on 10/4/2018.
 */
public class SubGroupRequestDto extends BaseRequest {

    private String groupCk;
    private String subGroupCk;
    private DateTime beginSearchDate;
    private DateTime endSearchDate;
    private String userId;

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public DateTime getBeginSearchDate() {
        return beginSearchDate;
    }

    public void setBeginSearchDate(DateTime beginSearchDate) {
        this.beginSearchDate = beginSearchDate;
    }

    public DateTime getEndSearchDate() {
        return endSearchDate;
    }

    public void setEndSearchDate(DateTime endSearchDate) {
        this.endSearchDate = endSearchDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
