package eyemed.group.model.dto.members;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/8/2018.
 */
public class ReportingCodesDto {

    private String benefitOption, divisionCode, locationGroupNumber, companyCode, clientGroupNumber;
    private List<String> reportingCodes;

    /** Instantiates this ReportingCodes. */
    public ReportingCodesDto() {
        super();
        this.reportingCodes = new ArrayList<String>();
    }

    public String getBenefitOption() {
        return benefitOption;
    }

    public void setBenefitOption(String benefitOption) {
        this.benefitOption = benefitOption;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getLocationGroupNumber() {
        return locationGroupNumber;
    }

    public void setLocationGroupNumber(String locationGroupNumber) {
        this.locationGroupNumber = locationGroupNumber;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getClientGroupNumber() {
        return clientGroupNumber;
    }

    public void setClientGroupNumber(String clientGroupNumber) {
        this.clientGroupNumber = clientGroupNumber;
    }

    public List<String> getReportingCodes() {
        return reportingCodes;
    }

    public void setReportingCodes(List<String> reportingCodes) {
        this.reportingCodes = reportingCodes;
    }
}
