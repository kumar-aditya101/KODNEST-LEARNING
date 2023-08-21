import java.util.Scanner;

public class Main {
	
	public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("The number is a multiple of 10.");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		checkMultipleOfTen(n);
	}

}
