package eyemed.group.model.dto.users;

import java.io.Serializable;

public class UserSecurityDto implements Serializable {
private UserDto user;
private UserRoleDto userRole;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public UserRoleDto getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRoleDto userRole) {
        this.userRole = userRole;
    }
}
