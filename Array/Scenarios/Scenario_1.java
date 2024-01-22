package Scenarios;

import java.util.Scanner;

public class Scenario_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int [5];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the marks of student..");
			arr[i]=scan.nextInt();
		}
		System.out.println("Marks of the Students Are..");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" | ");
		}

	}
}
