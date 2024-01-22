package Level2;

import java.util.Scanner;

public class Practice_19_2 {

	public static void main(String[] args) {
		/* Character Frequency Count in Java
		 * Input:programming
		 * Output:  Character: a Frequency: 1
					Character: g Frequency: 2
					Character: i Frequency: 1
					Character: m Frequency: 2
					Character: n Frequency: 1
					Character: o Frequency: 1
					Character: p Frequency: 1
					Character: r Frequency: 2
		 */ 
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter a String:");
	        String input = scanner.nextLine();
	        countCharacterFrequency(input);
	        
	    }
	    public static void countCharacterFrequency(String input){

	        int [] frequency = new int [256];
	        for(int i=0; i<input.length();i++){
	            char currentChar = input.charAt(i);
	            frequency[currentChar]++;

	        }
	        for(int i=0; i<frequency.length;i++){
	            if(frequency[i]>0){
	                char character = (char) i;
	                    System.out.println("Character: "+character+" Frequency: "+frequency[i]);
	            }
	        }

	}

}
