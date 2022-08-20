package eyemed.group.model.dto.benefits;

/**
 * Created by c09368 on 11/27/2018.
 */
public class AmountLimitDto {

    AmountLimitsServiceDto decliningBalance;
    AmountLimitsServiceDto deductibleBalance;
    AmountLimitsServiceDto maxOutOfPocketBalance;

    public AmountLimitsServiceDto getDecliningBalance() {
        return decliningBalance;
    }

    public void setDecliningBalance(AmountLimitsServiceDto decliningBalance) {
        this.decliningBalance = decliningBalance;
    }

    public AmountLimitsServiceDto getDeductibleBalance() {
        return deductibleBalance;
    }

    public void setDeductibleBalance(AmountLimitsServiceDto deductibleBalance) {
        this.deductibleBalance = deductibleBalance;
    }

    public AmountLimitsServiceDto getMaxOutOfPocketBalance() {
        return maxOutOfPocketBalance;
    }

    public void setMaxOutOfPocketBalance(AmountLimitsServiceDto maxOutOfPocketBalance) {
        this.maxOutOfPocketBalance = maxOutOfPocketBalance;
    }
}
