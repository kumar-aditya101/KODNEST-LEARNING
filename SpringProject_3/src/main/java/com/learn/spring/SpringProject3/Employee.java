package com.learn.spring.SpringProject3;

import java.util.*;

public class Employee {
	
	List<String> technologies;
	Set<String> project;
	Map<String, String> companies;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(List<String> technologies, Set<String> project, Map<String, String> companies) {
		super();
		this.technologies = technologies;
		this.project = project;
		this.companies = companies;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProject() {
		return project;
	}
	public void setProject(Set<String> project) {
		this.project = project;
	}
	public Map<String, String> getCompanies() {
		return companies;
	}
	public void setCompanies(Map<String, String> companies) {
		this.companies = companies;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", project=" + project + ", companies=" + companies + "]";
	}
	
	

}
