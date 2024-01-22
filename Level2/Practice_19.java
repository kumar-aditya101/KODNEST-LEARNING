package Level2;

import java.util.Scanner;

public class Practice_19 {

	public static void main(String[] args) {
		/*Compare Two Strings for Equality in Java without Using equals() and equalsIgnoreCase() Methods
		 * Input: Hello , Hello
		 * Output: The strings are equal.
		 */
		  Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter a String:");
	        String str1 = scanner.nextLine();

	        String str2 = scanner.nextLine();
	        

	        boolean areEqual = compareStrings(str1, str2);

	        if (areEqual) {
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }
	    }

	    public static boolean compareStrings(String str1, String str2){
	            if(str1.length() != str2.length()){
	                return false;
	            }
	            for(int i=0; i<str1.length();i++){
	                char c1 = str1.charAt(i);
	                char c2 = str2.charAt(i);

	                if(c1 != c2){
	                    return false;
	                }
	            }
	            return true;
	    }

}
