package eyemed.group.model.dto.invoice;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class ResponseClientPaymentMethodDto  implements Serializable {
    private String groupCk;
    private String createDate;
    private String createUser;
    private String modifyDate;
    private String modifyUser;
    private String taxId;
    private String subGroupCk;
    private String token;
    private String paymentMethodID;
    private String lastFour;
    private String cardType;
    private String autoPayInd;
    private String expirationMonYear;
    private String accountNumber;
    private String routingNumber;
    private String paymentType;
    private String email;
    private String status;

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPaymentMethodID() {
        return paymentMethodID;
    }

    public void setPaymentMethodID(String paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
    }

    public String getLastFour() {
        return lastFour;
    }

    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getAutoPayInd() {
        return autoPayInd;
    }

    public void setAutoPayInd(String autoPayInd) {
        this.autoPayInd = autoPayInd;
    }

    public String getExpirationMonYear() {
        return expirationMonYear;
    }

    public void setExpirationMonYear(String expirationMonYear) {
        this.expirationMonYear = expirationMonYear;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    /** Returns a String representation of this object. */
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
