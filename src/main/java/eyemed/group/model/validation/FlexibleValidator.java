package eyemed.group.model.validation;

import eyemed.utils.StringUtils;
import org.springframework.context.MessageSource;

import java.util.Locale;

public abstract class FlexibleValidator {
    protected FlexibleValidationResult validationResult = new FlexibleValidationResult();
    protected boolean isValid;
    protected MessageSource messageSource;
    protected Locale locale;
    protected boolean isWarningAnError = false;

    public FlexibleValidator(MessageSource messageSource, Locale locale) {
        this.messageSource = messageSource;
        this.locale = locale;
    }

    public abstract FlexibleValidationResult validate(boolean isFullValidation);

    public boolean isValid() {
        return isValid;
    }

    protected boolean validateCharacters(String field, String fieldName, String fieldDisplayName) {
        return validateCharacters(field, fieldName, fieldDisplayName, false);
    }

    protected boolean validateCharacters(String field, String fieldName, String fieldDisplayName, boolean isRequired) {
        return validateCharacters(field, fieldName, fieldDisplayName, isRequired, ValidationUtility.ValidationType.Default);
    }

    protected boolean validateCharacters(String field, String fieldName, String fieldDisplayName, boolean isRequired, ValidationUtility.ValidationType validationType) {
        if(!StringUtils.isBlank(field) && ValidationUtility.patternMatch(field, validationType)) {
            logValidationResult(fieldName, "invalid-characters", "validator.field.invalid-characters", new Object[] {fieldDisplayName}, isRequired);
            return false;
        }
        return true;
    }



    protected boolean validateNotNull(String field, String fieldName, String fieldDisplayName) {
        return validateNotNull(field, fieldName, fieldDisplayName, false);
    }

    protected boolean validateNotNull(String field, String fieldName, String fieldDisplayName, boolean isRequired) {
        if(StringUtils.isBlank(field)) {
            logValidationResult(fieldName, "empty", "validator.field.empty", new Object[] {fieldDisplayName}, isRequired);
            return false;
        }
        return true;
    }


    protected boolean validateMaxLength(String field, String fieldName, String fieldDisplayName, int length) {
        if(!StringUtils.isBlank(field) && field.length() > length) {
            logValidationError(fieldName, "length", "validator.field.length", new Object[] {fieldDisplayName, length});
            return false;
        }
        return true;
    }

    protected boolean validateYesNoIndicator(String field, String fieldName, String fieldDisplayName) {
        if(!StringUtils.isBlank(field) && !(field.equalsIgnoreCase("Y") || field.equalsIgnoreCase("N"))) {
            logValidationWarning(fieldName, "unauthorized-value", "validator.yes-no", new Object[]{fieldDisplayName});
            return false;
        }
        return true;
    }


    protected void logValidationError(String fieldName, String errorType, String userMessageProp) {
        logValidationResult(fieldName, errorType, userMessageProp, null, true);
    }

    protected void logValidationError(String fieldName, String errorType, String userMessageProp, Object[] messageObjects) {
        logValidationResult(fieldName, errorType, userMessageProp, messageObjects, true);
    }

    protected void logValidationWarning(String fieldName, String errorType, String userMessageProp) {
        logValidationResult(fieldName, errorType, userMessageProp, null, false);
    }

    protected void logValidationWarning(String fieldName, String errorType, String userMessageProp, Object[] messageObjects) {
        logValidationResult(fieldName, errorType, userMessageProp, messageObjects, false);
    }

    protected void logValidationResult(String fieldName, String errorType, String userMessageProp, Object[] messageObjects, boolean isAlwaysRequired) {
        String errorLevel;
        if(isAlwaysRequired || isWarningAnError) {
            errorLevel = "error";
            isValid = false;
        } else {
            errorLevel = "warning";
        }

        String userMessage = messageSource.getMessage(userMessageProp, messageObjects, locale);
        FlexibleValidationItem item = new FlexibleValidationItem(fieldName, errorType, errorLevel, userMessage);

        validationResult.add(item);
    }

}
