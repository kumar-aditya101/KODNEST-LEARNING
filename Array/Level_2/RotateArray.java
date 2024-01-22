package Level_2;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int size = scan.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter "+arr.length+" Elements:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		 System.out.print("Enter the number of rotations (k): ");
	        int k = scan.nextInt();
		System.out.println("Original Array..");
		for(int i=0; i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		rotateArray(arr,k);
		
		System.out.print("Array after " + k + " rotations: ");
        for (int i = 0; i <=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

		

	}
	 // Function to rotate the array 'k' times
    public static void rotateArray(int[] arr, int k) {
        int length = arr.length;

        // Handle the case where k is greater than the array length
        k = k % length;

        for (int i = 0; i < k; i++) {
            // Store the last element in a temporary variable
            int temp = arr[length - 1];

            // Shift all elements one position to the right
            for (int j = length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            // Place the last element at the start of the array
            arr[0] = temp;
        }

    }
  }
