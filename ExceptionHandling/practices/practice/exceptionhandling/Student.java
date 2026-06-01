package practice.exceptionhandling;

public class Student {

	public static void main(String[] args) {

		System.out.println("Program Started");

//		Arithmetic Exception 

		try {
			int marks = 100;
			int students = 0;
			int avg = marks / students;
			System.out.println("Average :" + avg);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Cannot divided by zero");
		}

//		ArrayIndexOutOfBoundsException

		try {
			int marks[] = { 10, 20, 30 };
			System.out.println(marks[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Invalid array index.");
		}

//	    NumberFormatException

		try {
//		String rollNo = "ABC";
			String rollNo = args[0]; // Gaving value through Argument
			int num = Integer.parseInt(rollNo);
			System.out.println(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Roll Number mus be Numeric.");
		}

//		NullPointerException
		try {
			String studentName = null;
			System.out.println(studentName.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Student name cannot be null.");
		}

//		Generic Exception

		try {
			String grade = null;
			System.out.println(grade.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some exception occurred.");
		}

		System.out.println("Program Ended");

	}
}
