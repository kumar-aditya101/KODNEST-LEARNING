package com.Inheritance.FinalKeyword.FinalVariable;

public class Child extends Parent {
	void displayChild() 
	{
		// x=99; //Error, becoz final variable value cannot be changed.
		System.out.println("Value of x "+x);
	}
}
