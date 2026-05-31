package ExceptionHandlingProject;

public class PaymentApplication {

	public static void main(String[] args) {

		System.out.println("Payment Started");

		int balance = 100;
		int amount = 5000;

		try {

			System.out.println("Checking Balance...");

			// Risky code
			if (balance < amount) {

				throw new ArithmeticException(
						"Insufficient Balance");
			}

			System.out.println("Payment Successful");
		}

		catch (ArithmeticException e) {

			System.out.println(
					"Payment Failed : " + e.getMessage());
		}

		System.out.println("Program Ended");
	}
}