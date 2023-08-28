package Method3;

public class Palindrome {
	 int PalindromeChecker(int n) {
			int reversed=0, remainder, original;
			original = n;
			while(n!=0) {
				remainder = n%10;
				reversed = reversed * 10 + remainder;
				n= n/10;
			}
			
			return reversed;
		}
}
