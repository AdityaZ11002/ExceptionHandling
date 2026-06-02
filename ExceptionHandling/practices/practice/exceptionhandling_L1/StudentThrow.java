package practice.exceptionhandling_L1;

/**
 * try -> Contains code that may cause an exception.
 * 
 * catch -> Handles the exception generated in the try block.
 * 
 * throw -> Used to manually generate an exception.
 * 
 * throws -> Used to declare an exception in a method signature.
 * 
 * throw -> Manually generates an exception and transfers control to catch. Even
 * if the condition is true, executing throw will cause an exception.
 * 
 * Exception Object -> An object that contains exception details.
 * 
 * e -> Reference variable that stores the exception object.
 * 
 * getMessage() -> Used to retrieve the exception message from the exception
 * object.
 * 
 * -> throw executes only when the control reaches the throw statement. If the
 * condition is false, the throw statement is skipped and no exception occurs.
 **/



public class StudentThrow {
	public static void main(String[] args) {

		int marks = 120;

		try {
			if (marks < 0 || marks > 100) {
				throw new ArithmeticException("Invalid Marks");
			}
			System.out.println("Marks: " + marks);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
