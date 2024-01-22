package Level_1;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		StringBuffer fs = new StringBuffer(str);
		StringBuffer rev =new StringBuffer(fs).reverse();
		if(fs.toString().equals(rev.toString())) {
			System.out.println("Palindrome string");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
