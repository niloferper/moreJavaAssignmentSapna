package com.nttdata.nilofer.exceptionhandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	// Java program to validate email

	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
			+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	public static void emailValidator(String email) throws UserIdInvalidException {

		if (email == null) {
			System.out.println("Please enter email");
			email = " ";
		}

		Matcher matcher = EMAIL_PATTERN.matcher(email);
		boolean isValid = matcher.matches();
		// Validate an email address
		if (!isValid) {
			throw new UserIdInvalidException("Invalid User Id. PLease enter Valid email");
			// System.out.println("The email address " + userInput + " is valid");
		} else {
			System.out.println("The email address " + email + " is valid");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Use Id");
		String userInput = input.next();
		try {
			emailValidator(userInput);
		} catch (UserIdInvalidException e) {
			e.printStackTrace();
		}

		input.close();
	}

}
