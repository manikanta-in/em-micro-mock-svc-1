package eyemed.group.controllers.api.secured;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import eyemed.group.controllers.api.exceptions.ApiException;
import eyemed.group.controllers.api.exceptions.InvalidRequestException;
import eyemed.group.model.dto.StatusMessageDto;
import eyemed.group.model.dto.users.SupportContactsDto;
import eyemed.group.model.dto.users.UserCommunicationDto;
import eyemed.group.model.dto.users.UserSearchRequestDto;
import eyemed.group.model.validation.UserInputValidator;
import eyemed.group.service.UsersService;
import eyemed.group.util.Constants;
import eyemed.utils.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/private/")
public class UsersController {

    private static final Log LOGGER = LogFactory.getLog(UsersController.class);
    private static final String createSuccessful = "UserCreateSuccessful";
    private static final String createFailure = "UserCreateFailure";
    private static final String updateSuccessful = "UserUpdateSuccessful";
    private static final String updateFailure = "UserUpdateFailure";
    private static final String deleteSuccessful = "UserDeactivateSuccessful";
    private static final String deleteFailure = "UserDeactivateFailure";
    private static final String BAD_REQUEST = "BadRequest";

    private MessageSource messageSource;
    private UsersService usersService;
    private UserInputValidator validator;

    public UsersController(MessageSource messageSource, UsersService usersService,
                           UserInputValidator validator) {
        this.messageSource = messageSource;
        this.usersService = usersService;
        this.validator = validator;
    }


    @PostMapping(value = "/users/communication",produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE , MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Object> communication(@RequestParam("contactsDetails") String contactsJSONString,
                                                         @RequestParam(value="attachment",required=false) List<MultipartFile> attachments, Locale locale) {
        try {
            UserCommunicationDto userCommunicationDto  = new ObjectMapper()
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .readValue(contactsJSONString, UserCommunicationDto.class);
            if(attachments != null && attachments.size() > 10){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StatusMessageDto(
                        Constants.CONT_EXCEED_ATTACHMENT_COUNT_CODE,
                        messageSource.getMessage("contactus.attachment.ExceedMax", null, locale)));
            }
            if (userCommunicationDto == null || StringUtils.isBlank(userCommunicationDto.getEmail()) ||
                    StringUtils.isBlank(userCommunicationDto.getFirstName()) || StringUtils.isBlank(userCommunicationDto.getLastName()) ||
                    StringUtils.isBlank(userCommunicationDto.getSubject())
                    || StringUtils.isBlank(userCommunicationDto.getCategory())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StatusMessageDto(
                        Constants.CONT_INVALID_REQUEST_CODE,
                        messageSource.getMessage("contactus.invalid.criteria", null, locale)));
            }
            Map<String, String> responseHashMap = usersService.communication(userCommunicationDto, attachments, locale.toString());
            Map.Entry<String, String> message = responseHashMap.entrySet().stream().findFirst().get();
            switch (message.getKey()) {
                case Constants.CONT_REQUEST_ACCEPTED_CODE:
                    return ResponseEntity.status(HttpStatus.OK).body(new StatusMessageDto(
                            Constants.CONT_REQUEST_ACCEPTED_CODE,
                            messageSource.getMessage("contactus.request.accepted", null, locale)));
                case Constants.CONT_INVALID_REQUEST_CODE:
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StatusMessageDto(
                            Constants.CONT_INVALID_REQUEST_CODE,
                            messageSource.getMessage("contactus.invalid.criteria", null, locale)));
                default: // Internal Server Error
                    return handleInternalServerRequestException(locale);
            }
        } catch (Exception ex) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error in contactUs", ex);
            }
            return handleInternalServerRequestException(locale);
        }
    }


    /**
     * This exception should not be thrown when we have internal errors.
     */
    private ResponseEntity<Object> handleInternalServerRequestException(Locale locale) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new StatusMessageDto(
                Constants.TECHNICAL_ERROR_CODE,
                messageSource.getMessage("internal.error", null, locale)));
    }
}
