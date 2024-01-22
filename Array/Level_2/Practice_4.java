package Level_2;

import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array..");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter the Element in Array..");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
//		Print the Number in the Array which is divided by 5
		System.out.println("Number in Array which is divided by 5 Are..");
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
