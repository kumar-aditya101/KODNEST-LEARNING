package Level_2;

import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array..");
		int arr[]= new int [scan.nextInt()];
		for(int i=0; i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before swapping");
		System.out.print("Arr==>");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Enter two indexes:");
		  int firstIndex =scan.nextInt();
		  int secondIndex =scan.nextInt();
		  int temp = arr[firstIndex];
		  
		  arr[firstIndex] = arr[secondIndex];
	      arr[secondIndex] = temp;
		
		System.out.println("After swapping");
		System.out.print("Arr==>");
	
//		Print the Array Content after swapping between two index..
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
