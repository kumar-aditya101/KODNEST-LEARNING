package PrintAtSpecificPositionValue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = scan.nextInt();
        
        int fibonacciNumber = getFibonacciNumberAtPosition(position);
        if (fibonacciNumber == -1) {
            System.out.println("Invalid position.");
        } else {
            System.out.println("Fibonacci number at position " + position + ": " + fibonacciNumber);
        }
    }

    public static int getFibonacciNumberAtPosition(int n) {
        if (n <= 0) {
            return -1; // Invalid position
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int fib1 = 0;
            int fib2 = 1;
            int nextFib = 0;
            for (int i = 3; i <= n; i++) {
                nextFib = fib1 + fib2;
                fib1 = fib2;
                fib2 = nextFib;
            }
            return nextFib;
        }
    }
}
	


