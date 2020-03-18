package com.nttdata.nilofer.javaasgn2.order;

import java.util.ArrayList;

public class Order {

	// Create an Array List of Order Items
	ArrayList<OrderItem> listOfOrderItem = new ArrayList<>();

	// addOrderItem() method takes an object of OrderItem
	// as the parameter and stores it in the list
	public void addOrderItem(OrderItem objOrderItem) {
		listOfOrderItem.add(objOrderItem);
	}

	// The getTotal() method returns the total cost of all order items in the order
	public int getTotal() {
		int total = 0;
		// System.out.println(listOfOrderItem.size());
		if (listOfOrderItem.size() == 0)
			return 0;
		for (OrderItem orderItem : listOfOrderItem) {
			total = total + orderItem.getCost();
		}
		return total;
	}

	// The printOrderItems() method prints information about each order item via the
	// toString() method of the OrderItem class.
	public void printOrderItems() {
		int count = 0;
		for (OrderItem orderItem : listOfOrderItem) {
			System.out.println("Order Item " + ++count + " : " + orderItem.toString());
		}
	}

}
