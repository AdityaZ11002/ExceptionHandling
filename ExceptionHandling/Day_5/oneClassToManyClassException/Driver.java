package oneClassToManyClassException;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Driver.main() START");

		User user = new User();

		try {

			user.userCreate();

		}

		catch (ArithmeticException e) {

			e.printStackTrace();

			System.out.println(
					"Unable to create user. Please contact support team");
		}

		System.out.println("Driver.main() END");
	}
}

class Account {

	public void createAccount() {

		System.out.println("Account.createAccount() START");

		if (true) {

			throw new NullPointerException(
					"Unable to create default account");
		}

		System.out.println("Account.createAccount() END");
	}
}

class User {

	public void userCreate() {

		Account account = new Account();

		try {

			account.createAccount();

		}

		catch (NullPointerException e) {

			e.printStackTrace();

			throw new ArithmeticException(
					"Unable to create user");
		}

		System.out.println("User.userCreate() END");
	}
}