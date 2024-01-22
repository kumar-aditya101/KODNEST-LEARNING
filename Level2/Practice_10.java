package Level2;

import java.util.HashSet;
import java.util.Scanner;

public class Practice_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String input = scan.nextLine();
		String res=longestSubstring(input);
		System.out.println(res);
		
	}
	
	public static String longestSubstring(String input) {
		String max = ""; // Initialize max to an empty string
		   for (int i = 0; i < input.length(); i++) {
	            StringBuilder currentSubstring = new StringBuilder();

	            for (int j = i; j < input.length(); j++) {
	                char currentChar = input.charAt(j);

	                if (!currentSubstring.toString().contains(String.valueOf(currentChar))) {
	                    currentSubstring.append(currentChar);
	                } else {
	                    break; // Character repeated, end the substring
	                }

	                if (currentSubstring.length() > max.length()) {
	                    max = currentSubstring.toString();
	                }
	            }
	        }

	        return max;
	}
	
	public static boolean isUnique(String str) {
		  for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    return false; // Repeated character found, not unique
	                }
	            }
	        }
	        return true; // No repeated characters found, unique
	
	}
	

}
