import java.util.Scanner;

public class Main {

	 public static void printPrimes(int n) {
	        int count = 0;
	        int num = 2; // Start checking for prime numbers from 2

	        while (count < n) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the value of n: ");
	        int n = scan.nextInt();

	        printPrimes(n); // Call the function to print the first 'n' prime numbers

	        scan.close();
	    }

}
