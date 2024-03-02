package com.Inheritance.Examples;

public class Parent_1Child_1App {

	public static void main(String[] args) {
		Child_1 ch = new Child_1();
		System.out.println(ch.eyeColor); //Blue
//		System.out.println(ch.accountNumber); //Error, bcz it is private in parent class & cannot be accessed in child class.
		ch.displayParent(); //Inside Parent display 
		
	}

}
