package com.Abstraction.byClass.Examples;

 class JavaDeveloper extends Developer {
	 @Override
	 void doProject() 
	 {
		 System.out.println("Java developer is doing Java Project");
	 }
	 void learnJava() //Child-Specific method
	 {
		 System.out.println("Java Developer is learning Java");
	 }

}
