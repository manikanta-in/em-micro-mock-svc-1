package eyemed.group.model.validation.application;

import eyemed.group.model.dto.applications.ClientContractDto;
import eyemed.group.model.validation.AddressFlexibleValidator;
import eyemed.group.model.validation.FlexibleValidationResult;
import eyemed.group.model.validation.FlexibleValidator;
import eyemed.group.model.validation.ValidationUtility;
import eyemed.utils.StringUtils;
import org.springframework.context.MessageSource;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class ClientContractValidator extends FlexibleValidator {

    private ClientContractDto contract;

    public ClientContractValidator(ClientContractDto contract, MessageSource messageSource, Locale locale) {
        super(messageSource, locale);
        this.contract = contract;
    }

    @Override
    public FlexibleValidationResult validate(boolean isFullValidation) {
        isWarningAnError = isFullValidation;
        isValid = true;

        //Contract object
        if(this.contract == null) {
            logValidationError("contract-object", "empty", "validator.empty");
            return validationResult; //Hard fail
        }

        //Group Name
        validateNotNull(this.contract.getCompanyName(), "companyName", "Company Name");
        validateCharactersFacetsGroupName(this.contract.getCompanyName(), "companyName", "Company Name");
        validateMaxLength(this.contract.getCompanyName(), "companyName", "Company Name", 255);


        //Group Name
        validateNotNull(this.contract.getGroupName(), "groupName", "Group Name");
        validateCharactersFacetsGroupName(this.contract.getGroupName(), "groupName", "Group Name");
        validateMaxLength(this.contract.getGroupName(), "groupName", "Group Name", 44);

        //Business Type / Other
        validateNotNull(this.contract.getBusinessType(), "businessType", "Business Type");
        validateCharacters(this.contract.getBusinessType(), "businessType", "Business Type");
        validateMaxLength(this.contract.getBusinessType(), "businessType", "Business Type", 50);
        if(!StringUtils.isBlank(this.contract.getBusinessType()) && this.contract.getBusinessType().equalsIgnoreCase("Other")) {
            validateNotNull(this.contract.getBusinessTypeOther(), "businessTypeOther", "Business Type (Other)");
        }
        validateCharacters(this.contract.getBusinessTypeOther(), "businessTypeOther", "Business Type (Other)");
        validateMaxLength(this.contract.getBusinessTypeOther(), "businessTypeOther", "Business Type (Other)", 20);


        //Business FEIN / Tax ID
        validateNotNull(this.contract.getBusinessType(), "businessFeinTaxId", "FEIN / Tax ID #");
        if(!StringUtils.isBlank(this.contract.getBusinessFeinTaxId())) {
            if(this.contract.getBusinessFeinTaxId().length() != 10 || this.contract.getBusinessFeinTaxId().charAt(2) != '-') {
                logValidationWarning("businessFeinTaxId", "format", "contract.business.tax-id.format");
            }
        }
//        validateCharacters(this.contract.getBusinessFeinTaxId(), "businessFeinTaxId", "FEIN / Tax ID #", false, ValidationUtility.ValidationType.TaxId);
        validateMaxLength(this.contract.getBusinessFeinTaxId(), "businessFeinTaxId", "FEIN / Tax ID #", 10);

        //Business Address
        AddressFlexibleValidator businessAddressValidator =
                new AddressFlexibleValidator(messageSource, locale, "businessAddress", contract.getBusinessAddress());
        businessAddressValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Service Area
        final boolean isServiceAreaNotNull = validateNotNull(contract.getServiceArea(), "serviceArea", "Service Area");
        if(isServiceAreaNotNull) {
            final List<String> allowedServiceAreas = Arrays.asList(messageSource.getMessage("contract.service-area.values", null, locale).split("\\|"));
            if (!allowedServiceAreas.contains(contract.getServiceArea())) {
                logValidationWarning("serviceArea", "unauthorized-value", "contract.service-area.unauthorized-value", new Object[]{String.join(",", allowedServiceAreas)});
            }
        }
        validateMaxLength(this.contract.getServiceArea(), "serviceArea", "Service Area", 50);

        //Additional States
        if(contract.getAdditionalStates() != null && contract.getAdditionalStates().size() > 0) {
            final List<String> allowedStates = Arrays.asList(messageSource.getMessage("contract.states.additional.values", null, locale).split("\\|"));
            final Stream<String> matchedStates = contract.getAdditionalStates().stream()
                    .filter(state -> allowedStates.stream()
                            .anyMatch(allowedState -> allowedState.equals(state)));

            if (matchedStates.count() < contract.getAdditionalStates().size()) {
                logValidationError("additionalStates", "unauthorized-value", "contract.states.additional.unauthorized-value", new Object[]{String.join(",", allowedStates)});
            }
        }

        //Primary Contact
        final ApplicationContactExtendedValidator primaryContactValidator = new ApplicationContactExtendedValidator(messageSource, locale, "primaryContact", contract.getPrimaryContact());
        primaryContactValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Billing Contact
        final ApplicationContactExtendedValidator BillingContactValidator = new ApplicationContactExtendedValidator(messageSource, locale, "billingContact", contract.getBillingContact());
        BillingContactValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Billing Invoice Sort
        validateNotNull(contract.getBillingInvoiceSortIndicator(), "billingInvoiceSortIndicator", "Billing Invoice Sort");
        validateYesNoIndicator(contract.getBillingInvoiceSortIndicator(), "billingInvoiceSortIndicator", "Billing Invoice Sort");
        validateMaxLength(contract.getBillingInvoiceSortIndicator(), "billingInvoiceSortIndicator", "Billing Invoice Sort", 1);

        //Billing Address Match Indicator - UI Only field
        validateMaxLength(contract.getBillingAddressMatchIndicator(), "billingAddressMatchIndicator", "Billing Address Match", 1);

        //Billing Address
        //Business Address
        AddressFlexibleValidator billingAddressValidator =
                new AddressFlexibleValidator(messageSource, locale, "billingAddress", contract.getBillingAddress());
        billingAddressValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Initial Membership
        boolean isCobraInitialRequired = "N".equalsIgnoreCase(contract.getInitialMembership().getIncludeCobraIndicator());

        ApplicationMembershipValidator initialMembershipValidator = new ApplicationMembershipValidator(messageSource, locale, "initialMembership", contract.getInitialMembership());
        initialMembershipValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Initial Membership Date
        if(contract.getInitialMembershipDate() == null) {
            logValidationWarning("initialMembershipDate", "empty", "contract.membership.date.empty");
        }


        if(isCobraInitialRequired) {
            //Initial Membership Cobra Date
            if(contract.getInitialMembershipCobraDate() == null) {
                logValidationWarning("initialMembershipCobraDate", "empty", "contract.membership.cobra.date.empty");
            }
        }

        //Ongoing Membership Match - UI Only
        validateMaxLength(contract.getOngoingMembershipMatchIndicator(), "ongoingMembershipMatchIndicator", "Ongoing Membership Matches Initial", 1);

        //Ongoing Membership
        ApplicationMembershipValidator ongoingMembershipValidator = new ApplicationMembershipValidator(messageSource, locale, "ongoingMembership", contract.getOngoingMembership());
        ongoingMembershipValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Existing Broker ID
        validateCharacters(contract.getExistingBrokerId(), "existingBrokerId", "Existing Broker Username");
        validateMaxLength(contract.getExistingBrokerId(), "existingBrokerId", "Existing Broker Username", 20);

        //EyeManage User Selection - UI only field
        validateMaxLength(contract.getPrimaryEyemanageUser(), "primaryEyemanageUser", "EyeManage User", 20);

        //EyeManage User to Create
        final ApplicationContactValidator eyeManageContactValidator = new ApplicationContactValidator(messageSource, locale, "EyeManageContact", contract.getEyeManageContact());
        eyeManageContactValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        return validationResult;
    }


    private boolean validateCharactersFacetsGroupName(String field, String fieldName, String fieldDisplayName) {
        return validateCharactersFacetsGroupName(field, fieldName, fieldDisplayName, false);
    }

    private boolean validateCharactersFacetsGroupName(String field, String fieldName, String fieldDisplayName, boolean isRequired) {
        return validateCharacters(field, fieldName, fieldDisplayName, isRequired, ValidationUtility.ValidationType.FacetsGroupName);
    }


}
