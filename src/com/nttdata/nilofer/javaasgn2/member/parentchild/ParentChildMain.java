package com.nttdata.nilofer.javaasgn2.member.parentchild;

public class ParentChildMain {

	public static void main(String[] args) {

		ParentClass objParent = new ParentClass();
		ChildClass objChild = new ChildClass();
		
		System.out.println(" Calling method of parent class from object of parent class");
		objParent.printFromParentClass();
		
		System.out.println("\n Calling method of child class from object of child class");
		objChild.printFromChildClass();
		
		System.out.println("\n Calling method of parent class from object of child class");
		objChild.printFromParentClass();
		
	}

}
