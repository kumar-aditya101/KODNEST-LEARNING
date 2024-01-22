   package Level_2;

import java.util.Scanner;

public class ArrayRotationClockwise {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Rotation Array Elements:-->");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
//		One time Array Rotation like..---> 1 2 3 4 5 --->5 1 2 3 4 5
		int temp = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		System.out.println();
		System.out.println("After one time clockwise Rotation Array Element Are-->");
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
