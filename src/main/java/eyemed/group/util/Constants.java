package eyemed.group.util;

import eyemed.utils.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by c09368 on 10/3/2018.
 */
public class Constants {

    private static final Log LOGGER = LogFactory.getLog(Constants.class);

    private static Environment environment;

    public Constants(Environment environment) {
        this.environment = environment;
    }

    //General
    public static final String GROUP_PORTAL_SYSTEM_NAME = "GroupMgmt";
    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String strFmtr_MMddyyyy = "MM/dd/yyyy";
    public static final String DATE_FORMAT_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public static final DateTimeFormatter dtFmtr_MMddyyyy = DateTimeFormat.forPattern("MM/dd/yyyy");
    public static final DateTimeFormatter dtFmtr_yyyyMMddHHmmss = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final String SPACE_CHAR = " ";
    public static final String DEFAULT_HTTP_PREFIX = "http://";
    public static final String CONNECTION_MANAGER_TIMEOUT = "http.connection-manager.timeout";
    public static final String SO_TIMEOUT = "http.socket.timeout";
    public static final String CONNECTION_MANAGER_TIMEOUT_VALUE = "3000";
    public static final String SO_TIMEOUT_VALUE = "3000";
    public static final String HTTP_SUCCESS_CODE = "200";
    public static final String HTTP_BAD_REQUEST_CODE = "400";
    public static final String TECHNICAL_ERROR_CODE = "500";
    public final static String SUCCESS_STATUS = "Success";
    public final static String FAILURE_STATUS = "Failure";
    public static final String NO_RECORD_FOUND = "NoRecordFound";
    public static final String NO_REPORT_FOUND = "NoReportFound";
    public static final String INVALID_REQUEST = "invalidRequest";
    public static final String FORBIDDEN_REQUEST = "Forbidden";
    public static final String TECHNICAL_ERROR = "Internal Server Error";
    public static final String VALIDATION_FAILURE = "ValidationFailure";

    //User
    public final static String USER_ALREADY_EXIST = "UserAlreadyExist";
    public final static String USER_HAS_NOT_ALL_ACCESS = "UserHasNotAllAccess";
    public final static String USER_NEED_REGISTRATION = "UserNeedRegistration";

    //User Role
    public static final String GRP_CLIENT_ROLE_TEXT = "ROLE_EMGROUPSCLIENT";
    public static final String GRP_ADMIN_ROLE_TEXT = "ROLE_EMGROUPSADMIN";
    public static final String GRP_FINANCE_ROLE_TEXT = "ROLE_EMGROUPSFINANCE";
    public static final String GRP_PROCESSOR_ROLE_TEXT = "ROLE_EMPROCESSOR";
    public static final String GRP_USER_ROLE_TYPE_INTERNAL = "Internal";
    public static final String GRP_USER_ROLE_TYPE_EXTERNAL = "External";

    // STATUS CODES
    public final static String STATUS_ACTIVE_CODE = "A";
    public final static String STATUS_PENDING_CODE = "P";
    public final static String STATUS_DELETED_CODE = "D";
    public final static String STATUS_ACTIVE = "Active";
    public final static String STATUS_PENDING = "Pending";
    public final static String STATUS_DELETED = "Inactive";
    public final static String STATUS_ALL = "All";
    public final static String STATUS_EXCLUDE_INACTIVE = "ExcludeInactive";

   //Group Search
    public static final int FIND_GROUP_FUTURE_DAYS = 180;
    public static final int FIND_GROUP_PAST_MONTH= 14;
    public static final String GROUP_PARENT_TYPE = "P";
    public static final int GRP_LIST_CHUNK_SIZE = 500;

    // HISTORY TYPE
    public static final String GROUP_TYPE = "G";
    public static final int MAX_ROW = 250;
    public static final int USER_HISTORY_NO_OF_DAYS = 7;

    // Member Search
    public static final String GROUP_MEMBER_SEARCH_ALL = "ALL";
    public static final String GROUP_SUBGROUP_MEMBER_SEARCH_ALL = "ALL";
    public static final String MEMBER_ID_SOURCE_SG = "SG";
    public static final String MEMBER_ID_SOURCE_CS = "CS";

    //GetMember
    public static final String MEMBER_SUBSCRIBER_CODE = "M";
    public static final String MEMBER_SUBSCRIBER_NAME = "SUBSCRIBER";
    public static final String MEMBER_DEPENDENT_NAME = "DEPENDENT";
    public static final String LINK_DATA_DELIMITER = "|";
    public static final String HOME_ADDRESS = "H";

