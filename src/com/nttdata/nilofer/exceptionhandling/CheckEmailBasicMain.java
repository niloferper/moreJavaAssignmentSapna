package com.nttdata.nilofer.exceptionhandling;

import java.util.Scanner;
//basic checker to see if @ and '.' are there in email

public class CheckEmailBasicMain {

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		System.out.println("User Name : ");
		String userName = input.next();
		input.close();
		try {
			isEMail(userName)  ;
		} catch (UserIdInvalidException e) {
			e.printStackTrace();
		}
	}

	private static void isEMail(String userName) throws UserIdInvalidException {
		boolean isValid;
		int countAtTheRate = CharacterCount.chkEmail(userName, '@');
		int countDot = CharacterCount.chkEmail(userName, '.');
		if ( (countAtTheRate == 1) && ( (countDot ==1 ) || (countDot == 2) || (countDot ==1 ) ) )
			isValid = true;
		else
			isValid = false;
		if (!isValid) {
			throw new UserIdInvalidException("User Id is not a valid email");
		}
		else {
			System.out.println("User Id Valid");
		}

	}

}
