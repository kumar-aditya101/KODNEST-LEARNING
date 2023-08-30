import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		Checker check = new Checker();
		boolean res = check.isArmstrong(num);
		
		if(res==true)  
		{  
		System.out.print("Given number is Armstrong ");  
		}  
		else   
		{  
		System.out.print("Given number is Not Armstrong ");  
		}  
		

	}


}
