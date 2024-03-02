package com.Abstraction.byClass.Examples;

abstract class Program2 {

	static int x,y; //static variable
	static  //static block
	{
	  x=10;
	  y=20;
	}
	static void display1() //static method
	{
		System.out.println(x+" "+y);
	}
	
	int a=11, b=22; //non-static variable
	
	{	//non-static block
		System.out.println("non-static block");
	}
	
	void display2()	//non-static Concrete method
	{
		System.out.println(a+" "+b);
	}
	
	abstract void display3();  //abstract method
	//public staic abstract void display4(); //Error, bcz cannot have static-abstract method
	
	Program2(){
		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) {
		
		Program2.display1();
		//Program2 p2 = new Program2(); //Error, Cannot create the object of abstract class
		//p2.display2();

	}

}
