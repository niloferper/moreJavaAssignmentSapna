package com.nttdata.nilofer.electronics;

import java.util.Scanner;

public class ElectronicsMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Electronics electronicObject = new Electronics();
		// get values t initialise manufacturer and regular
		System.out.println("Enter Regular Price");
		float regPrice = in.nextFloat();
		System.out.println("Enter Manufacturer");
		String manufacturer = in.next();
		electronicObject.setRegularPrice(regPrice);
		electronicObject.setManufacturer(manufacturer);
		float saleprice = electronicObject.computeSaleprice();
		System.out.println("The sale price of electronic item is : " + saleprice + " and the manyfacturer is " + electronicObject.getManufacturer());
		in.close();
	}

}
