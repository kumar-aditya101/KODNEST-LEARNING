package String_Question;

import java.util.Scanner;

public class FindLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		//Question-7. Write a Java program to find the longest substring of a string without repeating characters.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		
		int[] charCount = new int[256];
		 int max = 0;
	        int start = 0;
	        int end = 0;

	        for (int i = 0; i < str.length(); i++) {
	            charCount[str.charAt(i)]++;

	            if (charCount[str.charAt(i)] == 1) {
	                end = i;
	            }

	            if (end - start > max) {
	                max = end - start;
	            }

	            if (charCount[str.charAt(i)] > 1) {
	                start = i + 1;
	            }
	        }

	        String longestSubstring = str.substring(start, end + 1);

	        System.out.println("The longest substring of a string without repeating characters is " + longestSubstring);
	}

}
