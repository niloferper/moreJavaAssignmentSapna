package com.nttdata.nilofer.javaasgn2.member;

public class MemberMain {

	public static void main(String[] args) {

		Employee objEmployee = new Employee();
		Manager objManager = new Manager();
		
		objEmployee.setName("Employee1");
		objEmployee.setAge((short) 30);
		objEmployee.setAddress("Address line 1");
		objEmployee.setPhoneNumber(8888888888l);
		objEmployee.setSalary(45000);
		objEmployee.setSpecialization(" Employee1 Specialization");
		
		objManager.setName("Manager1");
		objManager.setAge((short) 40);
		objManager.setAddress("Address line n");
		objManager.setPhoneNumber(1111111111l);
		objManager.setSalary(85000);
		objManager.setDepartment(" Manager1 Department");
		
		System.out.println("Employee Information \n");
		System.out.println("Employee Name : " + objEmployee.getName() + "\n Age : "+ objEmployee.getAge() + "\n Address : "+ objEmployee.getAddress() +"\n Phone : " + objEmployee.getPhoneNumber()+ "\n Salary : " + objEmployee.getSalary()+ "\n Employee Specialization :"  + objEmployee.getSpecialization());
		System.out.println("\n Manager Information \n");
		System.out.println(" Manager Name : " + objManager.getName() + "\n Age : "+ objManager.getAge() + "\n Address : "+ objManager.getAddress() +"\n Phone : " + objManager.getPhoneNumber()+ "\n Salary : " + objManager.getSalary() + "\n Department :"  + objManager.getDepartment());
		
	}

}