    // Member Benefit
    public static final String IN_NETWORK = "I";
    public static final String OUT_OF_NETWORK = "O";
    public static final String IN_OUT_NETWORK = "B";

    //Member Transaction
    public final static String HOLD_SUCCESS_STATUS = "Hold Member Success";
    public final static String HOLD_FAILURE_STATUS = "Hold Member Failure";
    public static final String MBR_MAINT_HOLD_TRANS_CODE = "H"; //hold
    public static final String MBR_MAINT_COMPLETED_TRANS_CODE = "C"; //completed
    public final static String MBR_MAINT_HOLD_TRANS = "Hold";
    public static final String MBR_MAINT_COMPLETED_TRANS = "Completed";
    public static final String MBR_MAINT_ENROLL_DATE_TRANS = "UPDATE_ENROLL_DATE";
    public static final String MBR_MAINT_VOID_MEMBER_TRANS = "VOID_COVERAGE";
    public static final String MBR_MAINT_ADD_COVERAGE = "ADD_COVERAGE";
    public static final String MBR_MAINT_UPDATE_COVERAGE = "UPDATE_COVERAGE";
    public static final int    OLD_TRANSCATIONS_NUM_DAYS = 1;
    public static final String DEPENDENT_MEMBER_TYPE = "Dependent";
    public static final String SUBSCRIBER_MEMBER_TYPE = "Subscriber";
    public static final String INVALID_MEMBER_STATUS_CODE = "1001";

    //ETSL Member Maintenance action Type
    public static final String MEMBER_ACTION_ADD = "Add";
    public static final String MEMBER_ACTION_UPDATE = "Update";
    public static final String MEMBER_ACTION_CHANGE= "Change";
    public static final String MEMBER_ACTION_VOID = "Void";
    public static final String MEMBER_ACTION_REACTIVATE="ReActivate";
    public static final String MEMBER_ACTION_TERMINATE="Terminate";

    // Configuration
    public static final String SECURITY_CATEGORY = "SECURITY";
    public static final int REGISTRATION_EXPIRATION_DEFAULT_DAYS = 7;
    public static final String REGISTRATION_TOKEN_TYPE= "Registration";
    public static final String REG_TOKEN_EXP_KEY = "REG_TOKEN_EXP";  //Key at Misc table
    public static final String PASSWORD_UPDATE_DELAY = "PASSWORD_UPDATE_DELAY";  //Key at Misc table
    public static final String PRIMARY_CONTACT_ACCESS_KEY = "PRIMARY_CONTACT";  //Key at Misc table will be preceded with role
    public static final String CREATE_USER_ACCESS_KEY = "CREATE_USER";  //Key at Misc table will be preceded with role
    public static final String MEMBER_MAINTENANCE_ACCESS_KEY = "MEMBER_MAINTENANCE";  //Key at Misc table will be preceded with role
    public static final String MEMBER_SEARCH_ACCESS_KEY = "MEMBER_SEARCH";  //Key at Misc table will be preceded with role
    public static final String VIEW_INVOICES_ACCESS_KEY = "VIEW_INVOICES";  //Key at Misc table will be preceded with role
    public static final String MEMBER_SEARCH_OR_MAINTENANCE_ACCESS_KEY = "MEMBER_SEARCH_OR_MAINTENANCE";
    public static final String USER_ROLE_TITLE_CATEGORY = "USER_ROLE_TITLE";
    public static final String USER_ROLE_TITLE_AM = "AM";
    public static final String USER_ACCOUNT_TYPE = "USER_ACCOUNT_TYPE";
    public static final String PAYMENT_HISTORY_GRP = "PAYMENT_HISTORY_GRP";
    public static final String CLIENT_APP_NW_ELIG_PHONE_CONFIG = "CLIENT_APP_NW_ELIG_PHONE_";
    public static final String SESSION_PRIMARY_CONTACT = " SESSION_PRIMARY_CONTACT";
    public static final String SESSION_SUB_GROUP_ACCESS_LIST = "SESSION_SUB_GROUP_ACCESS_LIST";

