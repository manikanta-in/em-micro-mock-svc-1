package eyemed.group.model.dto.docusign;

public class RecipientStatus {
    private String type;
    private String email;
    private String userName;
    private String routingOrder;
    private String recipientId;
    private String status;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
