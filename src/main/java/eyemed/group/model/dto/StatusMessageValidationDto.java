package eyemed.group.model.dto;

import eyemed.group.model.validation.ValidationErrorResult;
import org.springframework.context.MessageSource;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StatusMessageValidationDto extends StatusMessageDto {
    private final List<ValidationErrorResult> errors;
    private final MessageSource messageSource;
    private final Locale locale;

    public StatusMessageValidationDto(String status, String userMessage, List<ValidationErrorResult> errors, MessageSource messageSource, Locale locale) {
        super(status, userMessage);
        this.errors = errors;
        this.messageSource = messageSource;
        this.locale = locale;
    }

    /**
     * Converts the input ValidationErrorResults list to ValidationErrorResultsDto list.
     * @return
     */
    public List<ValidationErrorResultDto> getErrors() {
        return this.errors.stream().map(validationErrorResult ->
                new ValidationErrorResultDto(
                        validationErrorResult.getFieldKey(),
                        validationErrorResult.getMessageProperty(),
                        messageSource.getMessage(
                                validationErrorResult.getFieldKey() + "." + validationErrorResult.getMessageProperty(),
                                validationErrorResult.getValues(),
                                locale)))
                .collect(Collectors.toList());
    }
}
