package Level_1;

import java.util.Scanner;

public class ClassAssignment_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String result = convertCase(input);

		System.out.println(result);

		}

		public static String convertCase(String input) {

		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

		char currentChar = charArray[i];

		if (Character.isUpperCase(currentChar)) {

		charArray[i] = Character.toLowerCase(currentChar);

		} else if (Character.isLowerCase(currentChar)) {

		charArray[i] = Character.toUpperCase(currentChar);

		}

		}

		return new String(charArray);

		}

	}


