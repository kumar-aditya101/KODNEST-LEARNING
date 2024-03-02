package com.Inheritance.Examples;

public class RobotApp {

	public static void main(String[] args) {
		
		//creating object of ChefRobot class
		ChefRobot CR = new ChefRobot();
		CR.talk(); //Inherited method from parent class
		CR.walk(); //Inherited method from parent class
		CR.charge(); //Inherited method from parent class
		CR.cook(); //Child-Specific method
		
		//Creating object of DoctorRobot class
		DoctorRobot DR = new DoctorRobot();
		DR.talk();
		DR.walk();
		DR.charge();
		DR.surgery(); //Child-Specific method
		
		//Creating object of TeacherRobot class
		TeacherRobot TR = new TeacherRobot();
		TR.talk();
		TR.walk();
		TR.charge();
		TR.teach(); //Child-Specific method

	}

}
