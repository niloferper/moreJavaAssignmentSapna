package com.nttdata.nilofer.Tax;

import java.util.Scanner;

public class TaxCalculatorMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Pan Number : ");
		String panNumber = input.next();
		System.out.print("Enter Annual Income : ");
		float annualIncome = input.nextFloat();
		System.out.print("Enter Invested Amount : ");
		float investedAmount = input.nextFloat();
		System.out.print("Enter Sex : ");
		String sex  = input.next();
		
		//create an object TaxCalculator and  another Scanner
		TaxCalculator calcTax = new TaxCalculator(panNumber, annualIncome, investedAmount, sex);
		calcTax.calculateTax(panNumber);
		input.close();

	}

}
