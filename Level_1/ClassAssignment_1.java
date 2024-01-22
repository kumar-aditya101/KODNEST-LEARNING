package Level_1;

import java.util.Scanner;

public class ClassAssignment_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		int index = scanner.nextInt();

		char character = getCharacterAtIndex(inputString, index);

		System.out.println("Character at index " + index + ": " + character);
		
	}

	public static char getCharacterAtIndex(String str, int index) {

		if (index >= 0 && index < str.length()) {

			return str.charAt(index);

		} else {

			throw new IndexOutOfBoundsException("Index is out of bounds.");

		}

	}

	}


