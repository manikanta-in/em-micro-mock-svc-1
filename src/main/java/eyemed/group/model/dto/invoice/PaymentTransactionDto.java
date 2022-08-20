package eyemed.group.model.dto.invoice;

import java.io.Serializable;
import java.util.Set;

public class PaymentTransactionDto implements Serializable {
    private String lineOfBusiness,totalAmount,paymentMethodId, transactionId;
    private Set<PaymentDto> payment;

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Set<PaymentDto> getPayment() {
        return payment;
    }

    public void setPayment(Set<PaymentDto> payment) {
        this.payment = payment;
    }
}
