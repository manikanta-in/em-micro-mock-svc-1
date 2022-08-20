package eyemed.group.model.dto.groups.maintenance;

import java.io.Serializable;

public class RateSettingsDto implements Serializable {
    private RateTableDto rateTableSetting;
    private RateCategoryDto rateCategorySetting;
    private RateAgesDto rateAgesSetting;

    public RateTableDto getRateTableSetting() {
        return rateTableSetting;
    }

    public void setRateTableSetting(RateTableDto rateTableSetting) {
        this.rateTableSetting = rateTableSetting;
    }

    public RateCategoryDto getRateCategorySetting() {
        return rateCategorySetting;
    }

    public void setRateCategorySetting(RateCategoryDto rateCategorySetting) {
        this.rateCategorySetting = rateCategorySetting;
    }

    public RateAgesDto getRateAgesSetting() {
        return rateAgesSetting;
    }

    public void setRateAgesSetting(RateAgesDto rateAgesSetting) {
        this.rateAgesSetting = rateAgesSetting;
    }
}
