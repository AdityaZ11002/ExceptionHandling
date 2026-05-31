package ExceptionHandling1;

public class Driver {

	public static void main(String[] args) {
		
		String name =  null;
		System.out.println(name.length()); // NPE --> Unchecked / RunTime Exception
		
		// Checked Exception
		try {
			Class.forName("com.kodwala.Driver");
			//load or read file --> FileNotFoundException
			// SQLException
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // forcing to handle it coz ClassNotFoundException is checked exception
	}

}
