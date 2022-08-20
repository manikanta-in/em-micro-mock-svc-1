package eyemed.group.model.dto.groups;

import eyemed.group.model.dto.CodeDataDto;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 10/1/2018.
 */
public class SubGroupDto {

    private String subGroupCk;
    private String subGroupId;
    private String subGroupName;
    private String subGroupAlias;
    private String subGroupStatus;
    private String subGroupPrimaryContact;
    private DateTime effectiveDate;
    private DateTime terminationDate;
    private String memberIdSource;
    private String lobId;
    private boolean paymentsAvailable;
    private boolean creditCardEnabled;
    private String locationCodeSetting;
    private String companyCodeSetting;
    private String divisionCodeSetting;
    private String benefitOptionSetting;
    private List<String> locationCodes;
    private List<String> companyCodes;
    private List<String> divisionCodes;
    private List<String> benefitOptions;
    private DateTime groupEffectiveDate;
    private DateTime groupTerminationDate;
    private List<ClassPlanDto> classPlan;
    private int returnCode;
    private List<CodeDataDto> statuses;
    private String token;

    public SubGroupDto(){
        super();
        this.statuses = new ArrayList<CodeDataDto>();
        this.locationCodes = new ArrayList<>();
        this.companyCodes = new ArrayList<>();
        this.divisionCodes = new ArrayList<>();
        this.benefitOptions = new ArrayList<>();

    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public String getSubGroupAlias() {
        return subGroupAlias;
    }

    public void setSubGroupAlias(String subGroupAlias) {
        this.subGroupAlias = subGroupAlias;
    }

    public String getSubGroupStatus() {
        return subGroupStatus;
    }

    public void setSubGroupStatus(String subGroupStatus) {
        this.subGroupStatus = subGroupStatus;
    }

    public String getSubGroupPrimaryContact() {
        return subGroupPrimaryContact;
    }

    public void setSubGroupPrimaryContact(String subGroupPrimaryContact) {
        this.subGroupPrimaryContact = subGroupPrimaryContact;
    }

    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public DateTime getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(DateTime terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getMemberIdSource() {
        return memberIdSource;
    }

    public void setMemberIdSource(String memberIdSource) {
        this.memberIdSource = memberIdSource;
    }

    public String getLobId() {
        return lobId;
    }

    public void setLobId(String lobId) {
        this.lobId = lobId;
    }

    public boolean isPaymentsAvailable() {
        return paymentsAvailable;
    }

    public void setPaymentsAvailable(boolean paymentsAvailable) {
        this.paymentsAvailable = paymentsAvailable;
    }

    public boolean isCreditCardEnabled() {
        return creditCardEnabled;
    }

    public void setCreditCardEnabled(boolean creditCardEnabled) {
        this.creditCardEnabled = creditCardEnabled;
    }

    public String getLocationCodeSetting() {
        return locationCodeSetting;
    }

    public void setLocationCodeSetting(String locationCodeSetting) {
        this.locationCodeSetting = locationCodeSetting;
    }

    public String getCompanyCodeSetting() {
        return companyCodeSetting;
    }

    public void setCompanyCodeSetting(String companyCodeSetting) {
        this.companyCodeSetting = companyCodeSetting;
    }

    public String getDivisionCodeSetting() {
        return divisionCodeSetting;
    }

    public void setDivisionCodeSetting(String divisionCodeSetting) {
        this.divisionCodeSetting = divisionCodeSetting;
    }

    public String getBenefitOptionSetting() {
        return benefitOptionSetting;
    }

    public void setBenefitOptionSetting(String benefitOptionSetting) {
        this.benefitOptionSetting = benefitOptionSetting;
    }

    public List<String> getLocationCodes() {
        return locationCodes;
    }

    public void setLocationCodes(List<String> locationCodes) {
        this.locationCodes = locationCodes;
    }

    public List<String> getCompanyCodes() {
        return companyCodes;
    }

    public void setCompanyCodes(List<String> companyCodes) {
        this.companyCodes = companyCodes;
    }

    public List<String> getDivisionCodes() {
        return divisionCodes;
    }

    public void setDivisionCodes(List<String> divisionCodes) {
        this.divisionCodes = divisionCodes;
    }

    public List<String> getBenefitOptions() {
        return benefitOptions;
    }

    public void setBenefitOptions(List<String> benefitOptions) {
        this.benefitOptions = benefitOptions;
    }

    public void setGroupEffectiveDate(DateTime groupEffectiveDate) {
        this.groupEffectiveDate = groupEffectiveDate;
    }

    public DateTime getGroupTerminationDate() {
        return groupTerminationDate;
    }

    public void setGroupTerminationDate(DateTime groupTerminationDate) {
        this.groupTerminationDate = groupTerminationDate;
    }

    public List<ClassPlanDto> getClassPlan() {
        return classPlan;
    }

    public void setClassPlan(List<ClassPlanDto> classPlan) {
        this.classPlan = classPlan;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public List<CodeDataDto> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<CodeDataDto> statuses) {
        this.statuses = statuses;
    }

    public DateTime getGroupEffectiveDate() {
        return groupEffectiveDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
