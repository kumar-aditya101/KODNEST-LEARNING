package com.Inheritance.Examples;

public class ParentApp {

	public static void main(String[] args) {
		//Creating a Parent class object.
		Parent P = new Parent();
		P.foodBusiness();
		System.out.println("Eye Color of Parent is "+P.eyeColor);
		
		//Creating a Child class object.
		Child c = new Child();
		c.foodBusiness(); //inheriting method from parent class 
		System.out.println("Eye Color of Child is "+c.eyeColor);
	}

}
