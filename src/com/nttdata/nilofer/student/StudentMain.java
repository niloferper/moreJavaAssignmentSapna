package com.nttdata.nilofer.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		// create a scanner object
		Scanner input = new Scanner(System.in);

		// create an instance of Student variable
		Student student1 = new Student("Student 1", "Roll No 1");

		// read user input
		System.out.println("Marks in first exam : ");
		int int1 = input.nextInt();
		System.out.println("Marks in second exam : ");
		int int2 = input.nextInt();
		System.out.println("Marks in third exam : ");
		int int3 = input.nextInt();
		
		//call method to get result and print 
		String studentResult = student1.average(int1, int2, int3);
		System.out.println("The Student is " + studentResult);
		
		//close scanner object
		input.close();

	}

}
