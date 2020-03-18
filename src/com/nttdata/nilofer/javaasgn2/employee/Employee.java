package com.nttdata.nilofer.javaasgn2.employee;

public class Employee {
	
	private float salary;
	private short wk_hrs_pd;

	public void getInfo(float salary,short wk_hrs_pd) {

		this.salary = salary;
		this.wk_hrs_pd = wk_hrs_pd;
	}

	public void addSal() {
		if (salary<500)salary += 10;
	}
	
	public void addWork() {
		if (wk_hrs_pd>6) salary+=5;

	}
	
	public void printSalary() {
		addSal();
		addWork();
		System.out.println("Employee's final Salary is : "+ salary);
	}
	
}
