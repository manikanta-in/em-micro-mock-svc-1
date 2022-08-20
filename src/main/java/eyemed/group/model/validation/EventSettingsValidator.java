package eyemed.group.model.validation;

import eyemed.group.model.dto.EventGlobalSettingsDto;

import java.util.List;

public class EventSettingsValidator extends MultiResultValidator {


    private final EventGlobalSettingsDto eventSettings;

    public EventSettingsValidator(EventGlobalSettingsDto eventSettings) {
        this.eventSettings = eventSettings;
    }

    @Override
    public List<ValidationErrorResult> validate() {

        if(eventSettings == null) {
            logValidationError("validator", MSG_BLANK);
            return validationResults;
        }

        return validationResults;
    }
}
