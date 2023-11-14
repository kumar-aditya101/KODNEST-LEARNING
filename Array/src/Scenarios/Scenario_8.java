package Scenarios;

import java.util.Scanner;

public class Scenario_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][][]= new int [2][][];
		arr[0]= new int[2][];
		arr[1]= new int[3][];
		
		arr[0][0] = new int[3];
		arr[0][1] = new int[4];
		
		arr[1][0] = new int[3];
		arr[1][1] = new int[2];
		arr[1][2] = new int[4];
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++){
				for(int k=0; k<=arr[i][j].length-1; k++){
					System.out.println("Enter the marks of student of school "+i+" of class "+j+" Student "+k);
					arr[i][j][k]= scan.nextInt();
				}
			}
		}
		System.out.println("Marks of the Student Are..");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++){
				for(int k=0; k<=arr[i][j].length-1; k++){
					System.out.print(arr[i][j][k]+" | ");
				}
				System.out.println();
			}
				System.out.println();
		}

	}

}
