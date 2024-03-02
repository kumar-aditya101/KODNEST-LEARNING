package com.Abstraction.byInterfaces.Examples;

 class ChemistryStudent implements StudentActivities {
	 
	public void attendClass(){
		System.out.println("Chemistry student is attending Chemistry class");
	}
	public void study() {
		System.out.println("Chemistry student is studying Chemistry");
	}
	public void assignment() {
		System.out.println("Chemistry student is doing Chemistry assignment");
	}
}
