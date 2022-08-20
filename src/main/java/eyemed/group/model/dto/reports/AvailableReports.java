package eyemed.group.model.dto.reports;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 1/21/2019.
 */
public class AvailableReports {

    private String name;
    private String code;
    private List<EnrollReportDto> enrollReports;
    private List<UtilReportsDto> utilReports;

    public AvailableReports(){
        enrollReports = new ArrayList<>();
        utilReports = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<EnrollReportDto> getEnrollReports() {
        return enrollReports;
    }

    public void setEnrollReports(List<EnrollReportDto> enrollReports) {
        this.enrollReports = enrollReports;
    }

    public List<UtilReportsDto> getUtilReports() {
        return utilReports;
    }

    public void setUtilReports(List<UtilReportsDto> utilReports) {
        this.utilReports = utilReports;
    }
}
