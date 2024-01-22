package String_Question;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		//Question-4. Write a Java program to concatenate two strings.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String:");
		String str1 = scan.nextLine();
		System.out.println("Enter second String:");
		String str2 = scan.nextLine();
		
//		String concate = str1.concat(str2);
		String concate = str1+str2;
		System.out.println("The concatenated string is: "+concate);

	}

}
