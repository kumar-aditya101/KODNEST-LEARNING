package com.learn.spring.SpringAutoWiringProject_8;

public class Product {
	
	int prId;
	String prName;
	int prPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prId, String prName, int prPrice) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.prPrice = prPrice;
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public int getPrPrice() {
		return prPrice;
	}
	public void setPrPrice(int prPrice) {
		this.prPrice = prPrice;
	}
	@Override
	public String toString() {
		return "Product [prId=" + prId + ", prName=" + prName + ", prPrice=" + prPrice + "]";
	}
	
	

}
