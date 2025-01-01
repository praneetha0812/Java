package assignment;

import java.util.Scanner;

public class PractArSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {

			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		// Calculate sum and print running total
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			}

		System.out.println("Final sum: " + sum);
		scanner.close();

	}
}

