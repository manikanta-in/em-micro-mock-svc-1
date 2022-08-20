package eyemed.group.model.validation;

import eyemed.group.model.dto.events.EventAddressDto;
import eyemed.utils.StringUtils;

import java.util.List;

public class EventAddressValidator extends MultiResultValidator {

    private final EventAddressDto addressDto;
    private final String fieldNamePrefix;

    /**
     * Creates a validation object.
     * @param addressDto Address to be validated
     */
    public EventAddressValidator(EventAddressDto addressDto) {
        this.addressDto = addressDto;
        this.fieldNamePrefix = "";
    }

    /**
     * Creates a validation object.
     * @param addressDto Address to be validated
     * @param fieldNamePrefix Prefix for address, so that on messages "Address" could be "Shipping Address"
     */
    public EventAddressValidator(EventAddressDto addressDto, String fieldNamePrefix) {
        this.addressDto = addressDto;
        this.fieldNamePrefix = fieldNamePrefix + " ";
    }


    @Override
    public List<ValidationErrorResult> validate() {
        isValid = true;
        validationResults.clear(); //Reset validation results.

        if(addressDto == null) {
            logValidationError("validator", MSG_BLANK, fieldNamePrefix);
            return validationResults;
        }

        //EventAddressDto Line 1
        int addressMaxLength = 50;
        if(StringUtils.isBlank(addressDto.getAddressLine1())) {
            logValidationError("address.line1", MSG_BLANK, fieldNamePrefix);
        } else if (addressDto.getAddressLine1().length() > addressMaxLength) {
            logValidationError("address.line1",
                    "length", new Object[]{fieldNamePrefix, addressMaxLength});
        }

        //EventAddressDto Line 2
        boolean addressLine2IsNotBlank = !StringUtils.isBlank(addressDto.getAddressLine2());
        if(addressLine2IsNotBlank && addressDto.getAddressLine2().length() > addressMaxLength) {
            logValidationError("address.line2",
                    "length", new Object[]{fieldNamePrefix, addressMaxLength});
        }

        //City
        int cityMaxLength = 50;
        if(StringUtils.isBlank(addressDto.getCity())) {
            logValidationError("address.city", "blank", fieldNamePrefix);
        } else if (addressDto.getCity().length() > cityMaxLength) {
            logValidationError("address.city",
                    "length", new Object[]{fieldNamePrefix, cityMaxLength});
        }

        //State
        int stateMaxLength = 2;
        if(StringUtils.isBlank(addressDto.getStateCode())) {
            logValidationError("address.state", "blank", fieldNamePrefix);
        } else if (addressDto.getStateCode().length() > stateMaxLength) {
            logValidationError("address.state",
                    "length", new Object[]{fieldNamePrefix, stateMaxLength});
        }

        //Postal / Zip Code
        int postalCodeLength = 5;
        if(StringUtils.isBlank(addressDto.getPostalCode())) {
            logValidationError("address.postal", "blank", fieldNamePrefix);
        } else {
            if (addressDto.getPostalCode().length() != postalCodeLength) {
                logValidationError("address.postal",
                        "length", new Object[]{fieldNamePrefix, postalCodeLength});
            }
            if (!StringUtils.isNaturalNumber(addressDto.getPostalCode())) {
                logValidationError("address.postal", "nan", fieldNamePrefix);
            }
        }

        return validationResults;
    }

}
