package eyemed.group.model.validation;

import java.util.regex.Pattern;

public class ValidationUtility {
    //Regex Patterns, if a match is found return true
    private static Pattern patternDefault = Pattern.compile("[^A-Za-z0-9 .#]");
    private static Pattern patternNumeric = Pattern.compile("[^0-9]");
    private static Pattern patternPersonName = Pattern.compile("[^A-Za-z \\-']");
    private static Pattern patternNumericWithDashes = Pattern.compile("[^0-9\\-]");
    // Pattern match for:                                              A-Za-z0-9 ',   \/&_:!.  -+  [  ]*@#~
    private static Pattern patternFacetsGroupName = Pattern.compile("[^A-Za-z0-9 ',\\\\/&_:!.\\-+\\[\\]*@#~]");

    //Negate Patterns, if a match is not found then return false.
    private static Pattern patternNegateTaxId = Pattern.compile("^\\d{2}\\-?\\d{7}$");
    private static Pattern patternNegateEmail = Pattern.compile(".+\\@.+\\..+");

    public enum ValidationType {
        Default,
        Numeric,
        FacetsGroupName,
        AddressLine,
        PersonName,
        Email,
        Phone,
        TaxId
    }

    public static boolean patternMatch(String value, ValidationType validationType) {
        boolean result;
        switch (validationType) {
            case FacetsGroupName:
                result = regexPatternMatch(value, patternFacetsGroupName);
                break;
            case PersonName:
                result = regexPatternMatch(value, patternPersonName);
                break;
            case Email:
                result = !regexPatternMatch(value, patternNegateEmail);
                break;
            case Phone:
                result = regexPatternMatch(value, patternNumericWithDashes);
                break;
            case TaxId:
                result = !regexPatternMatch(value, patternNegateTaxId);
                break;
            case Numeric:
                result = regexPatternMatch(value, patternNumeric);
                break;
            default:
                result = regexPatternMatch(value, patternDefault);
        }
        return result;
    }

    private static boolean regexPatternMatch(String value, Pattern pattern) {
        return pattern.matcher(value).find();
    }
}
