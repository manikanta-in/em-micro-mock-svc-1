package eyemed.group.model.dto.users;

import java.io.Serializable;

public class UserSearchResponseDto implements Serializable {
    private UserDto user;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
