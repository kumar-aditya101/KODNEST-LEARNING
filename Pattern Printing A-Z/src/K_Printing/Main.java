package K_Printing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if (j == 0 || (i + j == n - 1) || (i == j && i >= n / 2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
