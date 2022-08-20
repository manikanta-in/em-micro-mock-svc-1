package eyemed.group.model.dto.users.sso;

import eyemed.group.model.dto.users.UserSecurityDto;

import java.io.Serializable;

public class SamlAuthDetailsDto  implements Serializable {
    private boolean authenticated;
    private UserSecurityDto userSecurityDto;

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public UserSecurityDto getUserSecurityDto() {
        return userSecurityDto;
    }

    public void setUserSecurityDto(UserSecurityDto userSecurityDto) {
        this.userSecurityDto = userSecurityDto;
    }
}
