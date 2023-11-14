package TakingLengthAsInputAndCreatingArray;

import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of 1st Dimension");
		int arr[][]= new int [scan.nextInt()][];
		//2nd Dimension Array creation Logic
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter 2D length for 1st Dimension "+i);
			arr[i]= new int [scan.nextInt()];
		}
		//Storing Logic
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				System.out.println("Enter the element");
				arr[i][j]=scan.nextInt();
			}
		}
		//Displaying Logic
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
	}

}
