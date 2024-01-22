package Level2;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		int index = scan.nextInt();
		char res=getCharacterAtIndex(str,index);
		System.out.println("Character at index " + index + ": " + res);
	}
	
	public static char getCharacterAtIndex(String str,int index) {
		if(index>0 && index< str.length()) {
			return str.charAt(index);
		}
		else {
			throw new IndexOutOfBoundsException("Index is out of bounds.");
		}
	}

}
