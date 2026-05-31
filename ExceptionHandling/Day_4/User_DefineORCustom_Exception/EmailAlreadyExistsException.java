package User_DefineORCustom_Exception;

public class EmailAlreadyExistsException extends RuntimeException {
	
	EmailAlreadyExistsException(String _message) {
		super(_message);
	}
}
