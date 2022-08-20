package eyemed.group.controllers.api.exceptions;

/**
 * Created by c09368 on 11/16/2018.
 */
public class EncryptDecryptException extends Exception {

    public EncryptDecryptException() { }

    public EncryptDecryptException(String message) {
        super(message);
    }

    public EncryptDecryptException(String message, Throwable t) {
        super(message,t);
    }
}
