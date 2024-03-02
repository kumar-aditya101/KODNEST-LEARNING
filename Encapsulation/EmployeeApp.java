package Encapsulation;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee t1 = new Employee();
		
		t1.work();
		t1.attendMeeting();
		
//		t1.empId=1;
//		t1.empName="Ajay";
//		t1.empSalary=4500;
		
		t1.empId= scan.nextInt();
		scan.nextLine();
		t1.empName= scan.nextLine();
		t1.empSalary=scan.nextFloat();
		
		System.out.println(t1.empId+" "+t1.empName+" "+t1.empSalary);
		
	}

}
