package eyemed.group.model.validation;

import eyemed.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiResultValidator {
    static final String MSG_BLANK = "blank";

    boolean isValid = false;
    List<ValidationErrorResult> validationResults = new ArrayList<>();

    public abstract List<ValidationErrorResult> validate();

    public boolean isValid() {
        return isValid;
    }

    void logValidationError(String fieldKey, String messageProperty) {
        logValidationError(fieldKey, messageProperty, (Object[]) null);
    }

    void logValidationError(String fieldKey, String messageProperty, String value) {
        logValidationError(fieldKey, messageProperty, new Object[]{value});
    }

    void logValidationError(String fieldKey, String messageProperty, Object[] values) {
        isValid = false;

        ValidationErrorResult e = new ValidationErrorResult(fieldKey, messageProperty, values);
        if(validationResults == null) {
            validationResults = new ArrayList<>();
        }
        validationResults.add(e);
    }

    /**
     * Validates that an indicator field is either "Y" or "N".
     * @param requestDigitalInd
     * @return
     */
    boolean validateYesNoIndicatorField(String requestDigitalInd) {
        return validateYesNoIndicatorField(requestDigitalInd, true);
    }

    /**
     * Validates that a field is either "Y" or "N". In the case where it is
     * not marked required it will also check for a blank value in addition.
     * @param value Value to be checked.
     * @param required Is this field a required field or can is be blank?
     * @return
     */
    boolean validateYesNoIndicatorField(String value, boolean required) {
        // Taking advantage of the way that the operations are performed here,
        // if you need to modify this in the future, please be sure that everything
        // functions as expected. Technically occasionally isBlank could be performed
        // multiple times on one value, but most of the time it should not if people
        // aren't sending in bad values.
        if(required && StringUtils.isBlank(value)) {
            return false;
        } else if("N".equalsIgnoreCase(value)
                || "Y".equalsIgnoreCase(value)
                || StringUtils.isBlank(value)
        ) {
            return true;
        }
        return false;
    }
}
