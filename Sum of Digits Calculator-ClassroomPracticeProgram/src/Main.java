import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		SumOfDigits(n);
	}
	
	public static void SumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int Lastdigit= n%10;
			sum = sum + Lastdigit;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
