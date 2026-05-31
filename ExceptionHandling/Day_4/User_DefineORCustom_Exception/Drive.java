package User_DefineORCustom_Exception;

public class Drive {

	public static void main(String[] args) {
		
		String email = args[0];
		
		UserRegistration ur = new UserRegistration();
		try {
		ur.registerUser(email);
		}
		catch(EmailAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println("Email is already registered. Pls connect with suppoet team...");
			
		}
		
		
		

	}

}
