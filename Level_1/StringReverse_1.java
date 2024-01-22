package Level_1;

import java.util.Scanner;

public class StringReverse_1 {

	public static void main(String[] args) {
		/* Reverse the string in such way:
		 * input:Hello How Are You
		 * output:You Are How Hello
		 */
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");

		String str=scanner.nextLine();

		System.out.println("Entered Sentence is ");

		System.out.println(str);

		String arr[]=str.split(" ");

		String arr2[]=new String[arr.length];

		StringBuffer fs=new StringBuffer();

		int j=0;

		for(int i=arr.length-1;i>=0;i--)

		{

		arr2[j]=arr[i];

		fs.append(arr2[j]+" ");

		j++;

		}

		System.out.println(fs.toString());

	}

}
