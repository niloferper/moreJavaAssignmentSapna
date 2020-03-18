package com.nttdata.nilofer.javaasgn2.order;

public class RushOrder extends Order {

	protected int deliveryDay;

	public RushOrder(int deliveryDay) {
		super();
		this.deliveryDay = deliveryDay;
	}

	public int getTotal(int total) {
		
		if (total == 0)
			return 0;
		else {
			if (deliveryDay == 1)
				total += 25;
			else if (deliveryDay == 2)
				total += 15;
			else if (deliveryDay == 3)
				total += 10;
			else
				return total;
		}
		return total;
	}

}
