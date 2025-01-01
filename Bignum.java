package assignment;

import java.util.Scanner;

public class Bignum {

	public static void main(String[] args) {
		Scanner comp = new Scanner(System.in);
		System.out.println("Enter your first number");
		int i = comp.nextInt();
		System.out.println("Enter your second number");
		int j = comp.nextInt();
		System.out.println("Enter your third number");

		int k = comp.nextInt();
		if(i >=j) {
			if(i>=k)
				System.out.print(i);
			else 
				System.out.println(k);
		}
		else{
			if(j>k)
				System.out.print(j);
			else 
				System.out.println(k);
		}

	}
}

