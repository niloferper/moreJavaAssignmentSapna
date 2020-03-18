package com.nttdata.nilofer.javaasgn2.shape;

public class RectangleMain {

	public static void main(String[] args) {

		
		Rectangle objRectangle = new Rectangle(8, 5);
		Square objSquare = new Square(5);
		System.out.println("Area and Perimeter of Rectangle :");
		objRectangle.area();
		objRectangle.perimeter();
		System.out.println("Area and Perimeter of Square :");
		objSquare.area();
		objSquare.perimeter();
	}

}
