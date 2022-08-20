package eyemed.group.model.validation;

import eyemed.group.util.Constants;
import org.springframework.stereotype.Repository;

/**
 * Created by c09368 on 2/19/2019.
 */
@Repository
public class ReportsInputValidator {

    public boolean validateRequestEnrollReport(String groupCk, String filterType){
        if (eyemed.utils.StringUtils.isBlank(groupCk) ||
                eyemed.utils.StringUtils.isBlank(filterType)){
            return true;
        }else return false;
    }

    public boolean validateDownloadReport(String reportId, String reportType, String invoiceType){
        if (eyemed.utils.StringUtils.isBlank(reportId) ||
                eyemed.utils.StringUtils.isBlank(reportType) ||
                (!eyemed.utils.StringUtils.isBlank(reportType) &&
                        Constants.DWL_INVOICE_RPT_CODE.equalsIgnoreCase(reportType) &&
                        eyemed.utils.StringUtils.isBlank(invoiceType))){
            return true;
        }else return false;
    }
}
