package com.Kodnest.Pattern_Print;

import java.util.Scanner;

public class Pattern_31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==n||i==0) {
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
