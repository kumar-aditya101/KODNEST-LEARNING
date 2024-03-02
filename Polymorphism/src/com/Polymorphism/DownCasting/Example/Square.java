package com.Polymorphism.DownCasting.Example;

public class Square extends Shape {
	double findArea()
	{
		double side = 5.0;
		System.out.print("Area of square is:");
		return side * side;
	}
	
	double findSquarePerimeter()
	{
		double side = 5.0;
		System.out.print("Perimeter of square is:");
		return 4*side;
	}

}
