package com.nttdata.nilofer.javaasgn2.shape;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	
	public void printSquare() {
		System.out.println("Square is a rectangle");
	}
	
}
