package Level2;

import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        generateAndDisplaySubstrings(input);
    }

    public static void generateAndDisplaySubstrings(String input) {
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = input.substring(i, j);
                System.out.println(substring);
            }
        }
        
		


	}

}
