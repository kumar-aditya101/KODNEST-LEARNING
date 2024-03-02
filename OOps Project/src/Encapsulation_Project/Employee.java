package Encapsulation_Project;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private static int idgenerator=1000;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = ++idgenerator;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	

}
