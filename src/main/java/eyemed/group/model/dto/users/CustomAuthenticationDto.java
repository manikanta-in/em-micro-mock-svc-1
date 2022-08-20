package eyemed.group.model.dto.users;



import java.util.Collection;

public class CustomAuthenticationDto {
    private Object principal;
    private Object credentials;

    public CustomAuthenticationDto(Collection authorities) {

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
