package eyemed.group.model.dto;

import eyemed.group.model.validation.FlexibleValidationResult;

public class StatusFlexibleValidationDto extends StatusMessageDto {
    private final FlexibleValidationResult validation;

    public StatusFlexibleValidationDto(String status, String userMessage, FlexibleValidationResult validation) {
        super(status, userMessage);
        this.validation = validation;
    }

    public FlexibleValidationResult getValidation() {
        return validation;
    }
}
