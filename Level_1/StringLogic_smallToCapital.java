package Level_1;

import java.util.Scanner;

public class StringLogic_smallToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();

		String result = convertCase(str);

		System.out.println(result);

	}
	
	public static String convertCase(String str) {
		char[] arr = str.toCharArray();

		for(int i = 0; i <= arr.length-1; i++) {
			int temp=arr[i];
			if(temp>=65 && temp<=90) {
				temp= temp+32;
			}
			else if(temp>=99 && temp<=122){
				temp=temp-32;
			}
			arr[i]= (char)temp;
		}
		return new String(arr);
	}

}
