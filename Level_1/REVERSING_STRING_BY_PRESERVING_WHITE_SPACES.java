package Level_1;

import java.util.Scanner;

public class REVERSING_STRING_BY_PRESERVING_WHITE_SPACES {

	public static void main(String[] args) {
		//	input: Hello How Are You
		//	output:uoYer Awo Hol leH
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ente a String");

		String str = scanner.nextLine();

		char arr1[]=str.toCharArray();

		char arr2[]=new char[arr1.length];

		//copy spaces from arr1 to arr2

		for(int i=0;i<=arr1.length-1;i++){

		if(arr1[i]==' '){

		arr2[i]=arr1[i];

		}

		}

		int j=arr2.length-1;

		for(int i=0;i<=arr1.length-1;i++){

		if(arr1[i]!=' '){

		if(arr2[j]==' '){

		j--;

		}

		arr2[j]=arr1[i];

		j--;

		}

		}

		str=new String(arr2);

		System.out.println(str);

	}

}
