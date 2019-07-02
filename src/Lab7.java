import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		getValidName(scnr);
		getValidEmail(scnr);
		getValidPhone(scnr);
		getValidDate(scnr);

	}

	private static String getValidName(Scanner scnr) {
		boolean isValid = false;
		String userInput;
		do {
			System.out.println("Please enter a valid Name: ");
			userInput = scnr.nextLine();

			if (userInput.matches("[A-Z]{1}[a-z]{0,29}")) {
				isValid = true;
				System.out.println("Name is valid!");
			} else {
				System.out.println("Sorry name is not valid!");
				isValid = false;

			}

		} while (!isValid);
		return userInput;

	}

	private static String getValidEmail(Scanner scnr) {
		boolean isValid = false;
		String userInput;
		do {
			System.out.println("Please enter a valid email: ");
			userInput = scnr.nextLine();

			if (userInput
					.matches("[A-Za-z0-9_]{5,30}@[A-Za-z0-9_]{5,10}.[A-Za-z0-9_]{2,3}")) {
				isValid = true;
				System.out.println("Email is valid!");
			} else {
				System.out.println("Sorry email is not valid!");
				isValid = false;

			}

		} while (!isValid);
		return userInput;

	}

	private static String getValidPhone(Scanner scnr) {
		boolean isValid = false;
		String userInput;
		do {
			System.out.println("Please enter a valid phone number");
			userInput = scnr.nextLine();

			if (userInput.matches("\\d{3}-\\d{3}-\\d{4}")) {
				isValid = true;
				System.out.println("Valid phone number! Thank you!");
			} else {
				System.out.println("Sorry, phone is not valid!");
				isValid = false;

			}

		} while (!isValid);
		return userInput;

	}

	private static String getValidDate(Scanner scnr) {
		boolean isValid = false;
		String userInput;
		do {
			System.out.println("Please enter a valid date:");
			userInput = scnr.nextLine();

			if (userInput.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
				System.out.println("Valid date!");
				isValid = true;
			} else {
				System.out.println("Sorry, date is not valid!");
				isValid = false;
			}

		} while (!isValid);
		return userInput;

	}

}
