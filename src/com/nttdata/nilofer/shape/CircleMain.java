package com.nttdata.nilofer.shape;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		
		System.out.println("Enter the radius of the circle : ");
		Scanner input = new Scanner(System.in);
		float radius = input.nextFloat();
		Circle circleObject = new Circle(radius);
		circleObject.area();
		circleObject.perimeter();
		input.close();
	}

}
