
public class Checker {

	public static void  PalindromeChecker(int n) {
		int reversed=0, remainder, original;
		original = n;
		while(n!=0) {
			remainder = n%10;
			reversed = reversed * 10 + remainder;
			n= n/10;
		}
		
		if(original == reversed) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
