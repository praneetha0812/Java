package assignment;

import java.util.Scanner;

public class SwitchArith {
	public static void main(String[] args) {
		Scanner operation = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber = operation.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = operation.nextInt();
		System.out.println("Enter the desired arithematic operation");
		char arithmeticOperation = operation.next().charAt(0);

		switch(arithmeticOperation) {
		case '+':
			System.out.println("The sum of two number is" + " "+ (firstNumber + secondNumber));
			break;
		case '-':
			System.out.println("The difference of two number is" + " "+ (firstNumber - secondNumber));
			break;
		case '*':
			System.out.println("The product of two number is" + " "+ (firstNumber * secondNumber));
			break;
		case '/':
			if (secondNumber ==0 ) {
				System.out.println("indeterminate");
			}
			else
				System.out.println("The quotient of two number is" + " "+ (firstNumber / secondNumber));
			break;
		case '%':
			if (secondNumber ==0 ) {
				System.out.println("indeterminate");
			}
			else
				System.out.println("The reminder of two number is" +" "+ (firstNumber % secondNumber));
			break;
		default:
			System.out.println("Error: Invalid operation");
		}
		operation.close();

	}

}
