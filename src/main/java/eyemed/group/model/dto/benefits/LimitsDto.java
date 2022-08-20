package eyemed.group.model.dto.benefits;

/**
 * Created by c09368 on 11/21/2018.
 */
public class LimitsDto {

    protected String amountLimitDesc;
    protected double startAmount;
    protected double remainingBalance;
    protected String applicableNetworkType;

    public String getAmountLimitDesc() {
        return amountLimitDesc;
    }

    public void setAmountLimitDesc(String amountLimitDesc) {
        this.amountLimitDesc = amountLimitDesc;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public double getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public String getApplicableNetworkType() {
        return applicableNetworkType;
    }

    public void setApplicableNetworkType(String applicableNetworkType) {
        this.applicableNetworkType = applicableNetworkType;
    }
}
