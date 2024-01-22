package Level_1;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		// Input: Hello World!123
		/*Output: 
		Vowels: 3
		Consonants: 7
		Digits: 3
		Special Characters: 2
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		int vowel=0, consonants=0,digit=0,symbols=0;
		str = str.toLowerCase();
		for(int i=0; i<str.length();++i) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				++vowel;
			}
			else if((ch>='a'&&ch<='z')) {
				++consonants;
			}
			else if(ch>='0' && ch<='9') {
				++digit;
			}
			else {
				++symbols;
			}
		}
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonants: "+consonants);
		System.out.println("Digits: "+digit);
		System.out.println("Special Characters: "+symbols);
		
	
	}

}
