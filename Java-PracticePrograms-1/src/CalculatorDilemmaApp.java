import java.util.Scanner;

public class CalculatorDilemmaApp {

	public static void main(String[] args) {
		char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();
    
 // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);
    

    
    CalculatorDilemma C1= new CalculatorDilemma();
    C1.calculatorDilemma(number1,number2,operator);


	}

}