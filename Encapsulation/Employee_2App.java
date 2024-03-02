package Encapsulation;

public class Employee_2App {

	public static void main(String[] args) {
		
		Employee_2 e1 = new Employee_2(1,"Ajay",4500);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		System.out.println(e1.getsalary());
		
		System.out.println("--------------");
		
		Employee_2 e2 = new Employee_2(2,"Rahul",5500.75F);
		System.out.println(e2.getEmpId());
		System.out.println(e2.getName());
		System.out.println(e2.getsalary());
		
	}

}
