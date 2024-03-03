import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		// Binary Search Recursive Approach
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int []arr = new int [scan.nextInt()];
		System.out.println("Enter Array Element:");
		for(int i=0; i<=arr.length-1;i++){
			arr[i] = scan.nextInt();
		}
		// Length of array
        int n = arr.length;
		System.out.println("Enter element to be checked whether present or not:");
		int x = scan.nextInt();
		
		// Creating object of above class
		BinarySearch ob = new BinarySearch();
	   // Calling above method
		int res = ob.binarySearch(arr, 0, n - 1, x);
		
		// Element present
        if (res == -1)
 
            // Print statement
            System.out.println("Element not present");
 
        // Element not present
        else
 
            // Print statement
            System.out.println("Element found at index "+ res);

	}

}
