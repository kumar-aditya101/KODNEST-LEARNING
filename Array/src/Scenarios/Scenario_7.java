package Scenarios;

import java.util.Scanner;

public class Scenario_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][]= new int [3][2][4];
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				for(int k=0; k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the marks of student  of school "+i+" of class "+j+" Student "+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Marks of the Students Are..");
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				for(int k=0; k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" | ");
				}
				System.out.println();
			}
			System.out.println(); 
		}

	}
}
