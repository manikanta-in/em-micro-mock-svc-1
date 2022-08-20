package eyemed.group.model.validation;

public class FlexibleValidationItem {
    private String field;
    private String type;
    private String level;
    private String userMessage;

    public FlexibleValidationItem(String field, String type, String level, String userMessage) {
        this.field = field;
        this.type = type;
        this.level = level;
        this.userMessage = userMessage;
    }

    public String getField() {
        return field;
    }

    public String getType() {
        return type;
    }

    public String getLevel() {
        return level;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
