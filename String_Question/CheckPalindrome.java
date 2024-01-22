package String_Question;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		//Question-9. Write a Java program to check if a string is a palindrome.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		  String str = scan.nextLine();

	        boolean isPalindrome = true;

	        for (int i = 0; i < str.length() / 2; i++) {
	            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        System.out.println("The string is " + (isPalindrome ? "a palindrome" : "not a palindrome"));

	}

}
