package Level2;

import java.util.Scanner;

public class Practice_17 {

	public static void main(String[] args) {
		/* Find the Longest Word in a String
		 * Input: Java Programming is Fun
		 * Output: Longest Word: Programming
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String:");
		String input = scanner.nextLine();
        
        // Find and display the longest word in the input string
        String longestWord = findLongestWord(input);
        System.out.println("Longest Word: " + longestWord);
    }
	
	public static String findLongestWord(String input){
        String [] words = input.split("[\\s,.;!?]+");
        String longestWord = null;
        int  maxLength =0;
        for(String word : words){
            if(word.length()>maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
		

}
