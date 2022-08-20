package eyemed.group.model.dto.applications;

import java.io.Serializable;
import java.sql.Date;

public class ClientApplicationRecipientDto implements Serializable {



    private int applicationId;
    private String recipientUuid;
    private int recipientKey;
    private String name;
    private String email;
    private String envelopeId;
    private String dsRecipientId;
    private String routingOrder;
    private Date completedDate;

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getRecipientUuid() {
        return recipientUuid;
    }

    public void setRecipientUuid(String recipientUuid) {
        this.recipientUuid = recipientUuid;
    }

    public int getRecipientKey() {
        return recipientKey;
    }

    public void setRecipientKey(int recipientKey) {
        this.recipientKey = recipientKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getDsRecipientId() {
        return dsRecipientId;
    }

    public void setDsRecipientId(String dsRecipientId) {
        this.dsRecipientId = dsRecipientId;
    }

    public String getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }
}
