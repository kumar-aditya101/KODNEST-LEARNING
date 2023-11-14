package Level_2;

import java.util.Scanner;

public class Array_2D_ElementTrace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows and cols: ");
		int rows= scan.nextInt();
		int cols= scan.nextInt();
		int arr[][]=new int [rows][cols];
		System.out.println("Enter "+(rows*cols)+" Elements:");
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Array Contents Are:-->");
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0; j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=======================");
		for(int k=0; k<=cols-1;k++) {
			System.out.print(arr[0][k]+" ");
		}
		
		for(int k=1; k<=rows-1;k++) {
			System.out.print(arr[k][cols-1]+" ");
		}
		
		for(int k=cols-2; k>=0;k--) {
			System.out.print(arr[rows-1][k]+" ");
		}
		
		for(int k=rows-2; k>=1;k--) {
			System.out.print(arr[k][0]+" ");
		}
		
		for(int k=1; k<=cols-2;k++) {
			System.out.print(arr[1][k]+" ");
		}
		
		
		
		
		

	}

}
