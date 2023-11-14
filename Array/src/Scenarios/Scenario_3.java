package Scenarios;

import java.util.Scanner;

public class Scenario_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double arr[]= new double[10];
		for(int i=0;i<=arr.length-1;i++){
			System.out.println("Enter the height of players..");
			arr[i]= scan.nextDouble();
		}
		System.out.println("Height of the players Are..");
		for(int i=0; i<=arr.length-1;i++){
			System.out.print(arr[i]+" | ");
		}

	}
}
