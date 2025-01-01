package assignment;

import java.util.Scanner;

public class PractArAvg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		
		
		int [] array = new int[size];
		for(int i=0; i< size; i++) {
			System.out.println("Enter the array number" + (i+1) + ":");
			array[i] = scanner.nextInt();
		}
		int sum=0;
		for(int i=0;i <array.length;i++) {
		    sum += array[i];
		  
		}
		double avg = (double) (sum)/size;
		System.out.println(avg);
		
		scanner.close();
	}

}
