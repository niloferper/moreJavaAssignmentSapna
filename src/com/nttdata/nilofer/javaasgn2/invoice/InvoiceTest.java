package com.nttdata.nilofer.javaasgn2.invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice objInvoice = new Invoice("1001", "Part Number 1", 5, 7.59);
		System.out.println("Invoice created ");
		System.out.println("Part Number : " + objInvoice.getPartNum());
		System.out.println("Description : " + objInvoice.getPartDesc());
		System.out.println("Price per item :"+ objInvoice.getPrice_per_item());
		System.out.println("Quantity Purchased :"+ objInvoice.getQtyPurchased());
		System.out.println("");
		
		//get Invoice
		objInvoice.getInvoice();

	}

}
