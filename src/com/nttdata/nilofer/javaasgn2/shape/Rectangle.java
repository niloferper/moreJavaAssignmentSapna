package com.nttdata.nilofer.javaasgn2.shape;

public class Rectangle extends Shape{
	private int length;
	private int breadth;

	public void area() {
		int area = length * breadth;
		System.out.println("Area :" + area );
	}

	public void perimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter :" + perimeter );
	}
	public void printRectangle() {
		System.out.println("This is rectangular Shape");
	}


	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
