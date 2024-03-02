package com.Abstraction.byInterfaces.Examples;

//public class Person implements Coders, Tester extends Musician //Not allowed
public class Person extends Musician implements Coders, Tester{
	
	public void coding() {
		System.out.println("Person is Coding");
	}
	
	public void testing() {
		System.out.println("Person is testing");
	}

	


	
	

}
