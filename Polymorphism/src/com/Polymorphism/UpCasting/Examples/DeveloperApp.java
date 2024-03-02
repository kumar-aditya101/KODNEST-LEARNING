package com.Polymorphism.UpCasting.Examples;

public class DeveloperApp {

	public static void main(String[] args) {
	
	/*	Developer sh;
		sh = new BackEndDeveloper();
		sh.attendMetting();
		sh.project();
	//	sh.learnJava(); //Error becoz using parent type reference the child specific method cannot be accessed or invoked directly. 
		
		sh = new DataBaseDeveloper();
		sh.attendMetting();
		sh.project();
		// sh.learnSQL(); //Error becoz using parent type reference the child specific method cannot be accessed or invoked directly. 

		sh = new WebDeveloper();
		sh.attendMetting();
		sh.project();
		//sh.learnHTML(); //Error becoz using parent type reference the child specific method cannot be accessed or invoked directly. 
	*/
		
		//BY using DownCasting
		
		Developer dev;
		BackEndDeveloper bd = new BackEndDeveloper();
		//UpCasting -assigning BackEndDeveloper object to Developer dev reference.
		dev = bd;
		dev.attendMetting(); // Calling inherited method
		dev.project(); //Calling Overridden method
		//Performing downCasting - Converting dev (parent ref) to BackEndDeveloper(Child object).
		((BackEndDeveloper)(dev)).learnJava(); //Calling child specific method
		
		DataBaseDeveloper dd = new DataBaseDeveloper();
		//UpCasting -assigning BackEndDeveloper object to Developer dev reference.
		dev = dd;
		dev.attendMetting(); //Calling inherited method
		dev.project();  //Caling Overridden method
		//Performing downCasting - Converting dev (parent ref) to BackEndDeveloper(Child object).
		((DataBaseDeveloper)(dev)).learnSQL(); //Calling child specific method
		
		WebDeveloper wd = new WebDeveloper();
		//UpCasting -assigning BackEndDeveloper object to Developer dev reference.
		dev = wd;
		dev.attendMetting(); //Caling inherited method
		dev.project();  //Calling Overridden method
		//Perming downCasting - Converting dev (parent ref) to BackEndDeveloper(Child object).
		((WebDeveloper)(dev)).learnHTML();
		
		
		
	}

}
