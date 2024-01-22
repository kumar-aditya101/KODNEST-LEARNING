package Level_3;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length:");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Element before Sorting..");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		non-static method call in main method
	new SelectionSort().selectionSort(arr);

	}
	 void selectionSort(int arr[]){
		int min;
		int pos;
		for(int i=0;i<=arr.length-2;i++) {
			min= arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.println("Array Element After Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}


}
