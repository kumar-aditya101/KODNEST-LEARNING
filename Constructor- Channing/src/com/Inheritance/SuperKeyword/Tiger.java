package com.Inheritance.SuperKeyword;

public class Tiger extends Animal {
	String tigerSound = "Tiger Sound";
	public void makeSound()
	{
		System.out.println("Tiger is making "+tigerSound);
	}
	public void accessParentMethod() 
	{
		super.makeSound();//Super Keyword accessing parent class(Animal class) method..
	}
	
}
