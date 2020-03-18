package com.nttdata.nilofer.javaasgn2.order;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		String upc;
		int qty;
		int price;
		System.out.println("Enter upc");
		upc = in.next();
		System.out.println("Enter quantity");
		qty = in.nextInt();
		System.out.println("Enter price");
		price = in.nextInt();
		
		
		//create order items
		OrderItem objItem1 = new OrderItem(upc,qty,price);
		OrderItem objItem2 = new OrderItem("upc2",15,7);
		OrderItem objItem3 = new OrderItem("upc3",7,18);
		
		//create object for Order
		Order objOrder = new Order();
		
		//add orderitems to order
		objOrder.addOrderItem(objItem1);
		objOrder.addOrderItem(objItem2);
		objOrder.addOrderItem(objItem3);
		
		//get total for the order
		
		System.out.println("Total for the current order is : " + objOrder.getTotal() + " before delivery charges");
		objOrder.printOrderItems();
		System.out.println("Enter delivery choice : 1 day, 2 day, 3day ( Standard 4 days or more)");
		
		int choice = in.nextInt();
		
		RushOrder objRushOrder = new RushOrder(choice);
		if ((choice ==1)||(choice ==2)||(choice ==3))
		System.out.println("Total for the current order is : " + objRushOrder.getTotal(objOrder.getTotal()) + " with " + choice + " day delivery");
		else
			System.out.println("Total for the current order is : " + objRushOrder.getTotal(objOrder.getTotal()) + " with free delivery");
	}

}
