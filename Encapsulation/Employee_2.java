package Encapsulation;

public class Employee_2 {
	private int empId;
	private String name;
	private float salary;
	
	public Employee_2(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId(){
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public float getsalary() {
		return salary;
	}
	 
}
