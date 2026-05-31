package User_DefineORCustom_Exception;

import java.io.IOException;

public class UserRegistration {

	public boolean registerUser(String _email) throws EmailAlreadyExistsException  {

		String email = _email;

		// log to check the email... with DB and if already available the return true

		boolean isEmailRegisted = true;
		if (isEmailRegisted) {
			throw new EmailAlreadyExistsException("Email id " + email + "already registerd");
			// 

		}
		return true;
	}

}


// throw means create new exception object and throw.
// throws means with the method. means Tells this method may  throws this  exception . So Caller should handle those Exception
// ex:- public boolean registerUser(String _email) throws EmailAlreadyExistsException , NumberFormateException