package Method3;

import java.util.Scanner;

import Method2.Checker;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 Palindrome thePalindrome= new Palindrome();
		int res=thePalindrome.PalindromeChecker(n);
		
		if(res==n) {
			System.out.println("True, number is a palindrom");
		}
		else {
			System.out.println("False, number is not palindrom");
		}


	}

}
