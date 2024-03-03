import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		// Calculate the factorial of a given number.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		
		Factorial fs = new Factorial();
		int res = fs.fact(n);
		System.out.println("Factorial of a number "+n+" is: "+res);
		
	}

}
