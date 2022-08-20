package eyemed.group.model.dto.users;

public class UserPasswordDto {
    private String userId;
    private String password;
    private String ssoToken;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public String getSsoToken() {
        return ssoToken;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
