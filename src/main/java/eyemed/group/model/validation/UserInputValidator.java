package eyemed.group.model.validation;

import eyemed.group.model.dto.users.GroupAccessDto;
import eyemed.group.model.dto.users.UserDetailsDto;
import eyemed.group.model.dto.users.UserDto;
import eyemed.group.model.dto.users.UserSearchRequestDto;
import eyemed.group.security.SecurityHelper;
import eyemed.group.service.ConfigurationService;
import eyemed.group.util.Constants;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

@Repository
public class UserInputValidator {
    private ConfigurationService configurationService;
    private static final int EMAIL_LENGTH = 77;
    private static final int USER_NAME_LENGTH = 27;
    private static final int USER_PHONE_LENGTH = 10;
    private static final int USER_PHONE_EXT_LENGTH = 7;
    private static final int USER_ID_LENGTH = 20;

   public UserInputValidator(ConfigurationService configurationService){
       this.configurationService = configurationService;
   }
    private boolean isUserEmpty(UserDto user) {
        return (StringUtils.isEmpty(user.getUserId()) || StringUtils.isEmpty(user.getFirstName()) ||
                StringUtils.isEmpty(user.getLastName()) || StringUtils.isEmpty(user.getEmail()));
    }

    private boolean isUserDetailsEmpty(UserDetailsDto userDetails) {
        return (StringUtils.isEmpty(userDetails.getUser()) || isUserEmpty(userDetails.getUser())
                || StringUtils.isEmpty(userDetails.getSubGroupAccess()));
    }

    private boolean isGroupAccessEmpty( GroupAccessDto groupAccess) {
        return (StringUtils.isEmpty(groupAccess.getGroupCk()) || StringUtils.isEmpty(groupAccess.getGroupId()) ||
                StringUtils.isEmpty(groupAccess.getSubGroupId()) || StringUtils.isEmpty(groupAccess.getSubGroupCk()));
    }

    private boolean isAccessEmpty(List<GroupAccessDto> groupAccessDtoList) {
        return groupAccessDtoList.stream()
                .anyMatch(grpAcc -> !grpAcc.getAccess().isPrimaryContact()
                        && !grpAcc.getAccess().isMemberMaintenanceAllowed()
                        && !grpAcc.getAccess().isCreateGroupUsersAllowed()
                        && !grpAcc.getAccess().isMemberSearchAllowed()
                        && !grpAcc.getAccess().isViewInvoicesAllowed()
                );
    }

    private boolean isAllGroupAccessEmpty(List<GroupAccessDto> groupAccessDtoList) {
        return groupAccessDtoList.stream()
                .allMatch(grpAcc -> !grpAcc.getAccess().isPrimaryContact()
                        && !grpAcc.getAccess().isMemberMaintenanceAllowed()
                        && !grpAcc.getAccess().isCreateGroupUsersAllowed()
                        && !grpAcc.getAccess().isMemberSearchAllowed()
                        && !grpAcc.getAccess().isViewInvoicesAllowed()
                );
    }

    private boolean isUserSearchRequestEmpty(UserSearchRequestDto userSearchRequest) {
        return (StringUtils.isEmpty(userSearchRequest.getUserId()) &&
                StringUtils.isEmpty(userSearchRequest.getEmail()) &&
                StringUtils.isEmpty(userSearchRequest.getGroupId()) &&
                StringUtils.isEmpty(userSearchRequest.getGroupName()) &&
                StringUtils.isEmpty(userSearchRequest.getFirstName()) &&
                StringUtils.isEmpty(userSearchRequest.getLastName()) &&
                StringUtils.isEmpty(userSearchRequest.getGroupCk()) &&
                StringUtils.isEmpty(userSearchRequest.getSubGroupCk()));
    }

    public boolean isValidFindUserRequest(UserSearchRequestDto userSearchCriteria) {
        return ((!userSearchCriteria.isRelatedUsersRequired() && !userSearchCriteria.isRequiredUserProfileOnly() && !isUserSearchRequestEmpty(userSearchCriteria)) ||
                (userSearchCriteria.isRelatedUsersRequired() && !userSearchCriteria.isRequiredUserProfileOnly() && !StringUtils.isEmpty(userSearchCriteria.getUserId())) ||
                (!userSearchCriteria.isRelatedUsersRequired() && userSearchCriteria.isRequiredUserProfileOnly() &&
                        (!StringUtils.isEmpty(userSearchCriteria.getUserId()) || !StringUtils.isEmpty(userSearchCriteria.getEmail())))
        );

    }

