package Level_2;

import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length:");
		int size= scan.nextInt();
		int arr1[]= new int [size];
		System.out.println("Enter "+arr1.length+" Elements: ");
		for(int i=0; i<=arr1.length-1;i++){
			arr1[i]=scan.nextInt();
		}
		
		int arr2[]= new int [size];
		System.out.println("Enter "+arr2.length+" Elements: ");
		for(int i=0;i<=arr2.length-1;i++){
			arr2[i]=scan.nextInt();
		}
		
		int arr3[]=new int [size];
		for(int i=0; i<=arr3.length-1;i++){
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("Array1 Contents Are-->");
		for(int i=0; i<=arr1.length-1;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Array2 Contents Are-->");
		for(int i=0; i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("Sum of Arr1 and Arr2 Elements Are--->");
		for(int i=0;i<=arr3.length-1;i++){
			System.out.print(arr3[i]+" ");
		}
		
	}

}
