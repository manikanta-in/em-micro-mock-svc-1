
package eyemed.group.model.dto.applications;

import eyemed.group.model.dto.GenericAddressDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientContractDto {

    private String parentGroupId;
    private String companyName;
    private String groupName;
    private String groupTypeValue;
    private LocalDate effectiveDate;
    private String businessType;
    private String businessTypeOther;
    private String businessFeinTaxId;
    private GenericAddressDto businessAddress = new GenericAddressDto();
    private String serviceArea;
    private List<String> additionalStates = new ArrayList<>();
    private ContactExtendedDto primaryContact = new ContactExtendedDto();
    private ContactExtendedDto billingContact = new ContactExtendedDto();
    private String billingInvoiceSortIndicator;
    private String billingAddressMatchIndicator;
    private GenericAddressDto billingAddress = new GenericAddressDto();
    private MembershipSourceDto initialMembership = new MembershipSourceDto();
    private LocalDate initialMembershipDate;
    private LocalDate initialMembershipCobraDate;
    private String ongoingMembershipMatchIndicator;
    private MembershipSourceDto ongoingMembership = new MembershipSourceDto();
    private String existingBrokerId;
    private String primaryEyemanageUser;
    private ContactDto eyeManageContact = new ContactDto();
    private ContactDto businessCoordinator = new ContactDto();
    private String eligibleEmployees;

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupTypeValue() {
        return groupTypeValue;
    }

    public void setGroupTypeValue(String groupTypeValue) {
        this.groupTypeValue = groupTypeValue;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessTypeOther() {
        return businessTypeOther;
    }

    public void setBusinessTypeOther(String businessTypeOther) {
        this.businessTypeOther = businessTypeOther;
    }

    public String getBusinessFeinTaxId() {
        return businessFeinTaxId;
    }

    public void setBusinessFeinTaxId(String businessFeinTaxId) {
        this.businessFeinTaxId = businessFeinTaxId;
    }

    public GenericAddressDto getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(GenericAddressDto businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public List<String> getAdditionalStates() {
        return additionalStates;
    }

    public void setAdditionalStates(List<String> additionalStates) {
        this.additionalStates = additionalStates;
    }

    public ContactExtendedDto getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(ContactExtendedDto primaryContact) {
        this.primaryContact = primaryContact;
    }

    public ContactExtendedDto getBillingContact() {
        return billingContact;
    }

    public void setBillingContact(ContactExtendedDto billingContact) {
        this.billingContact = billingContact;
    }

    public String getBillingAddressMatchIndicator() {
        return billingAddressMatchIndicator;
    }

    public void setBillingAddressMatchIndicator(String billingAddressMatchIndicator) {
        this.billingAddressMatchIndicator = billingAddressMatchIndicator;
    }

    public GenericAddressDto getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(GenericAddressDto billingAddress) {
        this.billingAddress = billingAddress;
    }

    public MembershipSourceDto getInitialMembership() {
        return initialMembership;
    }

    public void setInitialMembership(MembershipSourceDto initialMembership) {
        this.initialMembership = initialMembership;
    }

    public String getOngoingMembershipMatchIndicator() {
        return ongoingMembershipMatchIndicator;
    }

    public void setOngoingMembershipMatchIndicator(String ongoingMembershipMatchIndicator) {
        this.ongoingMembershipMatchIndicator = ongoingMembershipMatchIndicator;
    }

    public MembershipSourceDto getOngoingMembership() {
        return ongoingMembership;
    }

    public void setOngoingMembership(MembershipSourceDto ongoingMembership) {
        this.ongoingMembership = ongoingMembership;
    }

    public String getExistingBrokerId() {
        return existingBrokerId;
    }

    public void setExistingBrokerId(String existingBrokerId) {
        this.existingBrokerId = existingBrokerId;
    }

    public String getPrimaryEyemanageUser() {
        return primaryEyemanageUser;
    }

    public void setPrimaryEyemanageUser(String primaryEyemanageUser) {
        this.primaryEyemanageUser = primaryEyemanageUser;
    }

    public ContactDto getEyeManageContact() {
        return eyeManageContact;
    }

    public void setEyeManageContact(ContactDto eyeManageContact) {
        this.eyeManageContact = eyeManageContact;
    }

    public String getBillingInvoiceSortIndicator() {
        return billingInvoiceSortIndicator;
    }

    public void setBillingInvoiceSortIndicator(String billingInvoiceSortIndicator) {
        this.billingInvoiceSortIndicator = billingInvoiceSortIndicator;
    }

    public LocalDate getInitialMembershipDate() {
        return initialMembershipDate;
    }

    public void setInitialMembershipDate(LocalDate initialMembershipDate) {
        this.initialMembershipDate = initialMembershipDate;
    }

    public LocalDate getInitialMembershipCobraDate() {
        return initialMembershipCobraDate;
    }

    public void setInitialMembershipCobraDate(LocalDate initialMembershipCobraDate) {
        this.initialMembershipCobraDate = initialMembershipCobraDate;
    }

    public ContactDto getBusinessCoordinator() {
        return businessCoordinator;
    }

    public void setBusinessCoordinator(ContactDto businessCoordinator) {
        this.businessCoordinator = businessCoordinator;
    }

    public String getEligibleEmployees() {
        return eligibleEmployees;
    }

    public void setEligibleEmployees(String eligibleEmployees) {
        this.eligibleEmployees = eligibleEmployees;
    }
}
