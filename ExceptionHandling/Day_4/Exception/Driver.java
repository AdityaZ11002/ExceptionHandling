package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		
		try {
			System.out.println(("try START"));
			 br = new BufferedReader(new FileReader("C:\\Users\\adity\\Java-Backend\\ExceptionHandling\\Day_4\\Exception\\sale.txt"));  // opened the connection with the file
			
			String name = args[0]; // This may throw exception..
			
			System.out.println("Driver .main -- try end...");
			
			// System.exit(0); // this Kill the JVM
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("Name is not provided...");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Some other problem...");
			
		}
		finally {
			br.close(); // Closing the file connection...
			// Mandatory executable block -
			System.out.println("Driver. finally block...");
			
		}

	}

}

//Q. Is there any scenario when finally will not get executed ?
//=> System.exit(0); // this Kill the JVM
