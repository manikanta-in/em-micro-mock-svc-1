package eyemed.group.model.dto.users;

import java.io.Serializable;

public class AccessDto implements Serializable {
    private boolean primaryContact;
    private boolean memberSearchAllowed;
    private boolean memberMaintenanceAllowed;
    private boolean viewInvoicesAllowed;
    private boolean createGroupUsersAllowed;


    public boolean isPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(boolean primaryContact) {
        this.primaryContact = primaryContact;
    }

    public boolean isMemberSearchAllowed() {
        return memberSearchAllowed;
    }

    public void setMemberSearchAllowed(boolean memberSearchAllowed) {
        this.memberSearchAllowed = memberSearchAllowed;
    }

    public boolean isMemberMaintenanceAllowed() {
        return memberMaintenanceAllowed;
    }

    public void setMemberMaintenanceAllowed(boolean memberMaintenanceAllowed) {
        this.memberMaintenanceAllowed = memberMaintenanceAllowed;
    }

    public boolean isViewInvoicesAllowed() {
        return viewInvoicesAllowed;
    }

    public void setViewInvoicesAllowed(boolean viewInvoicesAllowed) {
        this.viewInvoicesAllowed = viewInvoicesAllowed;
    }

    public boolean isCreateGroupUsersAllowed() {
        return createGroupUsersAllowed;
    }

    public void setCreateGroupUsersAllowed(boolean createGroupUsersAllowed) {
        this.createGroupUsersAllowed = createGroupUsersAllowed;
    }
}
