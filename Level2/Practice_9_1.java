package Level2;

import java.util.Scanner;

public class Practice_9_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String input =scan.nextLine();
		String result = insert99BetweenWords(input);

      
        System.out.println("Output: " + result);
		
		
	}
	 public static String insert99BetweenWords(String input) {
	        String[] words = input.split(" ");
	        String[] resultArray = new String[2 * words.length];

	        int resultIndex = 0;
	        for (int i = 0; i < words.length; i++) {
	            resultArray[resultIndex] = words[i];
	            resultIndex++;

	            resultArray[resultIndex] = "99";
	            resultIndex++;
	        }

	        return String.join("", resultArray);
	    }

}
