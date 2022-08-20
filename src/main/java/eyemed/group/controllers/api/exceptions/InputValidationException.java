package eyemed.group.controllers.api.exceptions;

import eyemed.group.model.validation.ValidationErrorResult;

import java.util.ArrayList;
import java.util.List;

public class InputValidationException extends Exception {

    private final String userMessage;
    private final List<ValidationErrorResult> errors;

    public InputValidationException(String userMessage, String fieldkey, String messageProperty) {
        this.userMessage = userMessage;
        this.errors = new ArrayList<>();
        this.errors.add(new ValidationErrorResult(fieldkey, messageProperty, null));
    }

    public InputValidationException(String userMessage, List<ValidationErrorResult> errors) {

        this.userMessage = userMessage;
        this.errors = errors;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public List<ValidationErrorResult> getErrors() {
        return errors;
    }
}
