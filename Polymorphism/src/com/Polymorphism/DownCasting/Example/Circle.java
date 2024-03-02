package com.Polymorphism.DownCasting.Example;

public class Circle extends Shape {
	double findArea() {
		double radius = 2.0;
		System.out.print("Are of Circle is:");
		return Math.PI * radius * radius;
	}
	
	double findCirclePerimeter(){
		double radius = 2.0;
		System.out.print("Perimeter of Circle is:");
		return Math.PI * 2*radius;
	}
}
