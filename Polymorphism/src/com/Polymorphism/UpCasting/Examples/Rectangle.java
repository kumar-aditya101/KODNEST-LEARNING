package com.Polymorphism.UpCasting.Examples;

public class Rectangle extends Shape {
	void draw()
	{
		System.out.println("Drawing a rectangle shape");
		System.out.print("Area of rectangle is:");
	}
	
	double findArea()
	{
		double length= 5.5, breadth=1.0;
		return length * breadth;
	}
}
