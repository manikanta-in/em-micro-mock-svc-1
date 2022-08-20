package eyemed.group.model.validation.application;

import eyemed.group.model.dto.applications.MembershipSourceDto;
import eyemed.group.model.validation.FlexibleValidationResult;
import eyemed.group.model.validation.FlexibleValidator;
import eyemed.utils.StringUtils;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class ApplicationMembershipValidator extends FlexibleValidator {
    final String fieldPrefix;
    final MembershipSourceDto membership;

    public ApplicationMembershipValidator(MessageSource messageSource, Locale locale, String fieldPrefix, MembershipSourceDto membership) {
        super(messageSource, locale);
        this.fieldPrefix = fieldPrefix;
        this.membership = membership;
    }

    @Override
    public FlexibleValidationResult validate(boolean isFullValidation) {
        isWarningAnError = isFullValidation;
        isValid = true;

        //Contact object
        if(this.membership == null) {
            String fieldName = StringUtils.isBlank(fieldPrefix) ? "membership-object" : fieldPrefix;
            logValidationError(fieldName, "empty", "validator.empty");
            return validationResult; //Hard fail
        }

        //Format
        validateCharacters(membership.getFormat(), prefix("format"), "Format");
        validateMaxLength(membership.getFormat(), prefix("format"), "Format", 50);

        //Source
        validateCharacters(membership.getSource(), prefix("source"), "Source");
        validateMaxLength(membership.getSource(), prefix("source"), "Source", 50);

        //TPA Company Name
        validateCharacters(membership.getTpaCompanyName(), prefix("tpaCompanyName"), "TPA Company Name");
        validateMaxLength(membership.getTpaCompanyName(), prefix("tpaCompanyName"), "TPA Company Name", 40);

        //Include Cobra - UI Only
        validateMaxLength(membership.getIncludeCobraIndicator(), prefix("includeCobraIndicator"), "Include Cobra", 1);

        //Cobra Notes
        validateMaxLength(membership.getCobraNotes(), prefix("cobraNotes"), "Cobra Notes", 4000);

        //Membership Contact
        final ApplicationContactExtendedValidator ContactValidator = new ApplicationContactExtendedValidator(messageSource, locale, prefix("contact"), membership.getContact());
        ContactValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        //Cobra Format
        validateCharacters(membership.getCobraFormat(), prefix("cobraFormat"), "Cobra Format");
        validateMaxLength(membership.getCobraFormat(), prefix("cobraFormat"), "Cobra Format", 50);

        //Cobra Source
        validateCharacters(membership.getCobraSource(), prefix("cobraSource"), "Cobra Source");
        validateMaxLength(membership.getCobraSource(), prefix("cobraSource"), "Cobra Source", 50);

        //Cobra TPA Company Name
        validateCharacters(membership.getCobraTpaCompanyName(), prefix("cobraTpaCompanyName"), "Cobra TPA Company Name");
        validateMaxLength(membership.getCobraTpaCompanyName(), prefix("cobraTpaCompanyName"), "Cobra TPA Company Name", 40);

        //Cobra Membership Contact
//        boolean isRequired = "N".equals(membership.getIncludeCobraIndicator();
//        final ApplicationContactExtendedValidator CobraContactValidator = new ApplicationContactExtendedValidator(messageSource, locale, prefix("cobraContact"), membership.getCobraContact(), isRequired);
        //Karin H. stated that the contact never needs to be validated.
        final ApplicationContactExtendedValidator CobraContactValidator = new ApplicationContactExtendedValidator(messageSource, locale, prefix("cobraContact"), membership.getCobraContact(), false);
        CobraContactValidator.validate(isFullValidation).getErrors().forEach(item -> validationResult.add(item));

        return validationResult;
    }

    String prefix(String fieldName) {
        if(StringUtils.isBlank(fieldPrefix)) {
            return fieldName;
        } else {
            return fieldPrefix + "." + fieldName;
        }
    }
}
