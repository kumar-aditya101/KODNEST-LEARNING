package Level_1;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = scan.nextLine();
		char [] str = s1.toCharArray();
		System.out.println("Contents of String one below the other:");
//		for(int i=0; i<s1.length();i++) {
//			System.out.println(str[i]);
//		}

//		Inhanced for loop and Each For loop--->
		for(char x : str) {
			System.out.println(x);
		}
		

	}

	}


