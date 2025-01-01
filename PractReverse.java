package assignment;

import java.util.Scanner;

//Write a program that reverses a given number using a while loop.


public class PractReverse {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reversal = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = reversal.nextInt();
		int i = 0;
		while(num !=0) {
			
		    i = i *10 + num%10;
		    num = num/10;

		}
	    System.out.println("The reverse of a number is" + " " + i);
	    reversal.close();
	}

}
