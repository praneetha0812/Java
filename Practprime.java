package assignment;

import java.util.Scanner;

public class Practprime {
public static void main(String[] args) {
	Scanner primeNum = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = primeNum.nextInt();
	if (num >0) {
	int count  = 0;
	for(int i=1;i<=num;i++) {
	
		if(num%i == 0) {
			count ++;
			}
	}
		if(count ==2) {
			System.out.printf("Given number %d is a prime number", num);
		}
		else {
			
			System.out.printf("The number %d is not a prime number", num);
	}
	}
	else
		System.out.println("No fact");
	primeNum.close();
}
}
