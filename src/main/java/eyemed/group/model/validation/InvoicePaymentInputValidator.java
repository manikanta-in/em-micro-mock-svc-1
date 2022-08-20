package eyemed.group.model.validation;

import eyemed.group.model.dto.invoice.InvoiceDto;
import eyemed.group.model.dto.invoice.PaymentMethodsDto;
import eyemed.group.security.SecurityHelper;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 01/8/2019
 */

@Repository
public class InvoicePaymentInputValidator {
    public boolean isValidBlockInvoiceRequest(InvoiceDto invoiceDto) {
        return !StringUtils.isEmpty(invoiceDto) &&
                !StringUtils.isEmpty(invoiceDto.getInvoiceNumbers()) &&
                !StringUtils.isEmpty(invoiceDto.getGroupCk()) && !StringUtils.isEmpty(invoiceDto.getSubGroupCk());
    }

    public boolean isValidInvoiceSearchRequest(String status, String groupCk, String subGroupCk) {
        if(StringUtils.isEmpty(status) || StringUtils.isEmpty(groupCk) || StringUtils.isEmpty(subGroupCk)){
            return false;
        }
        return true;
    }

    public boolean isValidPaymentMethodRequest(PaymentMethodsDto paymentMethodsDto) {
        if(StringUtils.isEmpty(paymentMethodsDto.getReq_reference_number()) ||
                (!StringUtils.isEmpty(paymentMethodsDto.getReq_reference_number())) && paymentMethodsDto.getReq_reference_number().length()==1){
            return false;
        }else {
            String arrCk[] = paymentMethodsDto.getReq_reference_number().split("\\|");
            paymentMethodsDto.setGroupCk(arrCk[0]);
            paymentMethodsDto.setSubgroupCk(arrCk[1]);
        }
        if(!SecurityHelper.userSubGroupAccessValidation(paymentMethodsDto.getSubgroupCk())){
            return false;
        }else {
            return !(StringUtils.isEmpty(paymentMethodsDto) ||
                    StringUtils.isEmpty(paymentMethodsDto.getGroupCk()) ||
                    StringUtils.isEmpty(paymentMethodsDto.getSubgroupCk()) ||
                    StringUtils.isEmpty(paymentMethodsDto.getDecision())
            );
        }
    }

    public boolean isValidCashAccountRequest(String groupCk, String subGroupCk    ){
        return !(StringUtils.isEmpty(groupCk) || StringUtils.isEmpty(subGroupCk));
    }
}
