package eyemed.group.model.dto.users;

import org.joda.time.DateTime;

import java.io.Serializable;

public class UserDto implements Serializable {
    private String userId;
    private String email;
    private String accountType ;
    private String firstName ;
    private String lastName ;
    private boolean emailInvoice;
    private boolean agreement;
    private String status;
    private String registrationToken;
    private DateTime registrationExpiration;
    private String createdDate;
    private String createdBy;
    private String modifiedDate;
    private String modifiedBy;

    private String phone;
    private boolean isSsoUser;

    public boolean isSsoUser() {
        return isSsoUser;
    }

    public void setSsoUser(boolean ssoUser) {
        isSsoUser = ssoUser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    private String ext;

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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
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

    public boolean isEmailInvoice() {
        return emailInvoice;
    }

    public void setEmailInvoice(boolean emailInvoice) {
        this.emailInvoice = emailInvoice;
    }

    public boolean isAgreement() {
        return agreement;
    }

    public void setAgreement(boolean agreement) {
        this.agreement = agreement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistrationToken() {
        return registrationToken;
    }

    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    public DateTime getRegistrationExpiration() {
        return registrationExpiration;
    }

    public void setRegistrationExpiration(DateTime registrationExpiration) {
        this.registrationExpiration = registrationExpiration;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
