package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class RateCategoryDto implements Serializable {
    private String  rateCatModifier;
    private String  rateCatSexCode;
    private String  rateCatSmokerCode;
    private DateTime  rateCatEffectiveDate;
    private DateTime  rateCatTermDate;

    public String getRateCatModifier() {
        return rateCatModifier;
    }

    public void setRateCatModifier(String rateCatModifier) {
        this.rateCatModifier = rateCatModifier;
    }

    public String getRateCatSexCode() {
        return rateCatSexCode;
    }

    public void setRateCatSexCode(String rateCatSexCode) {
        this.rateCatSexCode = rateCatSexCode;
    }

    public String getRateCatSmokerCode() {
        return rateCatSmokerCode;
    }

    public void setRateCatSmokerCode(String rateCatSmokerCode) {
        this.rateCatSmokerCode = rateCatSmokerCode;
    }

    public DateTime getRateCatEffectiveDate() {
        return rateCatEffectiveDate;
    }

    public void setRateCatEffectiveDate(DateTime rateCatEffectiveDate) {
        this.rateCatEffectiveDate = rateCatEffectiveDate;
    }

    public DateTime getRateCatTermDate() {
        return rateCatTermDate;
    }

    public void setRateCatTermDate(DateTime rateCatTermDate) {
        this.rateCatTermDate = rateCatTermDate;
    }
}
