package com.nttdata.nilofer.inheritance3_bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bank {
	// opening Scanner to take input
	static Scanner input = new Scanner(System.in);

	// ArrayList to hold list of Accounts;
	static ArrayList<Account> accountList = new ArrayList<Account>();

	public static void main(String[] args) {

		boolean exitFlag = false;
		do {
			int choice = mainMenu();
			if ((choice < 0) || (choice > 9)) {
				System.out.println("Error , Please enter correct choice");
			try {	choice = input.nextInt();}catch(Exception e) {choice = 0;}
			}

			switch (choice) {
			case 1: {
				newAccount();
				break;
			}
			case 2: {
				newSavingsAccount();
				break;
			}
			case 3: {
				newCurrentAccount();
				break;
			}
			case 4: {
				update();
				break;
			}
			case 5: {
				closeAccount();
				break;
			}
			case 6: {
				listAccount();
				break;
			}
			case 7: {
				addDividend();
				break;
			}
			case 8: {
				depositInAccount();
				break;
			}
			case 9: {
				withdrawAmt();
				break;
			}
			default: {
				System.out.println("Thank you");
				exitFlag = true;
				break;
			}
			}
		} while (exitFlag == false);

		input.close();
	}

	// Update all account balance by adding interest to Savings account and
	// Send letter to all current accounts which are in overdraft
	private static void update() {

		for (Account acc : accountList) {
			String myString = acc.getClass().toString();
			if (myString.contains("Current")) {
				if (acc.getBalance() < 0)
					System.out.println("Send letter account in overDraft ");
			} else if (myString.contains("Savings")) {
				SavingsAccount accSavings = (SavingsAccount) acc;
				accSavings.addInterest();
			}
		}
		System.out.println("Accounts Update Complete");
		System.out.println("Enter y to continue");
		input.next();
	}

//list all account , show available balance, overdraft limit and interest rates
	private static void listAccount() {
		for (Account acc : accountList) {
			acc.print();
			System.out.println("Enter y to continue");
			input.next();
		}
	}

	// deposit amount in accounts, update available balance
	private static void depositInAccount() {
		boolean found = false;
		try {
			System.out.println("Enter the account Number");
			int accNum = input.nextInt();
			System.out.println("Enter the Deposit Amount");
			double sum = input.nextDouble();
			for (Account acc : accountList) {
				if ((int) acc.getAccountNumber() == accNum) {
					acc.deposit(sum);
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Account Number does not exist");
			} else {
				System.out.println("Amount Deposited");
			}
		} catch (Exception e) {
			System.out.println("Invalid Data");
		} finally {
			System.out.println("Enter y to continue");
			input.next();
		}
	}

// close an account	if balance not > 0
	private static void closeAccount() {
		System.out.println("Enter the account Number to close");
		// Get an iterator.
		int accNum = input.nextInt();
		Iterator<Account> ite = accountList.iterator();
//		 Remove the second value of the list, while iterating over its elements, using
//		 the iterator's remove method.
		boolean found = false;
		while (ite.hasNext()) {
			Account acc = ite.next();
			if ((int) acc.getAccountNumber() == accNum) {
				if (acc.getBalance() > 0)
					System.out.println("can not remove , balance not zero");
				else
					ite.remove();
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("Account does not exist");
		else
			System.out.println("Account Closure Complete");
		System.out.println("Enter y to continue");
		input.next();
	}

	// add divident to all accounts
	private static void addDividend() {

		System.out.println("Enter the Dividend Amount");
		double divAmt = input.nextDouble();
		for (Account acc : accountList) {
			acc.deposit(divAmt);
		}
		System.out.println("Account Update Complete Dividend added");
		System.out.println("Enter y to continue");
		input.next();
	}

	// withdraw amount, give msg if overdraft limt reached, balance not enough
	public static void withdrawAmt() {
		boolean found = false;
	try {	
		System.out.println("Enter the account Number");
		int accNum = input.nextInt();
		System.out.println("Enter Withdrawl Amount");
		double sum = input.nextDouble();
		for (Account acc : accountList) {
			String myString = acc.getClass().toString();
			if ((int) acc.getAccountNumber() == accNum) {
				if (myString.contains("Current")) {
					CurrentAccount myAcc = (CurrentAccount) acc;
					if ((myAcc.getBalance() + myAcc.getOverDraftLimit()) < sum)
						System.out.println("Over Draft limit exceeded , cant withdraw");
					else {
						acc.withdraw(sum);
					}

				} else {
					if (acc.getBalance() < sum)
						System.out.println("Not Enough Balance , cant withdraw");
					else {
						acc.withdraw(sum);
					}
				}
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Account Number does not exist");
		} else {
			System.out.println("withdrawl complete");
		}
	}catch(Exception e){
		System.out.println("Invalid Input");
	}finally
		{System.out.println("Enter y to continue");
		input.next();}
	}

	// open new account
	private static void newAccount() {
		System.out.println("Please Enter a new Account Number ");
		int accountNumber = input.nextInt();
		// create an object of type account
		Account accountObj = new Account(accountNumber);
		accountList.add(accountObj);
		accountObj.print();
		System.out.println("Enter y to continue");
		input.next();
	}

	// open new current account
	private static void newCurrentAccount() {
		System.out.println("Please Enter a new Account Number ");
		int accountNumber = input.nextInt();
		System.out.println("Please Enter Overdraft Limit ");
		float overDraft = input.nextFloat();
		// create an object of type account
		CurrentAccount accountObj = new CurrentAccount(accountNumber, overDraft);
		accountObj.print();
		accountList.add(accountObj);
		System.out.println("Enter y to continue");
		input.next();
	}

	// print main menu
	private static int mainMenu() {
		int choice = 0;
		System.out.println("------------------------------");
		System.out.println("* 1. New Account             *");
		System.out.println("* 2. New Savings Account     *");
		System.out.println("* 3. New Current Account     *");
		System.out.println("* 4. Update Account          *");
		System.out.println("* 5. Close Account           *");
		System.out.println("* 6. List Account Details    *");
		System.out.println("* 7. Add Dividend            *");
		System.out.println("* 8. Deposit Amount          *");
		System.out.println("* 9. WithDraw Amount         *");
		System.out.println("* 0. Exit                    *");
		System.out.println("-----------------------------*");
		System.out.println("Please enter a choice :");
		try {
			choice = input.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid Option");
			choice = 0;
		}
		return choice;
	}

// open new Savings account
	private static void newSavingsAccount() {

		System.out.println("Please Enter a new Account Number ");
		int accountNumber = input.nextInt();
		System.out.println("Please Enter Interest Rate ");
		float intRate = input.nextFloat();
		// create an object of type account
		SavingsAccount accountObj = new SavingsAccount(accountNumber, intRate);
		accountObj.print();
		accountList.add(accountObj);
		System.out.println("Enter y to continue");
		input.next();
	}

}
