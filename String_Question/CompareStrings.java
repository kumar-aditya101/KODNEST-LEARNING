package String_Question;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// Question-3. Write a Java program to compare two strings.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str1 = scan.nextLine();
		System.out.println("Enter the second String:");
		String str2 = scan.nextLine();
		
		boolean areEqual = str1.equals(str2);
		System.out.println("The strings are " + (areEqual ? "equal" : "not equal"));

	}

}
