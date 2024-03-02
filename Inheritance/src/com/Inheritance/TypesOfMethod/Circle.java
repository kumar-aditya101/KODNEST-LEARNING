package com.Inheritance.TypesOfMethod;

public class Circle extends Shape{
	double radius = 5.5;
	double CalculateArea() 
	{
	  return Math.PI * radius * radius;	
	}
	
	double CalculatePerimeter()
	{
		return 2 * Math.PI * radius;
	}
}
