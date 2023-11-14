package Level_2;

import java.util.Scanner;

public class Practice_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Array length..");
		int size1 = scan.nextInt();
		int []arr1= new int [size1];
		System.out.println("Enter "+arr1.length+" Elements:");
		for(int i=0; i<=arr1.length-1;i++){
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Enter 2nd Array length..");
		int size2=scan.nextInt();
		int[] arr2 = new int [size2];
		System.out.println("Enter "+arr2.length+" Elements: ");
		for(int i=0; i<=arr2.length-1;i++){
			arr2[i]=scan.nextInt();
		}
		
//		Merge Element of Two Array in Third Array...After first Array Element Second Array Element Start..
		int size3= size1 + size2;
		int arr3[]= new int [size3];
		for(int i=0; i<=arr1.length-1;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0; i<=arr2.length-1;i++){
			arr3[size1+i]= arr2[i];
		}
		System.out.println("Array1 Contents Are-->");
		for(int i=0;i<=arr1.length-1;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Array2 Contents Are-->");
		for(int i=0; i<=arr2.length-1;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("Merge Element of Arr1 and Arr2 is:");
		for(int i=0;i<=arr3.length-1;i++){
			System.out.print(arr3[i]+" ");
		}

	}

}
