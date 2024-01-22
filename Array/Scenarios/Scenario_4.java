package Scenarios;

import java.util.Scanner;

public class Scenario_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][]= new int [3][4];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				System.out.println("Enter the Age of class "+i+" Student "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Ages of Students Are..");
		for(int i=0; i<=arr.length-1;i++){
			for(int j=0; j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}

	}

}
