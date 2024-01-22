package String_Question;

import java.util.Scanner;

public class GetCharacterAtIndex {

	public static void main(String[] args) {
		//Question-1. Write a Java program to get the character at the given index within the string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		System.out.println("Enter the index:");
		int index = scan.nextInt();
		char character = str.charAt(index);
		System.out.println("The character at given index is:"+character);
	}

}