    //Token Messages
    public static final String TOKEN_REQUEST_ACCEPTED = "TokenRequestAccepted";
    public static final String TOKEN_ATTEMPT_FAILED = "TokenAttemptFailed";
    public static final String TOKEN_VARIFICATION_SUCCESS_CODE = "200";
    public static final String TOKEN_NOT_FOUND_CODE = "498";
    public static final String TOKEN_EXPIRED_CODE = "440";
    public static final String USER_NOT_FOUND_CODE = "401";
    public static final String USER_NOT_FOUND = "UserNotFound";
    public static final String EXCEEDED = "Exceeded";
    public static final String EXCEEDED_ATTEMPTS = "ExceededAttempts";
    public static final String NOT_EXCEEDED = "NotExceeded";
    public static final String REMAINING_ATTEMPS ="0";

    //Password
    public static final String PASSWORD_UPDATE_SUCCESS = "PasswordUpdated";
    public static final String PASSWORD_UPDATE_SUCCESS_CODE = "200";
    public static final String PASSWORD_UPDATE_FAILURE = "PasswordUpdateFailed";

    //User Registration
    public static final String REGISTRATION_COMPLETE_SUCCESS = "RegistrationSuccess";
    public static final String REGISTRATION_COMPLETE_FAILURE = "RegistrationFailed";
    public static final String REGISTRATION_COMPLETE_EXPIRED = "RegistrationExpired";
    public static final String RESENT_REGISTRATION_DETAILS_SUCCESS = "ResentRegistrationDetailsSuccess";
    public static final String RESENT_REGISTRATION_DETAILS_FAILURE = "ResentRegistrationDetailsFailed";

    //Invoice
    public static final String ACTION_BLOCK = "Block";
    public static final String ACTION_UN_BLOCK = "UnBlock";
    public static final int FIND_INVOICE_PAST_MONTH = 13;
    public static final String INVOICE_CATEGORY = "INVOICE";
    public static final String INVOICE_CHILD_TYPE_CATEGORY = "INVOICE_CHILD_TYPE";
    public static final String OPEN_INVOICE_STATUS_KEY = "OPEN_INVOICE_STATUS";
    public static final String INVOICE_TYPE_KEY = "INVOICE_TYPES";
    public static final String INVOICE_STATUS_OPEN = "O";
    public static final String INVOICE_STATUS_ALL = "ALL";
    public static final String INVOICE_STATUS_PAID = "PAID";
    public static final String INVOICE_STATUS_ONLY_PAID = "ONLY_PAID";

    //CyberSource
    public static final String CYBERSOURCE_AVAILABILITY_CATEGORY = "CybersourceAvailability";
    public static final String CYBERSOURCE_CONFIGURATION_CATEGORY = "CSCONFIG";
    public static final String CYBERSOURCE_CONFIG_TOKEN_CATEGORY = "CSCONFIG_TOKEN";
    public static final String CYBERSOURCE_CONFIG_ONETIME_CATEGORY = "CSCONFIG_ONETIME";
    public static final String CYBERSOURCE_DECESSION_ACCEPT = "ACCEPT";
    public static final String CYBERSOURCE_DECESSION_DECLINE = "DECLINE";
    public static final String CYBERSOURCE_DECESSION_CANCEL = "CANCEL";
    public static final String CYBERSOURCE_DECESSION_REJECT = "REJECT";
    public static final String CYBERSOURCE_DECESSION_ERROR = "ERROR";
    public static final int CYBERSOURCE_ACCEPT_REASON_CODE = 100;
    public final static String DELETE_TOKEN_FAILURE_STATUS = "DELETE_TOKEN_FAILURE";

    //Cybersource codes  for Payment Method
    public static final String PAYMENT_METHOD_CS_CC = "card";
    public static final String PAYMENT_METHOD_CS_ECHECK = "echeck";
    public static final String PAYMENT_METHOD_CS_CC_UI_DISPLAY = "CREDIT CARD";
    public static final String PAYMENT_METHOD_CS_ACH_UI_DISPLAY = "ACH";
    public static final String PAYMENT_METHOD_TYPE_ADD = "ADD";
    public static final String PAYMENT_METHOD_TYPE_UPDATE = "UPDATE";
    public static final String PAYMENT_METHOD_TYPE_UPDATE_AUTOPAY = "UPDATE_AUTOPAY";

    //ETS Service codes  for Payment Method
    public static final String PAYMENT_METHOD_CC = "C";
    public static final String PAYMENT_METHOD_ACH = "E";
    public static final String PAYMENT_METHOD_CHECK = "H";
    public static final String PAYMENT_METHOD_ACTIVE = "A";
    public static final String PAYMENT_METHOD_INACTIVE="I";
    public static final String PAYMENT_METHOD_AUTOPAY_ACTIVE = "Y";
    public static final String PAYMENT_METHOD_AUTOPAY_INACTIVE = "N";

