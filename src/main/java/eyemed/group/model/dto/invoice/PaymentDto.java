package eyemed.group.model.dto.invoice;

import java.io.Serializable;
import java.math.BigDecimal;

public class PaymentDto implements Serializable {
    private String groupCk,subGroupCk,transactionId,paymentmethodId,invoiceNumber;
    private BigDecimal paidAmount;

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentmethodId() {
        return paymentmethodId;
    }

    public void setPaymentmethodId(String paymentmethodId) {
        this.paymentmethodId = paymentmethodId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getSubGroupCk() {return subGroupCk;}

    public void setSubGroupCk(String subGroupCk) {this.subGroupCk = subGroupCk;}
}
