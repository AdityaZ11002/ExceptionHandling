package Exception_Types;

public class Driver {

	public static void main(String[] args) {
		
		// Unchecked Exception
		String name = null;
		System.out.println(name.length()); // NPE --> Unchecked / RunTime Exception
		
		
		
		// Checked Exception
		try {
			Class.forName("com.kodwala.Driver111"); // This is a dynamic way loading the class
			//load or read file --> FileNotFoundException
			// SQLException
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // forcing to handle it coz ClassNotFoundException is checked exception
	}

}
