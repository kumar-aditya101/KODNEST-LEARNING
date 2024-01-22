package Level_1;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		String reversedString = reverseWord(str);
		System.out.println("Reversed String: "+reversedString);
		
	}
	
	public static String reverseWord(String str) {
		String[] words = str.split(" ");
		StringBuilder reversed = new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			reversed.append(words[i]);
			if(i>0) {
				reversed.append(" ");
			}
		}
		return reversed.toString();
	}

}
