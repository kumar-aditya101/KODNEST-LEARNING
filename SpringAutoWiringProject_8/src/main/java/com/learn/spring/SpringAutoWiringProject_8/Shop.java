package com.learn.spring.SpringAutoWiringProject_8;

public class Shop {

	Product pr;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(Product pr) {
		super();
		this.pr = pr;
		System.out.println("Auto-wiring done through Constructor");
	}

	public Product getPr() {
		return pr;
	}

	public void setPr(Product pr) {
		this.pr = pr;
	}

	@Override
	public String toString() {
		return "Shop [pr=" + pr + "]";
	}
	
	
}
