package assignment;

import java.util.Scanner;

public class Switch1a {
	public static void main(String[] args) {
		Scanner state = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = state.nextInt();
		switch(number%2) {
		case 0:
			System.out.printf("given number %d is even number", number);
			break;
		case 1:
			System.err.printf("given number %d is Odd number", number);
			break;
		}
		state.close();
		
	}

}
