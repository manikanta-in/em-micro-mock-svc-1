package eyemed.group.model.dto.members.transactions;

import org.joda.time.DateTime;

import java.io.Serializable;

public class TransactionSearchCriteriaDto implements Serializable {

    private String userId,transactionType,status,groupCk,subGroupCk,userType,transactionRole,loggingUser;

    private DateTime fromDate,toDate;

    public DateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(DateTime fromDate) {
        this.fromDate = fromDate;
    }

    public DateTime getToDate() {
        return toDate;
    }

    public void setToDate(DateTime toDate) {
        this.toDate = toDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getTransactionRole() {
        return transactionRole;
    }

    public void setTransactionRole(String transactionRole) {
        this.transactionRole = transactionRole;
    }

    public String getLoggingUser() {
        return loggingUser;
    }

    public void setLoggingUser(String loggingUser) {
        this.loggingUser = loggingUser;
    }

    public String getSubGroupCk() {return subGroupCk;}

    public void setSubGroupCk(String subGroupCk) {this.subGroupCk = subGroupCk;}
}
