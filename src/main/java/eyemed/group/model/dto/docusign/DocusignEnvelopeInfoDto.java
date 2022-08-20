package eyemed.group.model.dto.docusign;

import java.util.ArrayList;
import java.util.List;

public class DocusignEnvelopeInfoDto {
    private String envelopeId;
    private String status;
    private String subject;
    private String emailAddress;
    private String rawXml;
    private List<RecipientStatus> recipientStatuses = new ArrayList<>();
    private String salesforceObjectId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRawXml() {
        return rawXml;
    }

    public void setRawXml(String rawXml) {
        this.rawXml = rawXml;
    }

    public List<RecipientStatus> getRecipientStatuses() {
        return recipientStatuses;
    }

    public void setRecipientStatuses(List<RecipientStatus> recipientStatuses) {
        this.recipientStatuses = recipientStatuses;
    }

    public String getSalesforceObjectId() {
        return salesforceObjectId;
    }

    public void setSalesforceObjectId(String salesforceObjectId) {
        this.salesforceObjectId = salesforceObjectId;
    }


}
