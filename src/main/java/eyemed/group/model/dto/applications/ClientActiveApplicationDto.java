package eyemed.group.model.dto.applications;

import org.joda.time.DateTime;

import java.io.Serializable;

public class ClientActiveApplicationDto implements Serializable {
    private int applicationId;
    private String companyName;
    private DateTime createdDate;
    private DateTime effectiveDate;
    private String implementationId;
    private String docuSignEnvelopeId;
    private String docuSignAdminUrl;
    private String salesForceAdminUrl;
    private String status;
    private String fullName;
    private DateTime emailLastSentDate;

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
    }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getImplementationId() {
        return implementationId;
    }

    public void setImplementationId(String implementationId) {
        this.implementationId = implementationId;
    }

    public String getDocuSignEnvelopeId() {
        return docuSignEnvelopeId;
    }

    public void setDocuSignEnvelopeId(String docuSignEnvelopeId) {
        this.docuSignEnvelopeId = docuSignEnvelopeId;
    }

    public String getDocuSignAdminUrl() {
        return docuSignAdminUrl;
    }

    public void setDocuSignAdminUrl(String docuSignAdminUrl) {
        this.docuSignAdminUrl = docuSignAdminUrl;
    }

    public String getSalesForceAdminUrl() {
        return salesForceAdminUrl;
    }

    public void setSalesForceAdminUrl(String salesForceAdminUrl) {
        this.salesForceAdminUrl = salesForceAdminUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DateTime getEmailLastSentDate() {
        return emailLastSentDate;
    }

    public void setEmailLastSentDate(DateTime emailLastSentDate) {
        this.emailLastSentDate = emailLastSentDate;
    }
}
