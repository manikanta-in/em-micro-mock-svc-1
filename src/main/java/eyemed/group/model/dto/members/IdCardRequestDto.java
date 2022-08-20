package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * @author Gopu Nanjan
 **/
public class IdCardRequestDto  implements Serializable {

    public String token;
    public String clientId;
    public String memberCk;
    public DateTime dateOfService;
    public String format;
    public String systemName;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getMemberCk() {
        return memberCk;
    }

    public void setMemberCk(String memberCk) {
        this.memberCk = memberCk;
    }

    public DateTime getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(DateTime dateOfService) {
        this.dateOfService = dateOfService;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
