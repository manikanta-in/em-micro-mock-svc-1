package eyemed.group.model.dto.groups;

/*
 * @author Vijayakumar Ramaswamy
 * @since 12/6/2018 10:12 AM
 */
public class GroupContactsDto {
    private String groupId;
    private String groupName;
    private String groupCk;
    private String name;
    private String phone;
    private String email;
    private String fax;
    private String title;
    private boolean emailInvoice;
    private String accountType;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEmailInvoice() {
        return emailInvoice;
    }

    public void setEmailInvoice(boolean emailInvoice) {
        this.emailInvoice = emailInvoice;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
