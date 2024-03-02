package com.Polymorphism.UpCasting.Examples;

public class ShapeApp {

	public static void main(String[] args) {
		
	/*	Shape sh;
		sh = new Square();
		sh.draw();
		System.out.println(sh.findArea());
		
		sh = new Rectangle();
		sh.draw();
		System.out.println(sh.findArea());
		
		sh = new Circle();
		sh.draw();
		System.out.println(sh.findArea());
		*/
		
		//Polymorphic program without code redundancy
		
		Square sq = new Square();
		Rectangle rt = new Rectangle();
		Circle cl = new Circle();
		
		Geometry gr = new Geometry();
		gr.activity(sq);
		gr.activity(rt);
		gr.activity(cl);

	}

}
