package Level_2;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array:");
		int arr[]= new int [scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
//		 PrintArray.printForward(arr);
//	     PrintArray.printReverse(arr);
		printForward(arr);
		printReverse(arr);
		
	}
//		Print the Array in Forward and Reverse direction..
		public static void printForward(int arr[]) {
			
			System.out.println("Array in forward direction:");
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();	
		}
		
		public static void printReverse(int arr[]) {
			System.out.println("Array in reverse direction:");
			for(int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}


}
