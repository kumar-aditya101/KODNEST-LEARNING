package com.Polymorphism.UpCasting.Examples;

public class Circle extends Shape {
	void draw()
	{
		System.out.println("Drawing a circle shape");
		System.out.print("Area of circle is:");
	}
	
	double findArea()
	{
		double radius= 2.5;
		return Math.PI * radius * radius;
	}
}
