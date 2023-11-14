package Level_2;

import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr Array Length:");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr[][]=new int [m][n];
		System.out.println("Enter the Array element:");
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0; j<=arr[i].length-1;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		
		int temp[][]= new int [m][n];
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr[i].length-1;j++){
				temp[i][j]=arr[i][j];
			}
		}
		
		System.out.println("Original Array Element-->");
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr[i].length-1;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Element of Temp Array-->");
		for(int i=0; i<=arr.length-1;i++){
			for(int j=0; j<=arr[i].length-1;j++){
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
