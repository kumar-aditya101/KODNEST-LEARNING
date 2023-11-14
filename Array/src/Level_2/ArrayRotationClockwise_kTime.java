package Level_2;

import java.util.Scanner;

public class ArrayRotationClockwise_kTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int arr[]=new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements:");
		for(int i=0; i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Rotation Array Elements Are-->");
		for(int i=0; i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the value of k Array has to be rotated");
		int k = scan.nextInt();
		
		for(int count=1;count<=k;count++){
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--){
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		
		System.out.println("After "+k+"th times Rotation Array Element Are-->");
		for(int i=0; i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
