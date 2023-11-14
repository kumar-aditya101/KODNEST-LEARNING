package Scenarios;

import java.util.Scanner;

public class Scenario_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[10];
		for(int i=0; i<=arr.length-1;i++){
			System.out.println("Enter the name of Employee..");
			arr[i]=scan.next();
		}
		System.out.println("Name of the Employee Are..");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" | ");
		}

	}

}
