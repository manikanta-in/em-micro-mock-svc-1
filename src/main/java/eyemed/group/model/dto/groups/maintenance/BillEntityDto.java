package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class BillEntityDto implements Serializable {
    private int lockToken;
    private String billLevel;
    private String netDue;
    private String netAllocSuspense;
    private DateTime latestBillDueDate;
    private DateTime latestBillEndDate;
    private DateTime latestApprovalDate;
    private DateTime latestPaidDueDate;
    private DateTime latestTlDueDate;
    private DateTime latestReconcileDueDate;
    private DateTime lastBillDate;
    private DateTime multipleDueDate;
    private DateTime multipleDueEndDate;
    private DateTime manToDueDate;
    private String pcsStatus;
    private String suspendBillIndicator;
    private DateTime latestArchiveDate;
    private String billBatchStatus;
    private String reconcileIndicator;
    private String eligibilityUpdateIndicator;
    private String sbsrIndicator;
    private String tolMeth;
    private String remitTotalAmount;
    private String remitTotalPercent;
    private String autoReconcileIndicator;
    private String billingEntityLockToken;
    private DateTime atxrSourceId;
    private DateTime aptcGraceDate;

    public int getLockToken() {
        return lockToken;
    }

    public void setLockToken(int lockToken) {
        this.lockToken = lockToken;
    }

    public String getBillLevel() {
        return billLevel;
    }

    public void setBillLevel(String billLevel) {
        this.billLevel = billLevel;
    }

    public String getNetDue() {
        return netDue;
    }

    public void setNetDue(String netDue) {
        this.netDue = netDue;
    }

    public String getNetAllocSuspense() {
        return netAllocSuspense;
    }

    public void setNetAllocSuspense(String netAllocSuspense) {
        this.netAllocSuspense = netAllocSuspense;
    }

    public DateTime getLatestBillDueDate() {
        return latestBillDueDate;
    }

    public void setLatestBillDueDate(DateTime latestBillDueDate) {
        this.latestBillDueDate = latestBillDueDate;
    }

    public DateTime getLatestBillEndDate() {
        return latestBillEndDate;
    }

    public void setLatestBillEndDate(DateTime latestBillEndDate) {
        this.latestBillEndDate = latestBillEndDate;
    }

    public DateTime getLatestApprovalDate() {
        return latestApprovalDate;
    }

    public void setLatestApprovalDate(DateTime latestApprovalDate) {
        this.latestApprovalDate = latestApprovalDate;
    }

    public DateTime getLatestPaidDueDate() {
        return latestPaidDueDate;
    }

    public void setLatestPaidDueDate(DateTime latestPaidDueDate) {
        this.latestPaidDueDate = latestPaidDueDate;
    }

    public DateTime getLatestTlDueDate() {
        return latestTlDueDate;
    }

    public void setLatestTlDueDate(DateTime latestTlDueDate) {
        this.latestTlDueDate = latestTlDueDate;
    }

    public DateTime getLatestReconcileDueDate() {
        return latestReconcileDueDate;
    }

    public void setLatestReconcileDueDate(DateTime latestReconcileDueDate) {
        this.latestReconcileDueDate = latestReconcileDueDate;
    }

    public DateTime getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(DateTime lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public DateTime getMultipleDueDate() {
        return multipleDueDate;
    }

    public void setMultipleDueDate(DateTime multipleDueDate) {
        this.multipleDueDate = multipleDueDate;
    }

    public DateTime getMultipleDueEndDate() {
        return multipleDueEndDate;
    }

    public void setMultipleDueEndDate(DateTime multipleDueEndDate) {
        this.multipleDueEndDate = multipleDueEndDate;
    }

    public DateTime getManToDueDate() {
        return manToDueDate;
    }

    public void setManToDueDate(DateTime manToDueDate) {
        this.manToDueDate = manToDueDate;
    }

    public String getPcsStatus() {
        return pcsStatus;
    }

    public void setPcsStatus(String pcsStatus) {
        this.pcsStatus = pcsStatus;
    }

    public String getSuspendBillIndicator() {
        return suspendBillIndicator;
    }

    public void setSuspendBillIndicator(String suspendBillIndicator) {
        this.suspendBillIndicator = suspendBillIndicator;
    }

    public DateTime getLatestArchiveDate() {
        return latestArchiveDate;
    }

    public void setLatestArchiveDate(DateTime latestArchiveDate) {
        this.latestArchiveDate = latestArchiveDate;
    }

    public String getBillBatchStatus() {
        return billBatchStatus;
    }

    public void setBillBatchStatus(String billBatchStatus) {
        this.billBatchStatus = billBatchStatus;
    }

    public String getReconcileIndicator() {
        return reconcileIndicator;
    }

    public void setReconcileIndicator(String reconcileIndicator) {
        this.reconcileIndicator = reconcileIndicator;
    }

    public String getEligibilityUpdateIndicator() {
        return eligibilityUpdateIndicator;
    }

    public void setEligibilityUpdateIndicator(String eligibilityUpdateIndicator) {
        this.eligibilityUpdateIndicator = eligibilityUpdateIndicator;
    }

    public String getSbsrIndicator() {
        return sbsrIndicator;
    }

    public void setSbsrIndicator(String sbsrIndicator) {
        this.sbsrIndicator = sbsrIndicator;
    }

    public String getTolMeth() {
        return tolMeth;
    }

    public void setTolMeth(String tolMeth) {
        this.tolMeth = tolMeth;
    }

    public String getRemitTotalAmount() {
        return remitTotalAmount;
    }

    public void setRemitTotalAmount(String remitTotalAmount) {
        this.remitTotalAmount = remitTotalAmount;
    }

    public String getRemitTotalPercent() {
        return remitTotalPercent;
    }

    public void setRemitTotalPercent(String remitTotalPercent) {
        this.remitTotalPercent = remitTotalPercent;
    }

    public String getAutoReconcileIndicator() {
        return autoReconcileIndicator;
    }

    public void setAutoReconcileIndicator(String autoReconcileIndicator) {
        this.autoReconcileIndicator = autoReconcileIndicator;
    }

    public String getBillingEntityLockToken() {
        return billingEntityLockToken;
    }

    public void setBillingEntityLockToken(String billingEntityLockToken) {
        this.billingEntityLockToken = billingEntityLockToken;
    }

    public DateTime getAtxrSourceId() {
        return atxrSourceId;
    }

    public void setAtxrSourceId(DateTime atxrSourceId) {
        this.atxrSourceId = atxrSourceId;
    }

    public DateTime getAptcGraceDate() {
        return aptcGraceDate;
    }

    public void setAptcGraceDate(DateTime aptcGraceDate) {
        this.aptcGraceDate = aptcGraceDate;
    }
}
