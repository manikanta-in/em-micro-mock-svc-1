package eyemed.group.model.dto.users;

import java.io.Serializable;
import java.sql.Timestamp;

public class TokenRequestDto implements Serializable {

    private String token;
    private Timestamp expiration;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getExpiration() {
        return expiration;
    }

    public void setExpiration(Timestamp expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "TokenRequestDto{"
                + "token='" + token + "'"
                + "expiration='" + expiration.toString() + "'"
                + '}';
    }
}
