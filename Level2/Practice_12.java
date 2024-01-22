package Level2;

import java.util.Scanner;

public class Practice_12 {

	public static void main(String[] args) {
		/* Reverse Sentence in Java
		 * Input: Hello World
		 * Output: World Hello
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
			String sentence = scan.nextLine();
			String reversedSentence = reverseWords(sentence);

			System.out.println(reversedSentence);
	    }
	
		public static String reverseWords(String sentence){
	        String arr[] = sentence.split(" ");
	        String arr2[] = new String [arr.length];
	        StringBuffer fs = new StringBuffer();
	        int j =0;
	        for(int i=arr.length-1;i>=0;i--){
	            arr2[j]= arr[i];
	            fs.append(arr2[j]+" ");
	            j++;
	        }
	      String  res = fs.toString();
	        return res;

	}

}
