package MultipleCatchBlock;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Program Started");

		try {
			String s = null;
			System.out.println(s.length());

			int arr[] = {10, 20, 30};
			System.out.println(arr[5]);

			int num = Integer.parseInt("abc");
			System.out.println(num);

		}
		catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) { // this will not be relational with the exceptional class
			e.printStackTrace();
			System.out.println("Exception Handled");

		}

		System.out.println("Program Ended");

	}

}