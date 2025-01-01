package assignment;

import java.util.Scanner;

//Write a program that prints a pattern of asterisks in the shape of a right-angled triangle using nested for loops.
public class PractPattern {
	public static void main(String[] args) {
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter desired character for right angle traingle");
		char a = pattern.next().charAt(0);
		System.out.println("Enter the number");
		int numb = pattern.nextInt();
		int i;
		int j;
		for(i = 1; i<=numb;i++) {
			for(j=1;j<=i; j++) {
	        System.out.print(a);
			}
            System.out.println();

		}
		pattern.close();
		
		
	}

}
