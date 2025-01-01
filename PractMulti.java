package assignment;

import java.util.Scanner;

public class PractMulti {
	//Implement a program that prints a multiplication table for a given number using a for loop.
	public static void main(String[] args) {
		Scanner multiply = new Scanner(System.in);
		System.out.println("enter the number");
		int numb = multiply.nextInt();
	
		System.out.printf("Multplication table of %d, till 20 is:", numb);
		for(int i=1;i<=20;i++) {
			 System.out.printf("%d x %d = %d\n", numb, i, numb * i);
		}
		multiply.close();
	}

}
