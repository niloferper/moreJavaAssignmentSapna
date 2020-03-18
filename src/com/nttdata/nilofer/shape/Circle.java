package com.nttdata.nilofer.shape;

public class Circle {
	
	public final float PI = 3.14f;
	private float radius ;
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	//method to calculate area
	 public void area() {
		 float area = PI*radius*radius;
		 System.out.println("The area of the circle is : " + area);
	 }
	 //method to calculate perimeter
	 public void perimeter() {
		 float perimeter;
		 perimeter = 2*PI*radius;
		 System.out.println("The perimeter of the circle is : " + perimeter);
	 }
	 
}
