package eyemed.group.model.validation;

import eyemed.group.util.Constants;
import eyemed.group.util.DBUtils;
import org.apache.commons.validator.GenericValidator;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


/**
 * Created by c09368 on 10/17/2018.
 */
@Repository
public class GroupInputValidator {

    public boolean isFindGroupRequest(String id, String name){
        return (!StringUtils.isEmpty(id) || !StringUtils.isEmpty(name));
    }

    public boolean isGetGroupSubGroupRequest(String groupCk, String subGroupCk){
        return (!StringUtils.isEmpty(groupCk) && !StringUtils.isEmpty(subGroupCk));
    }

    public boolean isCashOnAccountRequest(String groupCk, String subGroupCk){
        return !(StringUtils.isEmpty(groupCk) || StringUtils.isEmpty(subGroupCk));
    }

    public boolean isGetSubGroupClassPlansRequest(String subGroupCk){
        return (!StringUtils.isEmpty(subGroupCk));
    }

    public boolean isGroupBenefitsRequest(String groupCk, String classId, String planId){
        return (!StringUtils.isEmpty(groupCk) && !StringUtils.isEmpty(classId) && !StringUtils.isEmpty(planId));
    }

    public boolean validateGroupBenefitsRequest(String groupCk, String classId, String classPlanId, String dateOfService) {
        if (DBUtils.isEmpty(groupCk)
                || DBUtils.isEmpty(classId)
                || DBUtils.isEmpty(classPlanId)
                || DBUtils.isEmpty(dateOfService)) {
            return false;
        }
        // Check date of dateOfService format.
        if (!GenericValidator.isDate(dateOfService, Constants.strFmtr_MMddyyyy, true)) {
            return false;
        }
        return true;
    }
}
