package eyemed.group.security;

import eyemed.group.model.dto.users.UserRoleDto;
import eyemed.group.model.dto.users.UserSecurityDto;
import eyemed.group.util.Constants;
import eyemed.group.util.DBUtils;
import org.joda.time.DateTime;

public class SecurityHelper {


    /** This method return user session's UserRoleDto
     * */
    public static UserRoleDto getUserRoleDto(){
        UserRoleDto userRole = new UserRoleDto();
        userRole.setUserType(UserRoleDto.UserType.Internal);
        return userRole;
    }

    // User subGroupCk access validation from session.
    public static boolean userSubGroupAccessValidation(String subGroupCk){
        return false;
    }

    public static boolean userSubGroupValidationByAccess(String subGroupCk, String access) {
        return false;
    }

    public static boolean internalUserValidationByAccess(String access){
        return false;
    }

    public static String getUsername(){
        return "TEST";
    }

    public static String getBenefitServiceDate(DateTime serviceDate){
        DateTime nowDate = new DateTime();
        if(serviceDate != null && nowDate.toLocalDate().isBefore(serviceDate.toLocalDate())){
            return DBUtils.toString(serviceDate, Constants.strFmtr_MMddyyyy);
        }else{
            return DBUtils.toString(nowDate, Constants.strFmtr_MMddyyyy);
        }
    }

}
