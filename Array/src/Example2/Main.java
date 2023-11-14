package Example2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []arr = new int [3];
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println("Enetr the element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents Are..");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
