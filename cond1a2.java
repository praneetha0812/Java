package assignment;

import java.util.Scanner;

public class cond1a2 {
	public static void main(String[] args) {
		Scanner day = new Scanner(System.in);
		System.out.println("What day is today?");
		String weekday = day.nextLine();
		if(weekday.equalsIgnoreCase("Sunday")  || weekday.equalsIgnoreCase("Saturday")) {
			System.out.println("Yay it's weekend");
		}
		else
			System.out.println("It's a regular day");
		day.close();
		
	}


}
