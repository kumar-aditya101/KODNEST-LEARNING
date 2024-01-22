package Level2;

import java.util.Scanner;

public class Practice_19_3 {

	public static void main(String[] args) {
		/* Concatenate Three Strings in Java without Using Predefined Methods.
		 * Input: Hello
		 * 		  ,
		 * 		  World!
		 * Output: Concatenated string: Hello, World!
		 */
		Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();


        String secondString = scanner.nextLine();


        String thirdString = scanner.nextLine();

        String concatenatedString = concatenateStrings(firstString, secondString, thirdString);

        System.out.println("Concatenated string: " + concatenatedString);
    }

    public static String concatenateStrings(String firstString, String secondString, String thirdString){
        int totalLength = firstString.length()+secondString.length()+thirdString.length();
        char [] result = new char[totalLength];
        int index =0;
        for(int i=0; i<firstString.length();i++){
            result[index] = firstString.charAt(i);
            index++;
        }
        for(int i=0; i<secondString.length();i++){
            result[index] = secondString.charAt(i);
            index++;
        }
        for(int i=0; i<thirdString.length();i++){
            result[index] = thirdString.charAt(i);
            index++;

        }
        return new String (result);
    }

}
