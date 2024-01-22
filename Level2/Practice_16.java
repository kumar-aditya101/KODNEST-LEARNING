package Level2;

import java.util.Scanner;

public class Practice_16 {

	public static void main(String[] args) {
		/* First Non-Repeating Character Identifier in Java
		 * Input: Hello World
		 * Output: The first non-repeating character is: H
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		   String inputString = scan.nextLine();

	        char firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

	        if (firstNonRepeatingChar != '\0') {
	            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
	        } else {
	            System.out.println("No non-repeating character found in the given string.");
	        }
	    }
	    public static char findFirstNonRepeatingChar(String inputString){
	        int [] charCount = new int [256];
	        for(char c : inputString.toCharArray()){
	            charCount[c]++;
	        }
	        for(char c : inputString.toCharArray()){
	            if(charCount[c]==1){
	                return c;
	            }
	        }
	        return '\0';
	    }
		

}


