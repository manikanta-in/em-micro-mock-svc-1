package eyemed.group.controllers.api.exceptions;

/*
 * @author Vijayakumar Ramaswamy
 * @since 12/352018
 */

public class UserPasswordChangeException extends Exception{
	private String message;

    public UserPasswordChangeException(){
    }

	public UserPasswordChangeException(String message, Throwable t){
		super(message,t);
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}

}
