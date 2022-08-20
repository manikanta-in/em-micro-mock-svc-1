package eyemed.group.controllers.api.exposed;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import eyemed.group.service.SupportService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import eyemed.group.model.dto.StatusMessageDto;
import eyemed.group.model.dto.users.SupportContactsDto;
import eyemed.group.util.Constants;
import eyemed.utils.StringUtils;

@RestController
@RequestMapping("/api/v1/public/support")
@PropertySource("classpath:messages.properties")
public class SupportController {
    private static final Log LOGGER = LogFactory.getLog(SupportController.class);

    private MessageSource messageSource;

    private SupportService supportService;

    public SupportController(MessageSource messageSource,
                             SupportService supportService) {
        this.messageSource = messageSource;
        this.supportService = supportService;
    }

    @PostMapping(value = "/contactus",produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE , MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Object> contactUs(@RequestParam("contactsDetails") String contactsJSONString,
                                            @RequestParam(value="attachment",required=false) List<MultipartFile> attachments, @RequestParam String lang){
        final Locale locale = new Locale(lang);
        try {
            SupportContactsDto contactsDto  = new ObjectMapper().readValue(contactsJSONString, SupportContactsDto.class);
            if(attachments != null && attachments.size() > 10){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StatusMessageDto(
                        Constants.CONT_EXCEED_ATTACHMENT_COUNT_CODE,
                        messageSource.getMessage("contactus.attachment.ExceedMax", null, locale)));
            }
            if (contactsDto == null || StringUtils.isBlank(contactsDto.getEmail()) ||
                    StringUtils.isBlank(contactsDto.getFirstName()) || StringUtils.isBlank(contactsDto.getLastName()) ||
                    StringUtils.isBlank(contactsDto.getSubject())
                    || StringUtils.isBlank(contactsDto.getCategory())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StatusMessageDto(
                        Constants.CONT_INVALID_REQUEST_CODE,
                        messageSource.getMessage("contactus.invalid.criteria", null, locale)));
            }
            Map<String, String> responseHashMap = supportService.contactUs(contactsDto, attachments, locale.toString());
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
