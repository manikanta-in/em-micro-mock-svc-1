package eyemed.group.model.validation.application;

import eyemed.group.model.dto.applications.ContactExtendedDto;
import eyemed.group.model.validation.FlexibleValidationResult;
import eyemed.group.model.validation.ValidationUtility;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class ApplicationContactExtendedValidator extends ApplicationContactValidator {

    private ContactExtendedDto contactExtended;

    public ApplicationContactExtendedValidator(MessageSource messageSource, Locale locale, String fieldPrefix, ContactExtendedDto contact) {
        this(messageSource, locale, fieldPrefix, contact, true);
    }
    public ApplicationContactExtendedValidator(MessageSource messageSource, Locale locale, String fieldPrefix, ContactExtendedDto contact, boolean isRequired) {
        super(messageSource, locale, fieldPrefix, contact, isRequired);
        this.contactExtended = contact;
    }

    @Override
    public FlexibleValidationResult validate(boolean isFullValidation) {
        isWarningAnError = isFullValidation;
        isValid = true;
        
        //Run parent validation.
        super.validate(isFullValidation);
        
        //Phone
        if(isRequired) validateNotNull(contactExtended.getPhone(), prefix("phone"), "Phone");
        validateCharacters(contactExtended.getPhone(), prefix("phone"), "Phone", false, ValidationUtility.ValidationType.Phone);
        validateMaxLength(contactExtended.getPhone(), prefix("phone"), "Phone", 31);

        return validationResult;
    }
}
