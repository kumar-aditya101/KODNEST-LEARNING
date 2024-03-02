package com.Polymorphism.UpCasting.Examples;

public class Geometry {
	//Polymorphic program without code redundancy
	public void activity(Shape sh) {
		sh.draw();
		System.out.println(sh.findArea());
	}
}
