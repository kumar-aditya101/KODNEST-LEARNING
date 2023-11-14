package Level_2;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter the element in Array..");
		
		for(int i=0; i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
//		Print Even number in Array..
		System.out.println("Even number in Array Are..");
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
