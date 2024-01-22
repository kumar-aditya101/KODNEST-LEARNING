package Level_2;

import java.util.Scanner;

public class Practice_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of 1st Array..");
		int m= scan.nextInt();
		int n= scan.nextInt();
		int [][]arr1= new int [m][n];
		System.out.println("Enter the Array1 Element..");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
//				System.out.print("Enter the element of "+j +" of index "+i);
				arr1[i][j]=scan.nextInt();
			}
		}
		
		int arr2[][] = new int [m][n];
		System.out.println("Enter the Element in Array2");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
//				System.out.print("Enter the element of "+j +" of index "+i);
				arr2[i][j]=scan.nextInt();
			}
		}
//		Simply multiplication of two 2-D Array Element:-
//		int arr3[][]= new int [m][n];
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				arr3[i][j]=arr1[i][j]*arr2[i][j];
//			}
//		}
		
		int[][] arr3 = new int[m][n];

        // Perform 2D matrix multiplication
        for (int i = 0; i <=arr3.length-1; i++) {
            for (int j = 0; j <=arr3[i].length-1; j++) {
                for (int k = 0; k <=arr3[i].length-1; k++) {
                   arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
		
		System.out.println("Element Of 3rd Array Are..");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
