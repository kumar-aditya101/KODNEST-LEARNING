package Level_2;

import java.util.Scanner;

public class Practice_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter lengths of 2D array");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr1[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		System.out.println("Enter Elements to store in array-1");
		for(int i=0;i<=arr1.length-1;i++){
			for(int j=0;j<=arr1[i].length-1;j++){
				arr1[i][j]=scan.nextInt();
			}
		}

		System.out.println("Enter Elements to store in array-2");
		for(int i=0;i<=arr2.length-1;i++){
			for(int j=0;j<=arr2[i].length-1;j++){
				arr2[i][j]=scan.nextInt();
				}
			}

		int arr3[][]=new int[m][n];
		
		//Adding contents of arr1 with arr2 and storing it in arr3
		for(int i=0;i<=arr1.length-1;i++){
			for(int j=0;j<=arr1[i].length-1;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}

		System.out.println("Array 1 contents are....");
		for(int i=0;i<=arr1.length-1;i++){
			for(int j=0;j<=arr1[i].length-1;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("================================");

		System.out.println("Array 2 contents are....");
		for(int i=0;i<=arr2.length-1;i++){
			for(int j=0;j<=arr2[i].length-1;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

		
		System.out.println("================================");

		System.out.println("Array 3 contents are....");
		for(int i=0;i<=arr3.length-1;i++){
			for(int j=0;j<=arr3[i].length-1;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
