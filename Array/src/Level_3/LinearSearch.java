package Level_3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array..");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Key to search..");
		int key= scan.nextInt();
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]==key) {
				System.out.println("Key found at "+i);
				return;
			}
		}
		System.out.println("Key not Found..");
		
		/*int res= linearSearch(arr,key);
		if(res>=0){
			System.out.println("Key Found At the Index "+res);
		}
		else{
			System.out.println("Key Not Found");
			}
			*/
	}
	
//	Separate Method for LinearSearch
	/*  int i;
	public static int linearSearch(int arr[], int key){
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				return i;
			}
			}
				
			return -1;
	}
	*/

}
