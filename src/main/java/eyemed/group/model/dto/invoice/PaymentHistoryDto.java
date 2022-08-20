package eyemed.group.model.dto.invoice;

import java.io.Serializable;
import java.math.BigDecimal;

public class PaymentHistoryDto implements Serializable {

    private String paymentId,paymentRef,paymentType, invoiceNo,invoiceType,invoiceDescription,invoicePayerType,groupCk,subgroupCk,groupId,subGroupId,pmtStatus,invoiceDate,paidDate,billMonth,seq,paidUser;
    private BigDecimal billAmt,balanceAmt,adjustAmt,paidAmt;

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public String getInvoicePayerType() {
        return invoicePayerType;
    }

    public void setInvoicePayerType(String invoicePayerType) {
        this.invoicePayerType = invoicePayerType;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubgroupCk() {
        return subgroupCk;
    }

    public void setSubgroupCk(String subgroupCk) {
        this.subgroupCk = subgroupCk;
    }

    public String getPmtStatus() {
        return pmtStatus;
    }

    public void setPmtStatus(String pmtStatus) {
        this.pmtStatus = pmtStatus;
    }

    public BigDecimal getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(BigDecimal billAmt) {
        this.billAmt = billAmt;
    }

    public BigDecimal getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(BigDecimal balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public BigDecimal getAdjustAmt() {
        return adjustAmt;
    }

    public void setAdjustAmt(BigDecimal adjustAmt) {
        this.adjustAmt = adjustAmt;
    }

    public BigDecimal getPaidAmt() {
        return paidAmt;
    }

    public void setPaidAmt(BigDecimal paidAmt) {
        this.paidAmt = paidAmt;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getSeq() {return seq;}

    public void setSeq(String seq) {this.seq = seq;}

    public String getPaidUser() {return paidUser;}

    public void setPaidUser(String paidUser) {this.paidUser = paidUser;}

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }
}
