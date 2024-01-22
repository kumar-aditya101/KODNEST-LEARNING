package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_15 {

	public static void main(String[] args) {
		/* Check String for Anagrams in Java
		 * Input: abcd , dabc
		 * Output: The two strings are anagrams.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a String:");
		  String str1 = scan.nextLine();

	        String str2 = scan.nextLine();
	        char str3[]= str1.toCharArray();
	        char str4[]= str2.toCharArray();

	        boolean areAnagrams = areAnagrams(str3, str4);

	        if (areAnagrams) {
	            System.out.println("The two strings are anagrams.");
	        } else {
	            System.out.println("The two strings are not anagrams.");
	        }

	}
	
	public static boolean areAnagrams(char []str3, char[]str4){

        int n1 = str3.length;
        int n2 = str4.length;

        if(n1 != n2){
            return false;
        }
        Arrays.sort(str3);
        Arrays.sort(str4);
        for(int i=0; i<n1; i++){
            if(str3[i] != str4[i]){
                return false;
            }
        }
        return true;
}
	/*
	public static boolean areAnagrams(String str1, String str2) {

		// Remove spaces and convert to lowercase

		str1 = str1.replaceAll("\\s", "").toLowerCase();

		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Check if the lengths of both strings are equal

		if (str1.length() != str2.length()) {

		return false;

		}

		// Sort both strings and compare

		char[] charArray1 = str1.toCharArray();

		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);

		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);

		}
	*/

}
