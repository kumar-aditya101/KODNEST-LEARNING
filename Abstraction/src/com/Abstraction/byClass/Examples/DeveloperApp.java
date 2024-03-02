package com.Abstraction.byClass.Examples;

public class DeveloperApp {
	public static void doActivity(Developer ref) {
		ref.attendMeeting();
		ref.doProject();
		if(ref instanceof JavaDeveloper) {
			((JavaDeveloper)(ref)).learnJava();
		}
		else if(ref instanceof PythonDeveloper) {
			((PythonDeveloper)(ref)).learnPython();
		}
	}

	public static void main(String[] args) {
		
		JavaDeveloper jd = new JavaDeveloper();
		PythonDeveloper pd = new PythonDeveloper();
		doActivity(jd);
		doActivity(pd);

	}

}
