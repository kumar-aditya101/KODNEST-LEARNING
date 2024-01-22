package Level2;

import java.util.Scanner;

public class Practice_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scan.nextLine();
		str = str.replaceAll(" ","99");
		System.out.println(str);

	}

}
