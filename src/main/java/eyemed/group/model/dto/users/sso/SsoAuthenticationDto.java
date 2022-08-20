package eyemed.group.model.dto.users.sso;



import java.util.Collection;

public class SsoAuthenticationDto {
    private Object principal;
    private Object credentials;

    public SsoAuthenticationDto(Collection authorities) {

    }


    public Object getPrincipal() {
        return principal;
    }

    public void setPrincipal(Object principal) {
        this.principal = principal;
    }


    public Object getCredentials() {
        return credentials;
    }

    public void setCredentials(Object credentials) {
        this.credentials = credentials;
    }
}