    // Payment Method
    public static final String CLIENT_PAYMENT_METHOD_NO_FOUND       = "NoClientPaymentMethod";
    public static final String CLIENT_NOT_AUTHORIZE_TO_PAY          = "NotAuthorizeToPay";
    public static final String CLIENT_NO_TRANSACTION_DATA_TO_SAVE   = "NoTransactionDataToSave";
    public static final String CLIENT_CYBERSOURCE_UPDATE_FAILED     = "CyberSourceUpdatedFailed";
    public static final String CLIENT_PAYMENT_SAVE_SUCCESS          = "updatedSuccessfully";
    public static final String CLIENT_ACCESS_DENIED                 = "AccessDenied";
    public static final String HTTP_FORBIDDEN                       = "Forbidden";


    // Reports
    public static final String ENROLL_REPORT_VALIDATE = "VALIDATE";
    public static final String ENROLL_REPORT_CREATE = "CREATE";
    public static final String ENROLL_REPORT_EXISTS = "ReportExists";
    public static final String ENROLL_REPORT_IN_PROCESS = "ReportInProcess";
    public static final String ENROLL_REPORT_REQUESTED= "ReportRequested";
    public static final String ENROLL_REPORT_ISSUES= "ReportRequestIssue";
    public static final String ENROLL_REPORT_RECORD_NOT_FOUND= "RecordNotFound";
    public static final String ENROLL_REPORT_USER_EMIL_NOT_EXISTS= "EmailIdNotExists";
    public static final String ENROLL_REPORT_ADMIN_SYSTEM_NAME = "GROUPADMIN";
    public static final String ENROLL_REPORT_CLIENT_SYSTEM_NAME = "GROUP MGT";
    public static final String REPORT_DOWNLOAD_ACCESS_NOT_FOUND = "AccessNotFound";
    public static final String REPORT_DOWNLOAD_FILE_NOT_FOUND = "FileNotFound";
    public static final String REPORT_DOWNLOAD_RECORD_NOT_FOUND = "RecordNotFound";
    public static final String DWL_ENROLL_RPT_CODE = "EN";
    public static final String DWL_INVOICE_RPT_CODE = "IN";
    public static final String REPORTS_TYPE_CATEGORY = "REPORTS_TYPE";
    public static final String REPORTS_TYPE_CATEGORY_ID_CARD = "CARD";

    //New Client
    public static final int GRP_SUB_GRP_NAME_MAX_LENGTH = 50;
    public static final String GRP_PLAN_TYPE_COMMERCIAL = "Commercial";
    public static final String GRP_PLAN_TYPE_COMMERCIAL_NON_SINGLE = "COMMERCIAL_NON_SINGLE";
    public static final String GRP_PLAN_TYPE_COMMERCIAL_SINGLE = "Commercial Single Plan";
    public static final String GRP_BILL_TYPE_FULLY_FUNDED = "Fully Insured";
    public static final String GRP_BILL_TYPE_ASO = "ASO (PSPM/PMPM)";
    public static final String GRP_APPLICATION_STATUS_COMPLETE = "Closed";
    //ContactUs
    public static final String CONT_REQUEST_ACCEPTED_CODE  = "CONT001";
    public static final String CONT_INVALID_REQUEST_CODE = "CONT002";
    public static final String CONT_EXCEED_ATTACHMENT_COUNT_CODE = "CONT003";
    public static final String CONTACT_US_MEMBER_TO_EMAIL_KEY = "CONTACT_US_MEMBER_TO_EMAIL";
    public static final String CONTACT_US_PROVIDER_TO_EMAIL_KEY = "CONTACT_US_PROVIDER_TO_EMAIL";
    public static final String FILE_TYPES_CATEGORY = "FILE_TYPES";
    public static final String CONTACTS_FILE_TYPE_KEY = "CONTACT_US_FILE_TYPES";
    public static final String EMAIL_CATEGORY = "EMAIL";

