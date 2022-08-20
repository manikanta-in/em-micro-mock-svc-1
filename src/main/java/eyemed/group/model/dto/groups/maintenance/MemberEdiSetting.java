package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class MemberEdiSetting implements Serializable {

    private int groupCk;
    private int subgroupCk;
    private String impliedTermDateCode;
    private String privacyAddressOverwriteCode;
    private boolean bypassSubgroupTerm;
    private boolean allowBlankEffDate;
    private boolean preventOverwrite;
    private boolean loadByBenefit;
    private boolean loadByDivision;
    private boolean loadByLocation;
    private boolean loadByCompany;
    private boolean manualApproval;
    private int retainManualAddDays;
    private int threshAddCount;
    private int threshAddPercent;
    private int threshTermCount;
    private int threshTermPercent;
    private int threshChangeCount;
    private int threshChangePercent;
    private int threshReinstateCount;
    private int threshReinstatePercent;
    private int threshErrorCount;
    private int threshErrorPercent;
    private DateTime loggedDatetime;
    private String loggedBy; // 60 bytes

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

    public String getImpliedTermDateCode() {
        return impliedTermDateCode;
    }

    public void setImpliedTermDateCode(String impliedTermDateCode) {
        this.impliedTermDateCode = impliedTermDateCode;
    }

    public String getPrivacyAddressOverwriteCode() {
        return privacyAddressOverwriteCode;
    }

    public void setPrivacyAddressOverwriteCode(String privacyAddressOverwriteCode) {
        this.privacyAddressOverwriteCode = privacyAddressOverwriteCode;
    }

    public boolean isBypassSubgroupTerm() { return bypassSubgroupTerm; }

    public void setBypassSubgroupTerm(boolean bypassSubgroupTerm) { this.bypassSubgroupTerm = bypassSubgroupTerm; }

    public boolean isAllowBlankEffDate() { return allowBlankEffDate; }

    public void setAllowBlankEffDate(boolean allowBlankEffDate) { this.allowBlankEffDate = allowBlankEffDate; }

    public boolean isPreventOverwrite() { return preventOverwrite; }

    public void setPreventOverwrite(boolean preventOverwrite) { this.preventOverwrite = preventOverwrite; }

    public boolean isLoadByBenefit() { return loadByBenefit; }

    public void setLoadByBenefit(boolean loadByBenefit) { this.loadByBenefit = loadByBenefit; }

    public boolean isLoadByDivision() { return loadByDivision; }

    public void setLoadByDivision(boolean loadByDivision) { this.loadByDivision = loadByDivision; }

    public boolean isLoadByLocation() { return loadByLocation; }

    public void setLoadByLocation(boolean loadByLocation) { this.loadByLocation = loadByLocation; }

    public boolean isLoadByCompany() { return loadByCompany; }

    public void setLoadByCompany(boolean loadByCompany) { this.loadByCompany = loadByCompany; }

    public boolean isManualApproval() { return manualApproval; }

    public void setManualApproval(boolean manualApproval) { this.manualApproval = manualApproval; }

    public int getRetainManualAddDays() {
        return retainManualAddDays;
    }

    public void setRetainManualAddDays(int retainManualAddDays) {
        this.retainManualAddDays = retainManualAddDays;
    }

    public int getThreshAddCount() {
        return threshAddCount;
    }

    public void setThreshAddCount(int threshAddCount) {
        this.threshAddCount = threshAddCount;
    }

    public int getThreshAddPercent() { return threshAddPercent; }

    public void setThreshAddPercent(int threshAddPercent) {
        this.threshAddPercent = threshAddPercent;
    }

    public int getThreshTermCount() {
        return threshTermCount;
    }

    public void setThreshTermCount(int threshTermCount) {
        this.threshTermCount = threshTermCount;
    }

    public int getThreshTermPercent() {
        return threshTermPercent;
    }

    public void setThreshTermPercent(int threshTermPercent) {
        this.threshTermPercent = threshTermPercent;
    }

    public int getThreshChangeCount() {
        return threshChangeCount;
    }

    public void setThreshChangeCount(int threshChangeCount) {
        this.threshChangeCount = threshChangeCount;
    }

    public int getThreshChangePercent() {
        return threshChangePercent;
    }

    public void setThreshChangePercent(int threshChangePercent) {
        this.threshChangePercent = threshChangePercent;
    }

    public int getThreshReinstateCount() {
        return threshReinstateCount;
    }

    public void setThreshReinstateCount(int threshReinstateCount) {
        this.threshReinstateCount = threshReinstateCount;
    }

    public int getThreshReinstatePercent() { return threshReinstatePercent; }

    public void setThreshReinstatePercent(int threshReinstatePercent) { this.threshReinstatePercent = threshReinstatePercent; }

    public int getThreshErrorCount() {
        return threshErrorCount;
    }

    public void setThreshErrorCount(int threshErrorCount) {
        this.threshErrorCount = threshErrorCount;
    }

    public int getThreshErrorPercent() {
        return threshErrorPercent;
    }

    public void setThreshErrorPercent(int threshErrorPercent) {
        this.threshErrorPercent = threshErrorPercent;
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
