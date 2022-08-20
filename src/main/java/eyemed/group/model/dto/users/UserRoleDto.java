package eyemed.group.model.dto.users;

import java.io.Serializable;
import java.util.List;

public class UserRoleDto implements Serializable {
    public enum UserType {
        Internal,
        External
    }

    private UserType userType;
    private String userRole;
    private boolean paperlessSelectionRequired;
    private boolean securityChanged;
    private UserDto user;
    private AccessDto minimumAccess;
    private List<GroupAccessDto> subGroupAccess;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public boolean isSecurityChanged() {
        return securityChanged;
    }

    public void setSecurityChanged(boolean securityChanged) {
        this.securityChanged = securityChanged;
    }

    public boolean isPaperlessSelectionRequired() {
        return paperlessSelectionRequired;
    }

    public void setPaperlessSelectionRequired(boolean paperlessSelectionRequired) {
        this.paperlessSelectionRequired = paperlessSelectionRequired;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public AccessDto getMinimumAccess() {
        return minimumAccess;
    }

    public void setMinimumAccess(AccessDto minimumAccess) {
        this.minimumAccess = minimumAccess;
    }

    public List<GroupAccessDto> getSubGroupAccess() {
        return subGroupAccess;
    }

    public void setSubGroupAccess(List<GroupAccessDto> subGroupAccess) {
        this.subGroupAccess = subGroupAccess;
    }
}
