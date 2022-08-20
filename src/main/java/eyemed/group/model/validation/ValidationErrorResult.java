package eyemed.group.model.validation;

public class ValidationErrorResult {
    private final String fieldKey;
    private final String messageProperty;
    private final Object[] values;

    public ValidationErrorResult(String fieldKey, String messageProperty) {
        this.fieldKey = fieldKey;
        this.messageProperty = messageProperty;
        this.values = null;
    }

    public ValidationErrorResult(String fieldKey, String messageProperty, Object[] values) {
        this.fieldKey = fieldKey;
        this.messageProperty = messageProperty;
        this.values = values;
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public String getMessageProperty() {
        return messageProperty;
    }

    public Object[] getValues() {
        return values;
    }


}
