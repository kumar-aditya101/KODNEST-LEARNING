package com.Polymorphism.DownCasting.Example;

public class Rectangle extends Shape {
	double findArea()
	{
		double length=10.0, breadth=5.0;
		System.out.print("Area of rectangle is:");
		return length*breadth;
	}
	
	double findRectanglePerimeter()
	{
		double length=10.0, breadth=5.0;
		System.out.print("Perimeter of Circle is:");
		return 2*(length+breadth);
	}

}
