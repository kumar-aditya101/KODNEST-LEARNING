
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrime(n);

	}
	
	public static void printPrime(int n) {
		int count=0;
		for(int i=2;count<n;i++) {
			boolean res= checkPrime(i);
			if(res==true)

			{

			System.out.print(i+" ");

			count++;

			}
		}
		
	}
	
	public static boolean checkPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
