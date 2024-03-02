package com.constructorChanning.thismethod;

public class Developer {
	String projectName;
	String tech;
	public Developer() 
	{
		this("Instagram");
	}
	public Developer(String projectName)
	{
		this("FacBook", "JavaTech");
		this.projectName = projectName;
	}
	public Developer(String projectName, String tech)
	{
		this.projectName = projectName;
		this.tech = tech;
	}

}
