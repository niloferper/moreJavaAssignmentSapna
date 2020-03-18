package com.nttdata.nilofer.javaasgn2.invoice;

public class Invoice {

	private String partNum;
	private String partDesc;
	private int qtyPurchased;
	private double price_per_item;
	//create constructor
	public Invoice(String partNum, String partDesc, int qtyPurchased, double price_per_item) {
		super();
		this.partNum = partNum;
		this.partDesc = partDesc;
		this.qtyPurchased = qtyPurchased;
		this.price_per_item = price_per_item;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQtyPurchased() {
		return qtyPurchased;
	}
	public void setQtyPurchased(int qtyPurchased) {
		this.qtyPurchased = qtyPurchased;
	}
	public double getPrice_per_item() {
		return price_per_item;
	}
	public void setPrice_per_item(double price_per_item) {
		this.price_per_item = price_per_item;
	}
	
	//get invoice -calculate invoice amount
	public void getInvoice() { 
		if (qtyPurchased<0)qtyPurchased=0;
		if (price_per_item <0 )price_per_item=0;
		double invoiceAmt = qtyPurchased*price_per_item;
		System.out.println("Invoice Amount is "+ invoiceAmt);
	}
	

}
