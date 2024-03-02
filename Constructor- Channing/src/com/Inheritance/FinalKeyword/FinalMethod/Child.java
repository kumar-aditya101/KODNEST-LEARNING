package com.Inheritance.FinalKeyword.FinalMethod;

public class Child extends Parent{
	//void display() //Error becoz cannot override the final method from Parent.
	{
		System.out.println("This is child class method");
	}
}
