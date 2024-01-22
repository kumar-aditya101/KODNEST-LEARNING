package Level_3;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array..");
		int arr[]=new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Element Before Sorting --->");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bubbleSort(arr);
		

	}
	static void bubbleSort(int arr[]) {
		for(int i=0; i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array Element After Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
