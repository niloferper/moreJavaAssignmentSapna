package com.nttdata.nilofer.inheritance3_bank;

public class SavingsAccount extends Account{

	private float interestRate;
	public SavingsAccount(int a,float b) {
		super(a);
		interestRate = b;
	}

	public void addInterest() {
	
		double interest =((this.getBalance()*interestRate)/100); 
		
		this.deposit(interest);
	}
	public String toString()
    {
		int accnum = (int)this.getAccountNumber();
	return "Acc " + accnum + ": " + "balance = " + this.getBalance() + "\n Interest Rate = " + interestRate;    
    }
}
