package String_Question;

import java.util.Scanner;

public class GetStringLength  {

	public static void main(String[] args) {
		//Question-2. Write a Java program to get the length of the string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		int length = str.length();
		System.out.println("The length of String is:"+length);
	}

}
