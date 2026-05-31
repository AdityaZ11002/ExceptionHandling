package ExceptionHandling;

public class TestHanding {
	public static void main(String[] args) {

		System.out.println("Starting of the program");

		String name = null;
		try {
			System.out.println("Before Exception");
			// Risky code
			System.out.println("Name: " + name.length());
			System.out.println("After Exception"); // Skipped in case of NPE
		}
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Name is Null....");
		}

		try {
			// Risky code should be inside try block
			int number = 214 / 0;
			System.out.println("Number: " + number);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Cannot divide by zero");
		}

		System.out.println("End of program");
	}
}
