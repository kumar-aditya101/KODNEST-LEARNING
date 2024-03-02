package com.Polymorphism.UpCasting.Examples;

public class Square extends Shape {
	void draw()
	{
		System.out.println("Drawing a square shape");
		System.out.print("Area of square is:");
	}
	
	double findArea()
	{
		double side= 5.5;
		return side * side;
	}
}
