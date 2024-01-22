package Level_1;

import java.util.Scanner;

public class StringReverse_3 {

	public static void main(String[] args) {
		//input: Hello How Are You
		//Output: You Are How Hello
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		System.out.println("Entered Sentences is: ");
		System.out.println(str);
		String arr[] = str.split(" ");
		String arr2[] = new String [arr.length];
		StringBuffer fs = new StringBuffer();
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr2[j]=arr[i];
			fs.append(arr2[j]+" ");
			j++;
		}
		System.out.println(fs.toString());

	}

}
