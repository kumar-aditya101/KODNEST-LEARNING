package com.Abstraction.byInterfaces.Examples;

public class DeveloperApp {

	public static void main(String[] args) {
		
		Developer dv = new Developer();
		dv.learnHtml();
		dv.learnJava();
		
		
	//or
	/*
	 FrontEndTech fet = new Developer(); //UpCasting
	 fet.learnHtml(); //invoking the Overridden method of child class.
	 ((Developer)(fet)).learnHtml();
	 */
		
	// FrontEndTech fet = new FrontEndTech(); //Error, bcz interfaces cannot be inherited 
	 

	}

}
