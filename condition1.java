package assignment;

import java.util.Scanner;

public class condition1 {
  public static void main(String[] args) {
	Scanner state = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = state.nextInt();
	if (number %2 == 0)
		System.out.println("Given number is an even number");
	else
		System.out.println("The entered number is an odd number");
	state.close();
	
}
}
