package com.Inheritance.TypesOfMethod;

public class ShapeApp {

	public static void main(String[] args) {
		
		Circle cr = new Circle();
		//Calling inherited method
		cr.draw();
		//Calling Overridden method
		System.out.println("Area of Circle:"+cr.CalculateArea());
		//Calling Child-Specific method
		System.out.println("Perimeter of Circle:"+cr.CalculatePerimeter());

	}

}
