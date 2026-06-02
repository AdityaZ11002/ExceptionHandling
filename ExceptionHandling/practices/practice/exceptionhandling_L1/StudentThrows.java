package practice.exceptionhandling_L1;

/**
 * throw -> Creates the exception 
 * throws -> Declares that the method may throw the exception
 **/

public class StudentThrows {

	public static void main(String[] args) throws ArithmeticException {

		int marks = 120;

		if (marks < 0 || marks > 100) {
			throw new ArithmeticException("Invalid Marks");
		}

		System.out.println("Marks: " + marks);
	}
}