    public boolean isValidCreateUserRequest(UserDetailsDto userDetails) {
        return (!isUserDetailsEmpty(userDetails) && !isUserEmpty(userDetails.getUser()) &&
                !StringUtils.isEmpty(userDetails.getSubGroupAccess()) && !isInvalidLengthForUser(userDetails.getUser()));
    }

    public boolean isValidUpdateUserRequest(UserDetailsDto userDetails) {
        return !isUserDetailsEmpty(userDetails) && !isUserEmpty(userDetails.getUser()) &&
                !StringUtils.isEmpty(userDetails.getSubGroupAccess()) &&  !isInvalidLengthForUser(userDetails.getUser());
    }

    public String createUserDataValidation(UserDetailsDto userDetails, MessageSource messageSource, Locale locale) throws Exception {
            String result = createAndUpdateUserDataValidation(userDetails,messageSource,locale);
        if(result == null){
            //check if the input has at lease one access selected
            if(isAllGroupAccessEmpty(userDetails.getSubGroupAccess())){
                return messageSource.getMessage("user.all.access.empty", null, locale);
            }

            //check if authenticated user has to create any one of the subgroup access
            if(Constants.GRP_USER_ROLE_TYPE_EXTERNAL.equalsIgnoreCase(SecurityHelper.getUserRoleDto().getUserType().name())){
                List<GroupAccessDto> possibleInputAccess = userDetails.getSubGroupAccess().stream().filter(
                        inputAccessDto -> inputAccessDto.getAccess().isMemberSearchAllowed() ||
                                inputAccessDto.getAccess().isMemberMaintenanceAllowed() ||
                                inputAccessDto.getAccess().isViewInvoicesAllowed() ||
                                inputAccessDto.getAccess().isCreateGroupUsersAllowed() ||
                                inputAccessDto.getAccess().isPrimaryContact())
                        .collect(Collectors.toList());

                if(possibleInputAccess.stream().findAny().isPresent()){
                    List<GroupAccessDto> userRoleAccess = SecurityHelper.getUserRoleDto().getSubGroupAccess();
                    boolean inValidAccessList = true;
                    for(GroupAccessDto pAcc : possibleInputAccess){
                        if(userRoleAccess.stream().anyMatch(subGroup ->
                                subGroup.getSubGroupCk().toString().equalsIgnoreCase(String.valueOf(pAcc.getSubGroupCk()))
                                        && subGroup.getAccess().isCreateGroupUsersAllowed())){
                            inValidAccessList = false;
                            break;
                        }
                    }
                    if(inValidAccessList){
                        return messageSource.getMessage("user.no.create.access", null, locale);
                    }
                }
            }
        }
        return result;
    }

    public String updateUserDataValidation(UserDetailsDto userDetails,  MessageSource messageSource, Locale locale) throws Exception {
        //check if the input has at lease one access selected
        if(!SecurityHelper.getUsername().equalsIgnoreCase(userDetails.getUser().getUserId())
                && (userDetails.getSubGroupAccess()==null || isAllGroupAccessEmpty(userDetails.getSubGroupAccess()))){
            return messageSource.getMessage("user.all.access.empty", null, locale);
        }
        return createAndUpdateUserDataValidation(userDetails,messageSource,locale);
    }

    private String createAndUpdateUserDataValidation(UserDetailsDto userDetails,  MessageSource messageSource, Locale locale) throws Exception{
        String result = null;
        Map<String,String> accountTypes = configurationService.getConfigurationDetails(Constants.USER_ACCOUNT_TYPE, null);
        if(accountTypes != null && !accountTypes.containsValue(userDetails.getUser().getAccountType())){
                return messageSource.getMessage("user.account.type.invalid", null, locale);
        }

        return result;
    }

    private boolean isValidEmail(String email){
       if(StringUtils.isEmpty(email) || email.length() > EMAIL_LENGTH){
           return false;
       }
       Matcher matcher = Constants.EMAIL_PATTERN.matcher(email);
       return matcher.find();
    }

    private boolean isInvalidLengthForUser(UserDto user) {
        return (StringUtils.isEmpty(user) || user.getFirstName().length() > USER_NAME_LENGTH || user.getLastName().length() > USER_NAME_LENGTH ||
                (!StringUtils.isEmpty(user.getPhone()) && user.getPhone().length() > USER_PHONE_LENGTH )||
                (!StringUtils.isEmpty(user.getExt()) && user.getExt().length() > USER_PHONE_EXT_LENGTH ) ||
                StringUtils.isEmpty(user.getUserId()) || user.getUserId().length() > USER_ID_LENGTH );
    }
}
