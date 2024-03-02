package com.Abstraction.byClass.Examples;

abstract class Car {
	void start()
	{
		System.out.println("Car is Started");
	}
	void stop()
	{
		System.out.println("Car is stoped");
	}
	abstract void refuel();

}