    public static String getStatusCode(String description) {
        String code = "";
        if (description.equalsIgnoreCase(STATUS_ACTIVE)) {
            code = STATUS_ACTIVE_CODE;
        } else if (description.equalsIgnoreCase(STATUS_DELETED)) {
            code = STATUS_DELETED_CODE;
        } else if (description.equalsIgnoreCase(STATUS_PENDING)) {
            code = STATUS_PENDING_CODE;
        } else if (description.equalsIgnoreCase(STATUS_EXCLUDE_INACTIVE)) {
            code = STATUS_ACTIVE_CODE + ","
                    + STATUS_PENDING_CODE;
        } else if (description.equalsIgnoreCase(STATUS_ALL)) {
            code = STATUS_ACTIVE_CODE + ","
                    + STATUS_DELETED_CODE + ","
                    + STATUS_PENDING_CODE;
        }
        return code;
    }

    public static String getStatusName(String code) {
        String name = "";
        if (code.equalsIgnoreCase(STATUS_ACTIVE_CODE)) {
            name = STATUS_ACTIVE;
        } else if (code.equalsIgnoreCase(STATUS_DELETED_CODE)) {
            name = STATUS_DELETED;
        } else if (code.equalsIgnoreCase(STATUS_PENDING_CODE)) {
            name = STATUS_PENDING;
        }

        return name;
    }

    public static String getMemberTransactionStatusCode(String description) {
        String code = "";

        if (description.equalsIgnoreCase(MBR_MAINT_HOLD_TRANS)) {
            code = MBR_MAINT_HOLD_TRANS_CODE;
        } else if (description.equalsIgnoreCase(MBR_MAINT_COMPLETED_TRANS)) {
            code = MBR_MAINT_COMPLETED_TRANS_CODE;
        }

        return code;
    }

    public static String getMemberTransactionStatusName(String code) {
        String name = "";

        if (code.equalsIgnoreCase(MBR_MAINT_HOLD_TRANS_CODE)) {
            name = MBR_MAINT_HOLD_TRANS;
        } else if (code.equalsIgnoreCase(MBR_MAINT_COMPLETED_TRANS_CODE)) {
            name = MBR_MAINT_COMPLETED_TRANS;
        }

        return name;
    }

    public static String getMemberTypeName(String code){
        String name = "";
        if(code.equalsIgnoreCase(MEMBER_SUBSCRIBER_CODE)){
            name = MEMBER_SUBSCRIBER_NAME;
        }else{
            name = MEMBER_DEPENDENT_NAME;
        }
        return name;
    }

    public static String reportFilterType(String filterType){
        if(eyemed.utils.StringUtils.isBlank(filterType)){
            return null;
        }else if("Active".equalsIgnoreCase(filterType)){
            return "Y";
        }else if("Inactive".equalsIgnoreCase(filterType)){
            return "N";
        }
        return null;
    }

    public static String buildDelimitedString(List<Long> values, String delimiter) {
        String res = "";
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                res += delimiter;
            }
            res = res + values.get(i);
        }
        return res;
    }


    public static boolean isStringEqual(String str1, String str2) {
        if (((str1 == null && str2 == null) || (StringUtils.isBlank(str1) && str2 == null) || (str1 == null && StringUtils.isBlank(str2)) ||
                (!StringUtils.isBlank(str1) && !StringUtils.isBlank(str2)
                        && str1.trim().equalsIgnoreCase(str2.trim())))) {
            return true;
        }
        return false;
    }

    public static boolean fieldLengthValidation(String input, int maxLen){
        if(input != null && !StringUtils.isBlank(input) && input.trim().length() > maxLen){
            return true;
        }
        return false;
    }

    /** Some dates need to be set to null. */
    public static final boolean validateDateFormat(final DateTime dateTime ) {
       if ( dateTime != null ) {
            DateTimeFormatter formatter = DateTimeFormat.forPattern( "MM/dd/yyyy" );
            DateTime testBefore = formatter.parseDateTime( "12/30/9999" );
            DateTime testAfter = formatter.parseDateTime( "12/31/1752" );
            if ( dateTime.isAfter(testAfter) && dateTime.isBefore( testBefore ) ) {
                return true;
            }
        }
        return false;
    }

    public static String getHostUrl(String hostUrl) {
        String prefix = "";
        if (!hostUrl.startsWith("http")) {
            if (environment!=null && "dev".equalsIgnoreCase(environment.getProperty("eyemed.instance.dev"))) {
                prefix = "http://";
                LOGGER.warn("DETECTING DEV ENVRIRONMENT, using HTTP instead of HTTPS");
            } else {
                prefix = DEFAULT_HTTP_PREFIX;
            }
        }
        return prefix + hostUrl;
    }
}
