package String_Question;

import java.util.Scanner;

public class PrintAllPermutations {

	public static void main(String[] args) {
		//Question-10. Write a Java program to print all permutations of a string.
		 String str = "ABC";
		    permute(str, 0, str.length() - 1);
		  }

		  private static void permute(String str, int start, int end) {
		    if (start == end) {
		      System.out.println(str);
		    } else {
		      for (int i = start; i <= end; i++) {
		        str = swap(str, i, start);
		        permute(str, start + 1, end);
		        str = swap(str, i, start);
		      }
		    }
		  }

		  private static String swap(String str, int i, int j) {
		    char[] chars = str.toCharArray();
		    char temp = chars[i];
		    chars[i] = chars[j];
		    chars[j] = temp;
		    return new String(chars);

	}

}
