package eyemed.group.model.validation.application;

import eyemed.group.model.dto.applications.ContactDto;
import eyemed.group.model.validation.FlexibleValidationResult;
import eyemed.group.model.validation.FlexibleValidator;
import eyemed.group.model.validation.ValidationUtility;
import eyemed.utils.StringUtils;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class ApplicationContactValidator extends FlexibleValidator {
    final String fieldPrefix;
    final ContactDto contact;
    protected boolean isRequired;

    public ApplicationContactValidator(MessageSource messageSource, Locale locale, String fieldPrefix, ContactDto contact) {
        this(messageSource, locale, fieldPrefix, contact, true);
    }

    public ApplicationContactValidator(MessageSource messageSource, Locale locale, String fieldPrefix, ContactDto contact, boolean isRequired) {
        super(messageSource, locale);
        this.fieldPrefix = fieldPrefix;
        this.contact = contact;
        this.isRequired = isRequired;
    }

    @Override
    public FlexibleValidationResult validate(boolean isFullValidation) {
        isWarningAnError = isFullValidation;
        isValid = true;

        //Contact object
        if(this.contact == null) {
            String fieldName = StringUtils.isBlank(fieldPrefix) ? "contact-object" : fieldPrefix;
            logValidationError(fieldName, "empty", "validator.empty");
            return validationResult; //Hard fail
        }

        //First Name
        if(isRequired)validateNotNull(contact.getFirstName(), prefix("firstName"), "First Name");
        validateCharacters(contact.getFirstName(), prefix("firstName"), "First Name", false, ValidationUtility.ValidationType.PersonName);
        validateMaxLength(contact.getFirstName(), prefix("firstName"), "First Name", 27);


        //Last Name
        if(isRequired) validateNotNull(contact.getLastName(), prefix("lastName"), "Last Name");
        validateCharacters(contact.getLastName(), prefix("lastName"), "Last Name", false, ValidationUtility.ValidationType.PersonName);
        validateMaxLength(contact.getLastName(), prefix("lastName"), "Last Name", 27);


        //Email
        if(isRequired) validateNotNull(contact.getEmail(), prefix("email"), "Email");
        validateCharacters(contact.getEmail(), prefix("email"), "Email", false, ValidationUtility.ValidationType.Email);
        validateMaxLength(contact.getEmail(), prefix("email"), "Email", 77);

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
