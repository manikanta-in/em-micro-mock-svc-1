package eyemed.group.model.dto.groups.maintenance;

import org.joda.time.DateTime;

import java.io.Serializable;

public class RateTableDto implements Serializable {
    private String  rateDescription;
    private String  rateType;
    private String  rateAgeIndicator;
    private String  rateModifier;
    private DateTime  rateEffectiveDate;
    private DateTime  rateTermDate;
    private String  ratePrefix;
    private String  getRateModifierType;
    private String  rateMeth;
    private String  rateAgeThru;
    private String  rateBasics;
    private String  rateColStructure;
    private String  rateKeyStructure;

    public String getRateDescription() {
        return rateDescription;
    }

    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getRateAgeIndicator() {
        return rateAgeIndicator;
    }

    public void setRateAgeIndicator(String rateAgeIndicator) {
        this.rateAgeIndicator = rateAgeIndicator;
    }

    public String getRateModifier() {
        return rateModifier;
    }

    public void setRateModifier(String rateModifier) {
        this.rateModifier = rateModifier;
    }

    public DateTime getRateEffectiveDate() {
        return rateEffectiveDate;
    }

    public void setRateEffectiveDate(DateTime rateEffectiveDate) {
        this.rateEffectiveDate = rateEffectiveDate;
    }

    public DateTime getRateTermDate() {
        return rateTermDate;
    }

    public void setRateTermDate(DateTime rateTermDate) {
        this.rateTermDate = rateTermDate;
    }

    public String getRatePrefix() {
        return ratePrefix;
    }

    public void setRatePrefix(String ratePrefix) {
        this.ratePrefix = ratePrefix;
    }

    public String getGetRateModifierType() {
        return getRateModifierType;
    }

    public void setGetRateModifierType(String getRateModifierType) {
        this.getRateModifierType = getRateModifierType;
    }

    public String getRateMeth() {
        return rateMeth;
    }

    public void setRateMeth(String rateMeth) {
        this.rateMeth = rateMeth;
    }

    public String getRateAgeThru() {
        return rateAgeThru;
    }

    public void setRateAgeThru(String rateAgeThru) {
        this.rateAgeThru = rateAgeThru;
    }

    public String getRateBasics() {
        return rateBasics;
    }

    public void setRateBasics(String rateBasics) {
        this.rateBasics = rateBasics;
    }

    public String getRateColStructure() {
        return rateColStructure;
    }

    public void setRateColStructure(String rateColStructure) {
        this.rateColStructure = rateColStructure;
    }

    public String getRateKeyStructure() {
        return rateKeyStructure;
    }

    public void setRateKeyStructure(String rateKeyStructure) {
        this.rateKeyStructure = rateKeyStructure;
    }
}
