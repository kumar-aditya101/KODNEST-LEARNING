package com.Abstraction.byClass.Examples;

public class PythonDeveloper extends Developer {
	@Override
	void doProject()
	{
		System.out.println("Python developer is doing python project");
	}
	void learnPython() //child-specific method
	{
		System.out.println("Python developer is learning python");
	}

}
