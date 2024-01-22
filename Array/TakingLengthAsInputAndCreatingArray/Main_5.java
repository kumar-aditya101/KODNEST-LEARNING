package TakingLengthAsInputAndCreatingArray;

import java.util.Scanner;

public class Main_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length 1st Dimension and 3rd jagged Array..");
		int arr[][][]=new int [scan.nextInt()][][];
		System.out.println("Enetr 2nd Length");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println("Enter 2D length for 1D "+i);
			arr[i]= new int [scan.nextInt()][];
		}
		System.out.println("Enetr 3D length");
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				System.out.println("Enter 3rd D length for 1st D "+i+" 2D "+j);
				arr[i][j]= new int [scan.nextInt()];
			}
		}
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				for(int k=0; k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the element");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array contents Are..");
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
