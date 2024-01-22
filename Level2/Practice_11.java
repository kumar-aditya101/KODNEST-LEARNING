package Level2;

import java.util.Scanner;

public class Practice_11 {

	public static void main(String[] args) {
		/* Reverse Words at Their Own Position in Java
		 * Input: Hello World Java is Fun
		 * Output: Fun is Java World Hello
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr a String:");
        String input = scanner.nextLine();
        String arr[] = input.split(" ");
        String arr2[] = new String [arr.length];
        StringBuffer  fs = new StringBuffer();
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            arr2[j]=arr[i];
            fs.append(arr2[j]+" ");
            j++;
        }
        System.out.println(fs.toString());

	}

}
