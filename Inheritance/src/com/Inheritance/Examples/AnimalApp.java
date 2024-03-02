package com.Inheritance.Examples;

public class AnimalApp {

	public static void main(String[] args) {
		//creating of object Horse class 
		Horse hr = new Horse();
		hr.sleep(); //Inherited method
		hr.eat();	//Inherited method
		hr.run(); //Child-Specific method

	}

}
