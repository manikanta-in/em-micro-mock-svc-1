package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.HashMap;

public class GroupClientSetting implements Serializable {

    private int groupCk;
    private int subgroupCk;
    private boolean ivrEnabled;
    private String discountOrWriteOffCode;
    private String eligibilityPhone;
    private HashMap<String,String> eligibilityPhoneBySubGroup;
    private String thirdPartyCode;
    private String invoiceDistributionMethod;
    private String eobDistributionMethod;
    private String invoiceTemplate;
    private String suppressMemberId;
    private boolean mailInvoiceToEyemed;
    private boolean sbsbIdHideOnRoster;
    private String oonClaimFormUrl;
    private String consoleInvoice;
    private String groupNameToDisplay;
    private String consoleBillingCode;
    private String alternateNameToDisplay;
    private String billingDataFeed;
    private String eobTemplateId;
    private String afaBillingFrequency;
    private String clientLogo;
    private boolean clientShipToAddress;
    private String memberWebUrl;
    private String memberReportFieldToPrint;
    private String memberSourceId;
    private String micrositeUrl;
    private String resellerMemberLookUp;
    private boolean aliasNameEnabled;
    private String clientAliasName;

    private boolean webDisplayFlag;
    private String micrositeClientId;
    private String ssoProfileId;
    private String specialOfferPackage;
    private boolean excludeFromOffersFlag;
    private boolean hasInternational;
    private boolean hasKbyg;
    private boolean hasMemberBlock;
    private DateTime csinLockedDateTime;
    private String csinLockedBy;

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

    public boolean isIvrEnabled() {
        return ivrEnabled;
    }

    public void setIvrEnabled(boolean ivrEnabled) {
        this.ivrEnabled = ivrEnabled;
    }

    public String getDiscountOrWriteOffCode() {
        return discountOrWriteOffCode;
    }

    public void setDiscountOrWriteOffCode(String discountOrWriteOffCode) {
        this.discountOrWriteOffCode = discountOrWriteOffCode;
    }

    public String getEligibilityPhone() {
        return eligibilityPhone;
    }

    public void setEligibilityPhone(String eligibilityPhone) {
        this.eligibilityPhone = eligibilityPhone;
    }

    public HashMap<String, String> getEligibilityPhoneBySubGroup() {
        return eligibilityPhoneBySubGroup;
    }

    public void setEligibilityPhoneBySubGroup(HashMap<String, String> eligibilityPhoneBySubGroup) {
        this.eligibilityPhoneBySubGroup = eligibilityPhoneBySubGroup;
    }

    public String getThirdPartyCode() {
        return thirdPartyCode;
    }

    public void setThirdPartyCode(String thirdPartyCode) {
        this.thirdPartyCode = thirdPartyCode;
    }

    public String getInvoiceDistributionMethod() {
        return invoiceDistributionMethod;
    }

    public void setInvoiceDistributionMethod(String invoiceDistributionMethod) {
        this.invoiceDistributionMethod = invoiceDistributionMethod;
    }

    public String getEobDistributionMethod() {
        return eobDistributionMethod;
    }

    public void setEobDistributionMethod(String eobDistributionMethod) {
        this.eobDistributionMethod = eobDistributionMethod;
    }

    public String getInvoiceTemplate() {
        return invoiceTemplate;
    }

    public void setInvoiceTemplate(String invoiceTemplate) {
        this.invoiceTemplate = invoiceTemplate;
    }

    public String getSuppressMemberId() {
        return suppressMemberId;
    }

    public void setSuppressMemberId(String suppressMemberId) {
        this.suppressMemberId = suppressMemberId;
    }

    public boolean isMailInvoiceToEyemed() {
        return mailInvoiceToEyemed;
    }

    public void setMailInvoiceToEyemed(boolean mailInvoiceToEyemed) {
        this.mailInvoiceToEyemed = mailInvoiceToEyemed;
    }

    public boolean isSbsbIdHideOnRoster() {
        return sbsbIdHideOnRoster;
    }

    public void setSbsbIdHideOnRoster(boolean sbsbIdHideOnRoster) {
        this.sbsbIdHideOnRoster = sbsbIdHideOnRoster;
    }

    public String getOonClaimFormUrl() {
        return oonClaimFormUrl;
    }

    public void setOonClaimFormUrl(String oonClaimFormUrl) {
        this.oonClaimFormUrl = oonClaimFormUrl;
    }

    public String getConsoleInvoice() {
        return consoleInvoice;
    }

    public void setConsoleInvoice(String consoleInvoice) {
        this.consoleInvoice = consoleInvoice;
    }

    public String getGroupNameToDisplay() {
        return groupNameToDisplay;
    }

    public void setGroupNameToDisplay(String groupNameToDisplay) {
        this.groupNameToDisplay = groupNameToDisplay;
    }

    public String getConsoleBillingCode() {
        return consoleBillingCode;
    }

