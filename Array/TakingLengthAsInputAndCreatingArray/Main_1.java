package TakingLengthAsInputAndCreatingArray;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int []arr= new int [scan.nextInt()];
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println("Enter an element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents Are..");
		for(int i=0; i<=arr.length-1;i++){
			System.out.print(arr[i]+" | ");
		}

	}

}
