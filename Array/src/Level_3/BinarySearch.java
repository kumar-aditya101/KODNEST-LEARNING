package Level_3;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements :");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Key to Search");
		int key= scan.nextInt();
		int res = binarySearch(arr,key);
		if(key>=0)
		{
			System.out.println("Key Found At the Index "+res);
		}
		else
		{
			System.out.println("Key Not Found");
		}

	} 
	static int binarySearch(int arr[],int key){
		int low=0;
		int high = arr.length-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}

	return -1;
	}

}
