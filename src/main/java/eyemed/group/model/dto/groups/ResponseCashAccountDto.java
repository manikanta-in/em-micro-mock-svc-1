package eyemed.group.model.dto.groups;

import eyemed.group.model.dto.CodeDataDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 1/31/2019.
 */
public class ResponseCashAccountDto {
    private int returnCode;
    private List<CodeDataDto> statuses;
    private double cashAccounts;

    public ResponseCashAccountDto(){
        super();
        this.statuses = new ArrayList<>();
    }
    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public List<CodeDataDto> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<CodeDataDto> statuses) {
        this.statuses = statuses;
    }

    public double getCashAccounts() {
        return cashAccounts;
    }

    public void setCashAccounts(double cashAccounts) {
        this.cashAccounts = cashAccounts;
    }
}
