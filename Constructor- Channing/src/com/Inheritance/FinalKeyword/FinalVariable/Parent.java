package com.Inheritance.FinalKeyword.FinalVariable;

public class Parent {
	final int x=10;
	void displayParent() 
	{
		// x=55; //Error, becoz final variable value cannot be change.
		System.out.println("Value of X "+x);
	}
}
