 package Level2;

import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		// Remove Duplicate Characters from String in Java
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scan.nextLine();
		StringBuilder result = new StringBuilder();
		boolean [] found = new boolean [256];
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			
			if(!found [c]) {
				result.append(c);
				found[c]=true;
			}
		}
		System.out.println(result.toString());

	}

}
