package com.nttdata.nilofer.javaasgn2.shape;

public class ShapeMain {

	public static void main(String[] args) {

		Square objSquare = new Square(7);
		System.out.println("Calling method of Shape from object of Square Class");
		objSquare.printShape();
		System.out.println("Calling method of Rectangle from object of Square Class");
		objSquare.printRectangle();;
	}

}
