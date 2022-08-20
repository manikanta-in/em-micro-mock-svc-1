package eyemed.group.model.dto.groups;

import eyemed.group.model.dto.users.AccessDto;

import java.io.Serializable;

public class UserSsoGroupRequestDto implements Serializable {
    private String clientId;
    private Integer parentGroupCk;
    private AccessDto accessDto;
    private String systemName;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getParentGroupCk() {
        return parentGroupCk;
    }

    public void setParentGroupCk(Integer parentGroupCk) {
        this.parentGroupCk = parentGroupCk;
    }

    public AccessDto getAccessDto() {
        return accessDto;
    }

    public void setAccessDto(AccessDto accessDto) {
        this.accessDto = accessDto;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}

