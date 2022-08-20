package eyemed.group.model.validation;

import eyemed.group.model.dto.GenericAddressDto;
import eyemed.utils.StringUtils;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class AddressFlexibleValidator extends FlexibleValidator {
    private final String fieldPrefix;
    private final GenericAddressDto address;

    public AddressFlexibleValidator(MessageSource messageSource, Locale locale, String fieldPrefix, GenericAddressDto address) {
        super(messageSource, locale);
        this.fieldPrefix = fieldPrefix;
        this.address = address;
    }

    @Override
    public FlexibleValidationResult validate(boolean isFullValidation) {
        isWarningAnError = isFullValidation;
        isValid = true;

        //Address object
        if(this.address == null) {
            String fieldName = StringUtils.isBlank(fieldPrefix) ? "address-object" : fieldPrefix;
            logValidationError(fieldName, "empty", "validator.empty");
            return validationResult; //Hard fail
        }

        //Address Line 1
        validateNotNull(address.getAddressLine1(), prefix("addressLine1"), "Address Line 1");
        validateCharacters(address.getAddressLine1(), prefix("addressLine1"), "Address Line 1", false, ValidationUtility.ValidationType.AddressLine);
        validateMaxLength(address.getAddressLine1(), prefix("addressLine1"), "Address Line 1", 40);

        //Address Line 2
//        validateNotNull(address.getAddressLine2(), prefix("addressLine2"), "Address Line 2"); //Not Required
        validateCharacters(address.getAddressLine2(), prefix("addressLine2"), "Address Line 2", false, ValidationUtility.ValidationType.AddressLine);
        validateMaxLength(address.getAddressLine2(), prefix("addressLine2"), "Address Line 2", 40);

        //City
        validateNotNull(address.getCity(), prefix("city"), "City");
        validateCharacters(address.getCity(), prefix("city"), "City");
        validateMaxLength(address.getCity(), prefix("city"), "City", 19);

        //State
        validateNotNull(address.getStateCode(), prefix("stateCode"), "State Code");
        validateCharacters(address.getStateCode(), prefix("stateCode"), "State Code");
        validateMaxLength(address.getStateCode(), prefix("stateCode"), "State Code", 2);

        //Postal Code
        validateNotNull(address.getPostalCode(), prefix("postalCode"), "Postal Code");
        validateCharacters(address.getPostalCode(), prefix("postalCode"), "Postal Code", false, ValidationUtility.ValidationType.Numeric);
        validateMaxLength(address.getPostalCode(), prefix("postalCode"), "Postal Code", 5);

        return validationResult;
    }

    private String prefix(String fieldName) {
        if(StringUtils.isBlank(fieldPrefix)) {
            return fieldName;
        } else {
            return fieldPrefix + "." + fieldName;
        }
    }
}
