package Method2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Checker Palindrome= new Checker();
		boolean res=Palindrome.PalindromeChecker(n);
		
		if(res==true) {
			System.out.println("True, number is a palindrom");
		}
		else {
			System.out.println("False, number is not palindrom");
		}

	}

}
