package Level2;

import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		char[] charArray = input.toCharArray();

		String result = createStringFromCharArray(charArray);

		System.out.println("Created string: " + result);

		}

		public static String createStringFromCharArray(char[] arr) {

		StringBuffer sb = new StringBuffer();

//		for (char c : charArray) 
		
		for(int i=0; i<=arr.length-1;i++){

		sb.append(arr[i]);

		}
		String res = sb.toString();

		return res;
				



	}

}
