package com.learn.spring.SpringAutoWiringProject_6;

public class Car {
	
	Engine eng;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine eng) {
		super();
		this.eng = eng;
		System.out.println("This is constructor");
		}

	public Engine getEng() {
		return eng;
		
	}

	public void setEng(Engine eng) {
		this.eng = eng;
		System.out.println("tHIS IS GETTER");
	}

	@Override
	public String toString() {
		return "Car [eng=" + eng + "]";
	}
	
	

}
