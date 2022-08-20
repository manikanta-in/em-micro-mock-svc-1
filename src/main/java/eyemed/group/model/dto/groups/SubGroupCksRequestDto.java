package eyemed.group.model.dto.groups;

import java.util.Set;

public class SubGroupCksRequestDto extends SubGroupRequestDto {
    private Set<Long> groupCks;
    private String userType;

    public Set<Long> getGroupCks() {
        return groupCks;
    }

    public void setGroupCks(Set<Long> groupCk) {
        this.groupCks = groupCk;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
