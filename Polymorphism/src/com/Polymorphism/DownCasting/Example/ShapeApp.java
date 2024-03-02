package com.Polymorphism.DownCasting.Example;

public class ShapeApp {
	public static void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.findArea());
		if(sh instanceof Square) {
			System.out.println(((Square)(sh)).findSquarePerimeter());
		}
		else if(sh instanceof Circle) {
			System.out.println(((Circle)(sh)).findCirclePerimeter());
		}
		else {
			System.out.println(((Rectangle)(sh)).findRectanglePerimeter());
		}
	}

	public static void main(String[] args) {
		
		Square sq = new Square();
		Circle cl = new Circle();
		Rectangle rc = new Rectangle();
		doActivity(sq);
		System.out.println("---------------");
		doActivity(cl);
		System.out.println("----------------");
		doActivity(rc);
		
		

	}

}
