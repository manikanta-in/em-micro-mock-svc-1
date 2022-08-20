package eyemed.group.controllers.api.exceptions;

import org.springframework.http.HttpStatus;

/*
 * @author Vijayakumar Ramaswamy
 * @since 10/3/2018
 */


public class ApiException extends RuntimeException {

    public ApiException() {
        super(HttpStatus.BAD_REQUEST.getReasonPhrase());

    }

    public ApiException(final String message) {
        super(message);
    }

    public ApiException(final String message, Throwable cause) {
        super(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase() );
    }

    public ApiException(final Throwable cause) {
        super( cause );
    }
}
