package com.nttdata.nilofer.student;

public class Student {
	String studentName;
	String rollNo;
	int ec1Marks;
	int ec2Marks;
	int ec3Marks;
	
	public String average(int marks1, int marks2, int marks3) {
		
		 String result="Fail";
		 float avg = (marks1 + marks2 + marks3)/3;
		 if (avg >=50 ) result = "Pass"; 
		return result;
	}
	
	public Student(String studentName, String rollNo) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
	}

}
