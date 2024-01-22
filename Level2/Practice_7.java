package Level2;

import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		// Check Palindromic String in Java.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		boolean isPalindrome = true;
		for(int i=0; i<str.length()/2;i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				isPalindrome = false;
				break;
			}
			
		}
		System.out.println("The input string is"+(isPalindrome ? " a palindrome.":" not a palindrome."));

	}
	
	/*
	public static boolean checkPalindrome(String str) {

		int left = 0;

		int right = str.length() - 1;

		while (left < right) {

		if (str.charAt(left) != str.charAt(right)) {

		return false;

		}

		left++;

		right--;

		}

		return true;

		}
		*/

}
