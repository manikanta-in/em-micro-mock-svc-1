package eyemed.group.controllers.api.exceptions;

/**
 * The DaoException is a general purpose exception class.
 * @author Vijayakumar Ramaswamy
 * @since: 10/2/2018
 */
public class DaoException extends Exception {

    public DaoException() {
        super();
    }

    public DaoException(final String message) {
        super( message );
    }

    public DaoException(final String message, Throwable cause) {
        super( message, cause );
    }

    public DaoException(final Throwable cause) {
        super( cause );
    }
}
