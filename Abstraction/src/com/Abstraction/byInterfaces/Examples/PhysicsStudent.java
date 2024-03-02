package com.Abstraction.byInterfaces.Examples;

 class PhysicsStudent implements StudentActivities {
	 
	
	@Override
	public void attendClass() {
		System.out.println("Physics student is attending Physics class");
	}
	public void study() {
		System.out.println("Physics student is studying Physics");
	}
	public void assignment() {
		System.out.println("Physics student is doing Physics assignment");
	}
	
	
}
 
