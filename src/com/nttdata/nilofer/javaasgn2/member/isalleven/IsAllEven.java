package com.nttdata.nilofer.javaasgn2.member.isalleven;

import java.util.Arrays;

public class IsAllEven {

	public static void main(String[] args) {

		int[] inputEvenNos = new int[] { 12, 34, 56, 2, 8 };
		int[] inputMixedNos = new int[] { 12, 35, 56, 21, 19 };
		int[] inputOddNos = new int[] { 11, 35, 65, 23, 57 };
		//return Arrays.stream(inputEvenNos).allMatch( i -> i % 2 == 0);
		
		System.out.println("The result when the array " + Arrays.toString(inputEvenNos) + " is entered is " + isAllEven(inputEvenNos));
		System.out.println("The result when the array " + Arrays.toString(inputMixedNos) + " is entered is " + isAllEven(inputMixedNos));
		System.out.println("The result when the array " + Arrays.toString(inputOddNos) + " is entered is " + isAllEven(inputOddNos));
	}

	public static boolean isAllEven(int[] input) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

}
