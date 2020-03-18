package com.nttdata.nilofer.banking;

public class Bank {

	// create variables account number and balance
	private long accNumber;
	private float accBalance;
	
	//default constructor for object
	public Bank() {
		super();
	}
	//parameterized constructor for object
	public Bank(long accNumber, float accBalance) {
		super();
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}

	// getter and setter for account Number
	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	// getter and setter for account Balance
	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	// create methods deposit and withdraw
	public float deposit(float creditAmount) {
		accBalance += creditAmount;
		return accBalance;
	}

	public float withdraw(float debitAmount) {
		if (debitAmount > accBalance) {
			System.out.println("Not sufficient funds can not withdraw");
			return -1;
		} else {
			accBalance -= debitAmount;
			return accBalance;
		}
	}
}
