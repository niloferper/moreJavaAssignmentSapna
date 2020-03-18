package com.nttdata.nilofer.javaasgn2.employee;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

			Employee objEmployee = new Employee();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Salary :");
			float salary = in.nextFloat();
			System.out.println("Enter number of hrs worked per day :");
			short wk_hrs_pd = in.nextShort();
			objEmployee.getInfo(salary, wk_hrs_pd);
			objEmployee.printSalary();
			in.close();
	}

}
