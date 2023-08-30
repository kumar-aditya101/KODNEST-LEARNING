import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n = scan.nextInt();
		Math tryMath = new Math();
		int res = (int) tryMath.pow(num, n);
		System.out.println(res);
		
	}

	
}
