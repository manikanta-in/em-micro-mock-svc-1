package eyemed.group.model.dto.users;

import java.io.Serializable;
import java.util.List;

public class UserDetailsDto implements Serializable {
    private UserDto user;
    private List<GroupAccessDto> subGroupAccess;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<GroupAccessDto> getSubGroupAccess() {
        return subGroupAccess;
    }

    public void setSubGroupAccess(List<GroupAccessDto> subGroupAccess) {
        this.subGroupAccess = subGroupAccess;
    }
}
