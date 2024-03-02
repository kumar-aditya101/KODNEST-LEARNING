package com.Inheritance.AccessModifier_p1;

public class Program1 {
	
	public int a;	//public access modifier
	protected int b; //protected access modifier
	 int c;			// no-access modifier or default modifier
	private int d;  //private access modifier
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
