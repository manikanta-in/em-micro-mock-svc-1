package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class BillDefineDto implements Serializable {
    private String billingEntityCk;
    private DateTime effectiveDate;
    private DateTime termDate;
    private String billType;
    private String mctrStatement;
    private String stockIndicator;
    private String billGeneralMeth;
    private String billingGeneralValue;
    private String dueDay;
    private String billingDefineMode;
    private String syncMonth;
    private String prorateMeth;
    private String prorateValue;
    private String anniversaryMonthDay;
    private String gracePeriod;
    private String tolMeth;
    private String tolPercent;
    private String tolAmount;
    private String pmfePfx;
    private String pmdsPfx;
    private String pmddPfx;
    private String mdpIndicator;
    private String numberMode;
    private int lockToken;
    private int billingDefinelockToken;
    private DateTime atxrSourceId;

    public String getBillingEntityCk() {
        return billingEntityCk;
    }

    public void setBillingEntityCk(String billingEntityCk) {
        this.billingEntityCk = billingEntityCk;
    }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public DateTime getTermDate() {
        return termDate;
    }

    public void setTermDate(DateTime termDate) {
        this.termDate = termDate;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getMctrStatement() {
        return mctrStatement;
    }

    public void setMctrStatement(String mctrStatement) {
        this.mctrStatement = mctrStatement;
    }

    public String getStockIndicator() {
        return stockIndicator;
    }

    public void setStockIndicator(String stockIndicator) {
        this.stockIndicator = stockIndicator;
    }

    public String getBillGeneralMeth() {
        return billGeneralMeth;
    }

    public void setBillGeneralMeth(String billGeneralMeth) {
        this.billGeneralMeth = billGeneralMeth;
    }

    public String getBillingGeneralValue() {
        return billingGeneralValue;
    }

    public void setBillingGeneralValue(String billingGeneralValue) {
        this.billingGeneralValue = billingGeneralValue;
    }

    public String getDueDay() {
        return dueDay;
    }

    public void setDueDay(String dueDay) {
        this.dueDay = dueDay;
    }

    public String getBillingDefineMode() {
        return billingDefineMode;
    }

    public void setBillingDefineMode(String billingDefineMode) {
        this.billingDefineMode = billingDefineMode;
    }

    public String getSyncMonth() {
        return syncMonth;
    }

    public void setSyncMonth(String syncMonth) {
        this.syncMonth = syncMonth;
    }

    public String getProrateMeth() {
        return prorateMeth;
    }

    public void setProrateMeth(String prorateMeth) {
        this.prorateMeth = prorateMeth;
    }

    public String getProrateValue() {
        return prorateValue;
    }

    public void setProrateValue(String prorateValue) {
        this.prorateValue = prorateValue;
    }

    public String getAnniversaryMonthDay() {
        return anniversaryMonthDay;
    }

    public void setAnniversaryMonthDay(String anniversaryMonthDay) {
        this.anniversaryMonthDay = anniversaryMonthDay;
    }

    public String getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getTolMeth() {
        return tolMeth;
    }

    public void setTolMeth(String tolMeth) {
        this.tolMeth = tolMeth;
    }

    public String getTolPercent() {
        return tolPercent;
    }

    public void setTolPercent(String tolPercent) {
        this.tolPercent = tolPercent;
    }

    public String getTolAmount() {
        return tolAmount;
    }

    public void setTolAmount(String tolAmount) {
        this.tolAmount = tolAmount;
    }

    public String getPmfePfx() {
        return pmfePfx;
    }

    public void setPmfePfx(String pmfePfx) {
        this.pmfePfx = pmfePfx;
    }

    public String getPmdsPfx() {
        return pmdsPfx;
    }

    public void setPmdsPfx(String pmdsPfx) {
        this.pmdsPfx = pmdsPfx;
    }

    public String getPmddPfx() {
        return pmddPfx;
    }

    public void setPmddPfx(String pmddPfx) {
        this.pmddPfx = pmddPfx;
    }

    public String getMdpIndicator() {
        return mdpIndicator;
    }

    public void setMdpIndicator(String mdpIndicator) {
        this.mdpIndicator = mdpIndicator;
    }

    public String getNumberMode() {
        return numberMode;
    }

    public void setNumberMode(String numberMode) {
        this.numberMode = numberMode;
    }

    public int getLockToken() {
        return lockToken;
    }

    public void setLockToken(int lockToken) {
        this.lockToken = lockToken;
    }

    public int getBillingDefinelockToken() {
        return billingDefinelockToken;
    }

    public void setBillingDefinelockToken(int billingDefinelockToken) {
        this.billingDefinelockToken = billingDefinelockToken;
    }

    public DateTime getAtxrSourceId() {
        return atxrSourceId;
    }

    public void setAtxrSourceId(DateTime atxrSourceId) {
        this.atxrSourceId = atxrSourceId;
    }
}
