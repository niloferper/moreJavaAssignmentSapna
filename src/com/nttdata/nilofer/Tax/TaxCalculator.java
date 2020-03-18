package com.nttdata.nilofer.Tax;

public class TaxCalculator {

	float annualIncome;
	float investedAmount;
	float taxAmount;
	String sex;
	String panNumber;
	
	public TaxCalculator( String panNumber, float annualIncome, float investedAmount, String sex) {
		super();
		this.annualIncome = annualIncome;
		this.investedAmount = investedAmount;
		this.sex = sex;
		this.panNumber = panNumber;
	}

	
	public void calculateTax(String PanNumber) {
		
		if (annualIncome > 50000)
			taxAmount = (float) (4460 + (0.15*(annualIncome-investedAmount -15000)));
		else if (annualIncome > 30001)
			taxAmount = (float) (1960 + (0.125*(annualIncome-investedAmount -15000)));
		else if (annualIncome > 20000)
			taxAmount = (float) (960 + (0.1*(annualIncome-investedAmount -15000)));
		else if (annualIncome > 15000)
			taxAmount = (float) (560 + (0.08*(annualIncome-investedAmount -15000)));
		else if (annualIncome > 10000)
			taxAmount = (float) (260 + (0.06*(annualIncome-investedAmount -10000)));
		else if (annualIncome > 5000)
			taxAmount = (float) (60 + (0.04*(annualIncome-investedAmount -5000)));
		else if (annualIncome > 2000)
			taxAmount = (float) (0.02*(annualIncome-investedAmount -2000));
		else  
			taxAmount = 0;
		
		System.out.println("Calculated Tax : " + taxAmount);
	}
	
}
