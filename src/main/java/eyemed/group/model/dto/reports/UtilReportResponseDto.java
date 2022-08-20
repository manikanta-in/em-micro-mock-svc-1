package eyemed.group.model.dto.reports;

import eyemed.group.model.dto.CodeDataDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 1/21/2019.
 */
public class UtilReportResponseDto {

    private int returnCode;
    private List<CodeDataDto> statuses;
    List<UtilReportsDto> utilReports;

    public UtilReportResponseDto(){
        utilReports = new ArrayList<>();
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

    public List<UtilReportsDto> getUtilReports() {
        return utilReports;
    }

    public void setUtilReports(List<UtilReportsDto> utilReports) {
        this.utilReports = utilReports;
    }
}
