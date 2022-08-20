package eyemed.group.model.dto.users.sso;

public class SamlMappedMember {
    private String userId;
    private String email;
    private String firstName;
    private String lastName;
    private boolean memberSearch;
    private boolean memberMaintenance;
    private boolean viewInvoices;
    private String contactFirstName;
    private String contactLastName;
    private String contactEmail;
    private String contactPhone;

    public boolean isMemberSearch() {
        return memberSearch;
    }

    public void setMemberSearch(boolean memberSearch) {
        this.memberSearch = memberSearch;
    }

    public boolean isMemberMaintenance() {
        return memberMaintenance;
    }

    public void setMemberMaintenance(boolean memberMaintenance) {
        this.memberMaintenance = memberMaintenance;
    }

    public boolean isViewInvoices() {
        return viewInvoices;
    }

    public void setViewInvoices(boolean viewInvoices) {
        this.viewInvoices = viewInvoices;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
