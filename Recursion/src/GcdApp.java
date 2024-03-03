import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		// Find the GCD between the two number.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number:");
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		GreatestCommonDivisor sb = new GreatestCommonDivisor();
		
		int res = sb.gcd(m,n);
		System.out.println("GCD of two number "+m+","+n+" is: "+res);
		

	}

}
