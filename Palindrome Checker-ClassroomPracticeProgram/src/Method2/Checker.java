package Method2;

public class Checker {
	  boolean  PalindromeChecker(int n) {
		int reversed=0, remainder, original;
		original = n;
		while(n!=0) {
			remainder = n%10;
			reversed = reversed * 10 + remainder;
			n= n/10;
		}
		
		if(original == reversed) {
			return true;
		}
		else {
			return false;
		}
	}
}
