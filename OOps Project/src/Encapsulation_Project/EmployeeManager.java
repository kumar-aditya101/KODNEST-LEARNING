package Encapsulation_Project;

public class EmployeeManager {

	private Employee e []= new Employee[10];
	private int size;
	private int capacity;
	
	 public EmployeeManager(int capacity) // constructor
	 {
		 this.capacity=capacity;
		 e = new Employee[capacity];
		 size = 0;
	 }

	public void addEmployee(String name, double salary )
	{
		if(size<capacity) {
		e[size]=new Employee(name,salary); 
		System.out.println("Employee Added Sucessfully and generated id "+e[size].getId());
		size++;
		}
		else {
			System.out.println("No Vacancy");
		}
	}
	
	public void searchEmployee( int id) 
	{
		boolean found = false;
	    for (Employee emp : e) {
	        if (emp != null && emp.getId() == id) {
	            System.out.println("Employee found:");
	            System.out.println("ID: " + emp.getId());
	            System.out.println("Name: " + emp.getName());
	            System.out.println("Salary: " + emp.getSalary());
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Employee with ID " + id + " not found.");
	    }
	
	}
	
	public void displayEmployee() 
	{	
		System.out.println("Details of All Employees:");
	    for (Employee emp : e) {
	        if (emp != null) {
	            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary());
	        }
	    }
	
	}
	 
	 
}
