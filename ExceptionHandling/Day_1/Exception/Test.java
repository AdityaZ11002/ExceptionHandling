package Exception;

public class Test {
	static int someValue;

	public static void main(String[] args) { // Array is a String Formate. so what ever we supply it will in String
												// formate.so we need to convert it into integers

		System.out.println("This is sample program - Start");

		String amountstr = args[0];
		int amount = Integer.parseInt(amountstr); // "converting into integer" // "12a3" -> NumberFormatException
//		String name = null;
		String name = args[1]; // ArrayIndexOutOfBoundsException

		int result = amount / someValue; // ArithmeticException

		System.out.println("Amount : " + amount);
		System.out.println("length: " + name.length()); // NullPointerException --> exited

		System.out.println("This is sample program - End");

	}

}
