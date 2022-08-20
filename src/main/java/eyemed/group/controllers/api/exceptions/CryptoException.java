package eyemed.group.controllers.api.exceptions;

public class CryptoException extends Exception {
// ------------------------------ FIELDS ------------------------------

    private static final long serialVersionUID = -6332471981398611752L;

// --------------------------- CONSTRUCTORS ---------------------------

    public CryptoException(String message ) {
        super( message );
    }

    public CryptoException(String message, Throwable t ) {
        super( message, t );
    }
}
