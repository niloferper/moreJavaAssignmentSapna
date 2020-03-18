package com.nttdata.nilofer.Calc;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// create instances of objects and variables
		Calculator operationObject = new Calculator();
		Scanner input = new Scanner(System.in);
		//declare variables
		float result;
		
		// read user input
		System.out.println("First number is : ");
		float num1 = input.nextFloat();
		System.out.println("Second number is : ");
		float num2 = input.nextFloat();

		// call sum method
		result = operationObject.sum(num1, num2);
		System.out.printf("Addition of %f and %f is %f\n", num1, num2, result);
		
		// call difference method
		result = operationObject.diff(num1, num2);
		System.out.printf("Difference of %f and %f is %f\n", num1, num2, result);
		
		// call multiply method
		result = operationObject.multiply(num1, num2);
		System.out.printf("Multiplication of %f and %f is %f\n", num1, num2, result);
		
		// call divide method
		result = operationObject.divide(num1, num2);
		System.out.printf("Division of %f and %f is %f\n", num1, num2, result);
		
		//close scanner  object
		input.close();
	}

}
