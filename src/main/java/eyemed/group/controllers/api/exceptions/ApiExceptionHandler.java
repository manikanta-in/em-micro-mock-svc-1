package eyemed.group.controllers.api.exceptions;

import eyemed.group.model.dto.StatusMessageDto;
import eyemed.group.model.dto.StatusMessageValidationDto;
import eyemed.group.util.Constants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Locale;

/**
 * This class provides controller advice for thrown exceptions. If your exception might be thrown from multiple
 * controllers then it probably belongs in this class. If it is specific to your controller like say "
 */
@ControllerAdvice()
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Log API_LOGGER = LogFactory.getLog(ApiExceptionHandler.class);
    private final MessageSource messageSource;

    public ApiExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * Our global exception handler when we haven't caught it with anything else.
     * @param locale Locale for processing messages
     * @param ex exception for details
     * @return Error response entity
     */
    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleGenericException(Locale locale, Exception ex) {
        API_LOGGER.error("Generic Exception in Events Controller stack", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON)
                .body(new StatusMessageDto(Constants.TECHNICAL_ERROR, messageSource.getMessage("api.internal.error", null, locale)));
    }


    /**
     * Our global exception handler when we haven't caught it with anything else.
     * @param locale Locale for processing messages
     * @param ex exception for details
     * @return Error response entity
     */
    @ExceptionHandler({ApiException.class})
    public ResponseEntity<Object> handleApiException(Locale locale, Exception ex) {
        API_LOGGER.error("Generic Exception in Events Controller stack", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON)
                .body(new StatusMessageDto(Constants.TECHNICAL_ERROR, ex.getMessage()));
    }



    /**
     * Handles authorization level errors. Is the user internal, do they have the right role or do they have access to
     * this group/subgroup/etc.
     * @param locale Locale for processing messages
     * @param ex exception for details
     * @return Error response entity
     */
    @ExceptionHandler(AuthorizationException.class)
    private ResponseEntity<Object> handleForbiddenRequestException(Locale locale, AuthorizationException ex) {
        if(API_LOGGER.isInfoEnabled()) {
            API_LOGGER.info(String.format("User attempted unauthorized access to data. User: %s", "TEST"), ex);
        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new StatusMessageDto(
                Constants.FORBIDDEN_REQUEST,
                messageSource.getMessage("api.forbidden",null,locale)));
    }


    /**
     * Errors that occur at the database level and are bubbled up. These don't have to be ORA errors, but something
     * happened in the DB to stop this action from completing successfully.
     * @param locale
     * @param ex
     * @return
     */
    @ExceptionHandler(DaoException.class)
    public ResponseEntity<Object> handleApiValidationException(Locale locale, DaoException ex) {
        API_LOGGER.error("Database Handler Exception", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).contentType(MediaType.APPLICATION_JSON)
                .body(new StatusMessageDto(Constants.TECHNICAL_ERROR, messageSource.getMessage("api.internal.error", null, locale)));
    }

    /**
     * Validation failures such as user has entered a value too long for a field. This one accepts a list of
     * ValidationErrorResult which will reference the field name, error type and populate a user message from our
     * messages properties files.
     * @param locale Locale for processing messages
     * @param ex exception for details
     * @return Error response entity
     */
    @ExceptionHandler(InputValidationException.class)
    public ResponseEntity<Object> handleInputValidationException(Locale locale, InputValidationException ex) {
        API_LOGGER.info("Validation failed: " + ex.getUserMessage(), ex);

        return ResponseEntity.unprocessableEntity().contentType(MediaType.APPLICATION_JSON)
                .body(new StatusMessageValidationDto(Constants.VALIDATION_FAILURE, ex.getUserMessage(), ex.getErrors(), messageSource, locale));
    }

//    @ExceptionHandler(FlexibleValidationException.class)
//    public ResponseEntity<Object> handleFlexibleValidationException(FlexibleValidationException ex) {
//        API_LOGGER.info("Validation failed: " + ex.getMessage(), ex);
//
//        return ResponseEntity.unprocessableEntity().contentType(MediaType.APPLICATION_JSON)
//                .body(new StatusFlexibleValidationDto(Constants.VALIDATION_FAILURE, ex.getUserMessage(), ex.getValidationResult()));
//    }

}
