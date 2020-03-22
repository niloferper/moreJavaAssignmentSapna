package com.nttdata.nilofer.exceptionhandling;

import java.util.Scanner;

public class CheckEmail {

	public static void main(String[] args) throws UserIdInvalidException {

		Scanner input = new Scanner(System.in);
		System.out.println("User Name : ");
		String userName = input.next();
		input.close();
		isEMail(userName)  ;
	}

	private static void isEMail(String userName) throws UserIdInvalidException {
		boolean isValid;
		int countAtTheRate = CharacterCount.chkEmail(userName, '@');
		int countDot = CharacterCount.chkEmail(userName, '.');
		if ((countAtTheRate == 1) &&((countDot == 1)||(countDot == 2)))
			isValid = true;
		else
			isValid = false;
		if (!isValid) {
			throw new UserIdInvalidException("User Id is not an email");
		}
		else {
			System.out.println("User Id Valid");
		}

	}

}
