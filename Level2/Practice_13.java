package Level2;

import java.util.Scanner;

public class Practice_13 {

	public static void main(String[] args) {
		/* Reverse String with Space Positions Intact in Java
		 * Input: Java is Fun
		 * Output: nuFs ia vaJ
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		  String input = scan.nextLine();
	        char arr1[] = input.toCharArray();
	        char arr2[] = new char[arr1.length];
	        for(int i=0; i<=arr1.length-1; i++){
	            if(arr1[i]==' '){
	                arr2[i]=arr1[i];
	            }
	        }
	        int j= arr2.length-1;
	        for(int i=0; i<=arr1.length-1;i++){
	            if(arr1[i]!=' '){
	                if(arr2[j]==' '){
	                    j--;
	                }
	                arr2[j]=arr1[i];
	                j--;
	            }
	        }
	        input = new String (arr2);
	        System.out.println(input);
		

	}

}
