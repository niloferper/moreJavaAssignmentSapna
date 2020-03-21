package com.nttdata.nilofer.banking;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//create object of type Bank and use setter to set the values
		Bank bankObject = new Bank();
		System.out.println("Enter Account Number :");
		long accNumber = input.nextLong();
		System.out.println("Enter Account Balance :");
		float accBalance = input.nextFloat();
		bankObject.setAccNumber(accNumber);
		bankObject.setAccBalance(accBalance);		
		
		//print account info using getter after using setter to initialize values
		System.out.println("Account Number : " + bankObject.getAccNumber());
		System.out.println("Account Balance : " + bankObject.getAccBalance());
		
		//create another instance of bank object using parameterized constructor
		Bank bankObject2 = new Bank(2000000002l,35000);
		
		//print account info using getter after using setter to initialize values
		System.out.println("Account Number : " + bankObject2.getAccNumber());
		System.out.println("Account Balance : " + bankObject2.getAccBalance());
		
		
		System.out.println("Enter deposit amount:");
		float creditAmount = input.nextFloat();
		accBalance = bankObject.deposit(creditAmount);
		System.out.println("Current Balance in Account Number " + bankObject.getAccNumber() +" is : "+ accBalance);
		
		System.out.println("Enter withdrawl amount:");
		float debitAmount = input.nextFloat();
		accBalance = bankObject2.withdraw(debitAmount);
		System.out.println("Current Balance in Account Number " + bankObject2.getAccNumber() +" is : "+ bankObject2.getAccBalance());
		
		input.close();
	}

}
