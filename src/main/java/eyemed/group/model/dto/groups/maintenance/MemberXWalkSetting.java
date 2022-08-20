package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class MemberXWalkSetting implements Serializable {

    private int mecgCk;
    private String clientPlanId;
    private String clientSubgroupId;
    private String clientClassId;
    private String clientClassplanId;
    private String clientBenefitOptionCode;
    private String clientDivisionOptionCode;
    private String clientLocationOptionCode;
    private String clientCompanyOptionCode;
    private String clientGroupNumber;
    private String clientReportingCode1;
    private String clientReportingCode2;
    private String clientReportingCode3;
    private String clientReportingCode4;
    private String clientReportingCode5;
    private String facetsGroupId;
    private String facetsSubgroupId;
    private String facetsClassId;
    private String facetsClassplanId;
    private DateTime mecgEffectiveDate;
    private DateTime mecgTermDate;
    private boolean disabled;
    private DateTime loggedDatetime;
    private String loggedBy;

    public int getMecgCk() {
        return mecgCk;
    }

    public void setMecgCk(int mecgCk) {
        this.mecgCk = mecgCk;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String clientPlanId) {
        this.clientPlanId = clientPlanId;
    }

    public String getClientBenefitOptionCode() {
        return clientBenefitOptionCode;
    }

    public void setClientBenefitOptionCode(String clientBenefitOptionCode) {
        this.clientBenefitOptionCode = clientBenefitOptionCode;
    }

    public String getClientDivisionOptionCode() {
        return clientDivisionOptionCode;
    }

    public void setClientDivisionOptionCode(String clientDivisionOptionCode) {
        this.clientDivisionOptionCode = clientDivisionOptionCode;
    }

    public String getClientLocationOptionCode() {
        return clientLocationOptionCode;
    }

    public void setClientLocationOptionCode(String clientLocationOptionCode) {
        this.clientLocationOptionCode = clientLocationOptionCode;
    }

    public String getClientCompanyOptionCode() {
        return clientCompanyOptionCode;
    }

    public void setClientCompanyOptionCode(String clientCompanyOptionCode) {
        this.clientCompanyOptionCode = clientCompanyOptionCode;
    }

    public String getClientGroupNumber() {
        return clientGroupNumber;
    }

    public void setClientGroupNumber(String clientGroupNumber) {
        this.clientGroupNumber = clientGroupNumber;
    }

    public String getClientReportingCode1() {
        return clientReportingCode1;
    }

    public void setClientReportingCode1(String clientReportingCode1) {
        this.clientReportingCode1 = clientReportingCode1;
    }

    public String getClientReportingCode2() {
        return clientReportingCode2;
    }

    public void setClientReportingCode2(String clientReportingCode2) {
        this.clientReportingCode2 = clientReportingCode2;
    }

    public String getClientReportingCode3() {
        return clientReportingCode3;
    }

    public void setClientReportingCode3(String clientReportingCode3) {
        this.clientReportingCode3 = clientReportingCode3;
    }

    public String getClientReportingCode4() {
        return clientReportingCode4;
    }

    public void setClientReportingCode4(String clientReportingCode4) {
        this.clientReportingCode4 = clientReportingCode4;
    }

    public String getClientReportingCode5() {
        return clientReportingCode5;
    }

    public void setClientReportingCode5(String clientReportingCode5) {
        this.clientReportingCode5 = clientReportingCode5;
    }

    public String getClientSubgroupId() {
        return clientSubgroupId;
    }

    public void setClientSubgroupId(String clientSubgroupId) {
        this.clientSubgroupId = clientSubgroupId;
    }

    public String getClientClassId() {
        return clientClassId;
    }

    public void setClientClassId(String clientClassId) {
        this.clientClassId = clientClassId;
    }

    public String getClientClassplanId() {
        return clientClassplanId;
    }

    public void setClientClassplanId(String clientClassplanId) {
        this.clientClassplanId = clientClassplanId;
    }

    public String getFacetsGroupId() {
        return facetsGroupId;
    }

    public void setFacetsGroupId(String facetsGroupId) {
        this.facetsGroupId = facetsGroupId;
    }

    public String getFacetsSubgroupId() {
        return facetsSubgroupId;
    }

    public void setFacetsSubgroupId(String facetsSubgroupId) {
        this.facetsSubgroupId = facetsSubgroupId;
    }

    public String getFacetsClassId() {
        return facetsClassId;
    }

    public void setFacetsClassId(String facetsClassId) {
        this.facetsClassId = facetsClassId;
    }

    public String getFacetsClassplanId() {
        return facetsClassplanId;
    }

    public void setFacetsClassplanId(String facetsClassplanId) {
        this.facetsClassplanId = facetsClassplanId;
    }

    public DateTime getMecgEffectiveDate() { return mecgEffectiveDate; }

    public void setMecgEffectiveDate(DateTime mecgEffectiveDate) { this.mecgEffectiveDate = mecgEffectiveDate; }

    public DateTime getMecgTermDate() { return mecgTermDate; }

    public void setMecgTermDate(DateTime mecgTermDate) { this.mecgTermDate = mecgTermDate; }

    public boolean isDisabled() { return disabled; }

    public void setDisabled(boolean disabled) { this.disabled = disabled; }

    public DateTime getLoggedDatetime() { return loggedDatetime; }

    public void setLoggedDatetime(DateTime loggedDatetime) { this.loggedDatetime = loggedDatetime; }

    public String getLoggedBy() {
        return loggedBy;
    }

    public void setLoggedBy(String loggedBy) {
        this.loggedBy = loggedBy;
    }
}
