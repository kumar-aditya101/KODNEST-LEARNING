package String_Question;

import java.util.Scanner;

public class FindSubstring {

	public static void main(String[] args) {
		//Question-5. Write a Java program to find the substring of a string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		
		System.out.print("Enter the substring: ");
	    String substring = scan.nextLine();
		 boolean containsSubstring = str.contains(substring);
		System.out.println("The substring " + (containsSubstring ? "is" : "is not") + " found in the string");
		
	}

}
