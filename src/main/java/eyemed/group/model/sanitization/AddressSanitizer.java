package eyemed.group.model.sanitization;

import eyemed.group.model.dto.events.EventAddressDto;

/**
 * This class is meant to sanitize some input fields. Not entirely sure it's the right pattern, but hey, first attempt.
 */
public class AddressSanitizer {
    private EventAddressDto addressDto;

    public AddressSanitizer(EventAddressDto addressDto) {

        this.addressDto = addressDto;
    }

    public void sanitize() {

        if(this.addressDto == null) return;

        this.addressDto.setAddressLine1(sanitizeStandardString(this.addressDto.getAddressLine1()));
        this.addressDto.setAddressLine2(sanitizeStandardString(this.addressDto.getAddressLine2()));
    }

    private String sanitizeStandardString(String targetString) {
        if(targetString != null) {
            targetString.replace("’","'") //Apostrophe with Single Quote
                        .replace("?","")  //Remove Question Mark
                        .replace("(","'") //Open Paren with Single Quote
                        .replace(")","'") //Close Paren with Single Quote
                        .replace("\"","") //Remove Double Quote
                        .replace(";","")  //Remove Semicolon
                        .replace("—","-") //EM Dash with Hyphen
                        .replace("–","-") //EN Dash with Hyphen
                        .replace("|","")  //Remove Pipe
                        .replace("©","")  //Remove Copyright
                        .replace("®","")  //Remove Registered
                        .replace("™","")  //Remove Trademark
                        //Replace diacritics
                        .replace("ä","ae")
                        .replace("ö","oe")
                        .replace("ü","ue")
                        .replace("Ä","Ae")
                        .replace("Ö","Oe")
                        .replace("Ü","Ue")
                        .replace("ß","ss");
        }
        return targetString;
    }
}
