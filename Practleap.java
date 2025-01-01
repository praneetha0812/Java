package assignment;

import java.util.Scanner;

public class Practleap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.print("Enter the year");
		int year = scanner.nextInt();
		if((year %4 ==0 && year% 100 != 0) || year%400 ==0){
			System.out.printf("The given year %d, is a leap year", year);
		}
		else
			System.out.printf("The give year %d, is not a leap year", year);
	}

}
