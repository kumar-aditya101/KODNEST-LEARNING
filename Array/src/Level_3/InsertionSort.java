package Level_3;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length:");
		int arr[] = new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Element before Sorting..");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		new InsertionSort().insertionSort(arr);
	}
	void insertionSort(int arr[]){
		for(int i=1;i<=arr.length-1;i++){
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println();
		System.out.println("Array Element After Sorting:");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}


}
