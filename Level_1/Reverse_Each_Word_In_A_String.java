package Level_1;

import java.util.Scanner;

public class Reverse_Each_Word_In_A_String {
	
	/* Reverse Each Word In A String
	 * input: Hello How Are You
	 * Output: olleH woH erA uoY 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");

		String str=scanner.nextLine();

		System.out.println("Entered Sentence is ");

		System.out.println(str);

		String arr[]=str.split(" ");

		String reverseSentence="";

		for(int i=0;i<=arr.length-1;i++)

		{

		String word=arr[i];

		String revWord="";

		for(int j=word.length()-1;j>=0;j--)

		{

		revWord=revWord+word.charAt(j);

		}

		reverseSentence=reverseSentence+revWord+" ";

		}

		System.out.println("Revered Word Sentence is ");

		System.out.println(reverseSentence);
	}

}
