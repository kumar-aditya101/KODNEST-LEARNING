package com.Encapsulation.StaticKeyword;

public class Professor {
	static String UnivName = "VTU"; //static variable
	static int totalProf = 0; //static variable
	int profId; //Non-static variable
	String subject; //Non-static variable
	
	static  //static block
	{
		System.out.println("Welcome to "+UnivName);
	}
	//non-static block
	{
		totalProf += 1;
		profId = totalProf;
		System.out.println("Hiring a new Professor");
	}
	public static int getTotalProf()  //static method
	{
		return totalProf;
	}
	public void teach() //Non-static method
	{
		System.out.println("Professor ID: "+"is teaching "+subject);
	}
	
	public Professor(String subject)  //Constructor
	{
		this.subject = subject;
	}

	public static void main(String[] args) {
		
		System.out.println("Total professors at start: "+Professor.getTotalProf());
		System.out.println("---------------------------");
		Professor prof1 = new Professor("Java");
		prof1.teach();
		Professor prof2 = new Professor("SQL");
		prof2.teach();
		System.out.println("---------------------------");
		System.out.println("Total professor now: "+Professor.getTotalProf());

	}

}
