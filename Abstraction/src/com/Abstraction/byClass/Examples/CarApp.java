package com.Abstraction.byClass.Examples;

public class CarApp {
	public static void doActivity(Car cr) {
		cr.start();
		cr.stop();
		cr.refuel();
	}

	public static void main(String[] args) {
		
		ElectricCar Ec = new ElectricCar();
		DieselCar Dc = new DieselCar();
		PetrolCar Pc = new PetrolCar();
		doActivity(Ec);
		doActivity(Dc);
		doActivity(Pc);

	}

}
