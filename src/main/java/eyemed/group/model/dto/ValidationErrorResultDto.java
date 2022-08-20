package eyemed.group.model.dto;

public class ValidationErrorResultDto {
    private final String field;
    private final String type;
    private final String userMessage;

    public ValidationErrorResultDto(String field, String type, String userMessage) {
        this.field = field;
        this.type = type;
        this.userMessage = userMessage;
    }

    public String getField() {
        return field;
    }

    public String getType() {
        return type;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
