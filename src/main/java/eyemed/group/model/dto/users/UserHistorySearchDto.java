package eyemed.group.model.dto.users;

import java.io.Serializable;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 10/15/18
 */

public class UserHistorySearchDto extends UserHistoryDto implements Serializable {

    private static final long serialVersionUID = 3425124341086578798L;
    private String searchStartDate;
    private String searchEndDate;
    private String externalUserId;

    public String getSearchStartDate() {
        return searchStartDate;
    }

    public void setSearchStartDate(String searchStartDate) {
        this.searchStartDate = searchStartDate;
    }

    public String getSearchEndDate() {
        return searchEndDate;
    }

    public void setSearchEndDate(String searchEndDate) {
        this.searchEndDate = searchEndDate;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }
}
