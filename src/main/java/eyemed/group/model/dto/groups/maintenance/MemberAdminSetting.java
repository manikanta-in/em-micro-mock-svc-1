package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class MemberAdminSetting implements Serializable {

    private int groupCk;
    private int subgroupCk;
    private boolean manualAdd;
    private String benefitOptionCode;
    private String divisionOptionCode;
    private String locationOptionCode;
    private String companyOptionCode;
    private DateTime loggedDatetime;
    private String loggedBy;

    public int getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(int groupCk) {
        this.groupCk = groupCk;
    }

    public int getSubgroupCk() {
        return subgroupCk;
    }

    public void setSubgroupCk(int subgroupCk) {
        this.subgroupCk = subgroupCk;
    }

    public boolean isManualAdd() { return manualAdd; }

    public void setManualAdd(boolean manualAdd) { this.manualAdd = manualAdd; }

    public String getBenefitOptionCode() {
        return benefitOptionCode;
    }

    public void setBenefitOptionCode(String benefitOptionCode) {
        this.benefitOptionCode = benefitOptionCode;
    }

    public String getDivisionOptionCode() {
        return divisionOptionCode;
    }

    public void setDivisionOptionCode(String divisionOptionCode) {
        this.divisionOptionCode = divisionOptionCode;
    }

    public String getLocationOptionCode() {
        return locationOptionCode;
    }

    public void setLocationOptionCode(String locationOptionCode) {
        this.locationOptionCode = locationOptionCode;
    }

    public String getCompanyOptionCode() {
        return companyOptionCode;
    }

    public void setCompanyOptionCode(String companyOptionCode) {
        this.companyOptionCode = companyOptionCode;
    }

    public DateTime getLoggedDatetime() { return loggedDatetime; }

    public void setLoggedDatetime(DateTime loggedDatetime) { this.loggedDatetime = loggedDatetime; }

    public String getLoggedBy() {
        return loggedBy;
    }

    public void setLoggedBy(String loggedBy) {
        this.loggedBy = loggedBy;
    }
}
