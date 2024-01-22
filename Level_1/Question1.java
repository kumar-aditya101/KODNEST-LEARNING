package Level_1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the String");
		String str = scan.nextLine(); 
		String[] arr=splitString(str);
		for(String c : arr) {
			System.out.print(c+" ");
		}
		
		

	}
	public static String[] splitString(String str) {
		String[] substrings= str.split(" ");
		
		for(int i=0; i<substrings.length;i++) {
			substrings[i] =new StringBuilder(substrings[i]).reverse().toString();
		}
		
		return substrings;
	}

}
