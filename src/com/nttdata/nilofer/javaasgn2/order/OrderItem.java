package com.nttdata.nilofer.javaasgn2.order;

public class OrderItem {

		private String upc;
		private int quantity;
		private int price;
		//method to return the cost as multiplication of price and quantity
		public int getCost() {
			int cost= quantity * price;
			return cost;
		}
		//parameterised Constructor for Order items
		public OrderItem(String upc, int quantity, int price) {
			super();
			this.upc = upc;
			this.quantity = quantity;
			this.price = price;
		}
		
		public String toString() {
			String orderItemString = null;
			orderItemString = upc +"\t" + quantity+"\t" + price;
			return orderItemString;
			
		}
		
		
			
}
