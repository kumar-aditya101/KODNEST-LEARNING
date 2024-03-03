package com.learn.spring.SpringWiringProject5;

public class Mobile {
	
	String brand;
	int cost;
	int ram;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String brand, int cost, int ram) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + ", ram=" + ram + "]";
	}
	
	
	

}
