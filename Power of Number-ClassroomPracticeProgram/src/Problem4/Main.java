package Problem4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		Power4 power = new Power4();
	int digits=power.countdigits(num);
	int res= power.raiseToPower(num, digits);
	System.out.println("Result when "+num+" Raised to power "+digits+" is "+res);

	}

}
