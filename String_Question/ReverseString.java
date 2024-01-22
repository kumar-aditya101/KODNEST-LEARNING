package String_Question;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//Questions-6. Write a Java program to reverse a string.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		 String str = scanner.nextLine();

	        char[] chars = str.toCharArray();

	        for (int i = 0; i < chars.length / 2; i++) {
	            char temp = chars[i];
	            chars[i] = chars[chars.length - i - 1];
	            chars[chars.length - i - 1] = temp;
	        }

	        String reversedString = new String(chars);

	        System.out.println("The reversed string is " + reversedString);
        

	}

}
