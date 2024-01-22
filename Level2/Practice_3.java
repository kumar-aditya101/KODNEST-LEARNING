package Level2;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		char arr[]=str.toCharArray();
		
		 // Check if the first character of the string is a lowercase letter
        if (arr.length > 0 && arr[0] >= 'a' && arr[0] <= 'z') {
            arr[0] = (char) (arr[0] - 32); // Convert it to uppercase
        }
		
		for(int i=0; i<=arr.length-1;i++) {
			//Logic to check space
			 if(arr[i]==' ') {
				int temp = arr[i+1];
				if(temp>=97 && temp<=122){
					temp=temp-32;
				}
				arr[i+1]= (char)temp;	
			}
		}
		
		str = new String(arr);
		System.out.println(str);

	}

}
