package String_Question;

import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		//Question-8. Write a Java program to find the first non-repeating character in a string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		 int[] charCount = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            charCount[str.charAt(i)]++;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            if (charCount[str.charAt(i)] == 1) {
	                System.out.println("The first non-repeating character in the string is " + str.charAt(i));
	                break;
	            }
	        }

	}

}
