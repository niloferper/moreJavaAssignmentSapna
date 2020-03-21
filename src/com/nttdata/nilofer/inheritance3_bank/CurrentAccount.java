package com.nttdata.nilofer.inheritance3_bank;

public class CurrentAccount extends Account{

	private float overDraftLimit;
	public CurrentAccount(int a, float b) {
		super(a);
		overDraftLimit=b;
	}
	public String toString()
    {
	int accnum = (int)this.getAccountNumber();
	return "Acc " + accnum + ": " + "balance = " + this.getBalance() + "\n Overdraft Limit = " + overDraftLimit;    
    }
	public float getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(float overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
}
