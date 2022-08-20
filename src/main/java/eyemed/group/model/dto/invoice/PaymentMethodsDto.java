package eyemed.group.model.dto.invoice;

import java.io.Serializable;

public class PaymentMethodsDto implements Serializable {
    private String    subgroupCk;
    private String    groupCk;
    private String    transaction_id; //is from cybersource
    private String    req_reference_number;
    private String    req_payment_method;
    private String    payment_token;
    private String    req_card_number;
    private String    req_card_type;
    private String    req_echeck_account_number;
    private String    req_echeck_routing_number;
    private String    req_card_expiry_date;
    private String    req_bill_to_email;
    private String    decision;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getReq_reference_number() {
        return req_reference_number;
    }

    public void setReq_reference_number(String req_reference_number) {
        this.req_reference_number = req_reference_number;
    }

    public String getSubgroupCk() {
        return subgroupCk;
    }

    public void setSubgroupCk(String subgroupCk) {
        this.subgroupCk = subgroupCk;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getReq_payment_method() {
        return req_payment_method;
    }

    public void setReq_payment_method(String req_payment_method) {
        this.req_payment_method = req_payment_method;
    }

    public String getPayment_token() {
        return payment_token;
    }

    public void setPayment_token(String payment_token) {
        this.payment_token = payment_token;
    }

    public String getReq_card_number() {
        return req_card_number;
    }

    public void setReq_card_number(String req_card_number) {
        this.req_card_number = req_card_number;
    }

    public String getReq_card_type() {
        return req_card_type;
    }

    public void setReq_card_type(String req_card_type) {
        this.req_card_type = req_card_type;
    }

    public String getReq_echeck_account_number() {
        return req_echeck_account_number;
    }

    public void setReq_echeck_account_number(String req_echeck_account_number) {
        this.req_echeck_account_number = req_echeck_account_number;
    }

    public String getReq_echeck_routing_number() {
        return req_echeck_routing_number;
    }

    public void setReq_echeck_routing_number(String req_echeck_routing_number) {
        this.req_echeck_routing_number = req_echeck_routing_number;
    }

    public String getReq_card_expiry_date() {
        return req_card_expiry_date;
    }

    public void setReq_card_expiry_date(String req_card_expiry_date) {
        this.req_card_expiry_date = req_card_expiry_date;
    }

    public String getReq_bill_to_email() {
        return req_bill_to_email;
    }

    public void setReq_bill_to_email(String req_bill_to_email) {
        this.req_bill_to_email = req_bill_to_email;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
}
