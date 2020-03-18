package com.nttdata.nilofer.electronics;

public class Electronics {
	
	private float regularPrice;
	private String manufacturer;
	
	public float computeSaleprice() {
		
		float salePrice = (float)(regularPrice * 0.6);
		return salePrice;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(float regularPrice) {
		this.regularPrice = regularPrice;
	}
	

}
