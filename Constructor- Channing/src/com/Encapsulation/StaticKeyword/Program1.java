package com.Encapsulation.StaticKeyword;

public class Program1 {
	static int a,b;
	int x =100, y=200;
	static //static block
	{
		a=10;	//accessing static variable
		b=20;	//accessing static variable
		//x=101;	//Error, bcz not able to access non-static variable
		//y=102;	//Error, bcz not able to access non-static variable
	}
	static void disp1() //static method
	{
		System.out.println(a); //accessing static variable
		System.out.println(b); //accessing static variable
		//System.out.println(x); //accessing non-static variable. Error, bcz not able to access non-static variable
		//System.out.println(y); //accessing non-static variable. Error, bcz not able to access non-static variable
	}
	
	{	//non-static block
		a=10;	//accessing static variable
		b=22;	//accessing static variable
		x=88;	//accessing non-static variable
		y=99;	//accessing non-static variable
	}
	
	void disp2()	//non-static method
	{
		System.out.println(x); //accessing non-static variable
		System.out.println(y); //accessing non-static variable
		System.out.println(a); //accessing static variable
		System.out.println(b); //accessing static variable
	}
	
	Program1()	//Constructor
	{
		x=888;	//accessing non-static variable
		y=999;	//accessing non-static variable
		a=111;	//accessing static variable
		b=222;	//accessing static variable
	}

	public static void main(String[] args) {
		
		Program1.disp1();
		Program1 p = new Program1();
		p.disp2();

	}

}
