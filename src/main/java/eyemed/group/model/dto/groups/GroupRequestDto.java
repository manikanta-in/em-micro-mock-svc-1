package eyemed.group.model.dto.groups;

import eyemed.group.model.dto.BaseRequest;
import org.joda.time.DateTime;

/**
 * Created by c09368 on 10/3/2018.
 */
public class GroupRequestDto extends BaseRequest {
    private String criteriaType;
    private String id;
    private String name;
    private String groupCk;
    private boolean nameWildCardIndicator;
    private boolean matchingAlias;
    private DateTime beginSearchDate;
    private DateTime endSearchDate;
    private int maxRows;
    //private boolean includeSubGroups;

    public String getCriteriaType() {
        return criteriaType;
    }

    public void setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
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

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public boolean isNameWildCardIndicator() {
        return nameWildCardIndicator;
    }

    public void setNameWildCardIndicator(boolean nameWildCardIndicator) {
        this.nameWildCardIndicator = nameWildCardIndicator;
    }

    public boolean isMatchingAlias() {
        return matchingAlias;
    }

    public void setMatchingAlias(boolean matchingAlias) {
        this.matchingAlias = matchingAlias;
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

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }
}
