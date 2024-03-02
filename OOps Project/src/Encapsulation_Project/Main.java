package Encapsulation_Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeManager em = new EmployeeManager(10);
		boolean b = true;
		
		
		
		while(b) {
			System.out.println("Choose the Option: ");
			System.out.println("Option-->1.Add the Employee");
			System.out.println("Option-->2.Search the Employee");
			System.out.println("Option-->3.Display Employee");
			System.out.println("Option-->4.Exit");
			 int choice = scan.nextInt();
			
			
			 switch (choice) {
			 case 1:
				System.out.println("Add the Employee");
				System.out.println("Enter the name:");
				String name =scan.next();
				
				System.out.println("Enter the salary:");
				double salary = scan.nextDouble();
				em.addEmployee(name, salary);
				break;
				
			 case 2: 
				 System.out.println("Search the Employee");
                 System.out.println("Enter the employee ID:");
                 int searchId = scan.nextInt();
                 em.searchEmployee(searchId);
                 break;
                 
			 case 3:
				 System.out.println("Display Employee");
                 em.displayEmployee();
                 break;
                 
			 case 4: 
				 System.out.println("Exiting the program.");
                 b = false;
                 break;
                 
			 default:
                 System.out.println("Invalid option. Please choose a valid option.");
                 break;
			}
			
			
			
		}
	
	}
}
	


