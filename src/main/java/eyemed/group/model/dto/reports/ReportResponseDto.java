package eyemed.group.model.dto.reports;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 1/21/2019.
 */
public class ReportResponseDto {
    List<AvailableReports> availableReports;
    public ReportResponseDto(){
        availableReports = new ArrayList<>();
    }

    public List<AvailableReports> getAvailableReports() {
        return availableReports;
    }

    public void setAvailableReports(List<AvailableReports> availableReports) {
        this.availableReports = availableReports;
    }
}