    public void setConsoleBillingCode(String consoleBillingCode) {
        this.consoleBillingCode = consoleBillingCode;
    }

    public String getAlternateNameToDisplay() {
        return alternateNameToDisplay;
    }

    public void setAlternateNameToDisplay(String alternateNameToDisplay) {
        this.alternateNameToDisplay = alternateNameToDisplay;
    }

    public String getBillingDataFeed() {
        return billingDataFeed;
    }

    public void setBillingDataFeed(String billingDataFeed) {
        this.billingDataFeed = billingDataFeed;
    }

    public String getEobTemplateId() {
        return eobTemplateId;
    }

    public void setEobTemplateId(String eobTemplateId) {
        this.eobTemplateId = eobTemplateId;
    }

    public String getAfaBillingFrequency() {
        return afaBillingFrequency;
    }

    public void setAfaBillingFrequency(String afaBillingFrequency) {
        this.afaBillingFrequency = afaBillingFrequency;
    }

    public String getClientLogo() {
        return clientLogo;
    }

    public void setClientLogo(String clientLogo) {
        this.clientLogo = clientLogo;
    }

    public boolean isClientShipToAddress() {
        return clientShipToAddress;
    }

    public void setClientShipToAddress(boolean clientShipToAddress) {
        this.clientShipToAddress = clientShipToAddress;
    }

    public String getMemberWebUrl() {
        return memberWebUrl;
    }

    public void setMemberWebUrl(String memberWebUrl) {
        this.memberWebUrl = memberWebUrl;
    }

    public String getMemberReportFieldToPrint() {
        return memberReportFieldToPrint;
    }

    public void setMemberReportFieldToPrint(String memberReportFieldToPrint) {
        this.memberReportFieldToPrint = memberReportFieldToPrint;
    }

    public String getMemberSourceId() {
        return memberSourceId;
    }

    public void setMemberSourceId(String memberSourceId) {
        this.memberSourceId = memberSourceId;
    }

    public String getMicrositeUrl() {
        return micrositeUrl;
    }

    public void setMicrositeUrl(String micrositeUrl) {
        this.micrositeUrl = micrositeUrl;
    }

    public String getResellerMemberLookUp() {
        return resellerMemberLookUp;
    }

    public void setResellerMemberLookUp(String resellerMemberLookUp) {
        this.resellerMemberLookUp = resellerMemberLookUp;
    }

    public boolean isAliasNameEnabled() {
        return aliasNameEnabled;
    }

    public void setAliasNameEnabled(boolean aliasNameEnabled) {
        this.aliasNameEnabled = aliasNameEnabled;
    }

    public String getClientAliasName() {
        return clientAliasName;
    }

    public void setClientAliasName(String clientAliasName) {
        this.clientAliasName = clientAliasName;
    }

    public boolean isWebDisplayFlag() {
        return webDisplayFlag;
    }

    public void setWebDisplayFlag(boolean webDisplayFlag) {
        this.webDisplayFlag = webDisplayFlag;
    }

    public String getMicrositeClientId() {
        return micrositeClientId;
    }

    public void setMicrositeClientId(String micrositeClientId) {
        this.micrositeClientId = micrositeClientId;
    }

    public String getSsoProfileId() {
        return ssoProfileId;
    }

    public void setSsoProfileId(String ssoProfileId) {
        this.ssoProfileId = ssoProfileId;
    }

    public String getSpecialOfferPackage() {
        return specialOfferPackage;
    }

    public void setSpecialOfferPackage(String specialOfferPackage) {
        this.specialOfferPackage = specialOfferPackage;
    }

    public boolean isExcludeFromOffersFlag() {
        return excludeFromOffersFlag;
    }

    public void setExcludeFromOffersFlag(boolean excludeFromOffersFlag) {
        this.excludeFromOffersFlag = excludeFromOffersFlag;
    }

    public boolean isHasInternational() {
        return hasInternational;
    }

    public void setHasInternational(boolean hasInternational) {
        this.hasInternational = hasInternational;
    }

    public boolean isHasKbyg() {
        return hasKbyg;
    }

    public void setHasKbyg(boolean hasKbyg) {
        this.hasKbyg = hasKbyg;
    }

    public boolean isHasMemberBlock() {
        return hasMemberBlock;
    }

    public void setHasMemberBlock(boolean hasMemberBlock) {
        this.hasMemberBlock = hasMemberBlock;
    }

    public DateTime getCsinLockedDateTime() {
        return csinLockedDateTime;
    }

    public void setCsinLockedDateTime(DateTime csinLockedDateTime) {
        this.csinLockedDateTime = csinLockedDateTime;
    }

    public String getCsinLockedBy() {
        return csinLockedBy;
    }

    public void setCsinLockedBy(String csinLockedBy) {
        this.csinLockedBy = csinLockedBy;
    }
}
