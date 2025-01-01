package assignment;



//Create a program that finds the factorial of a given number using a do-while loop

public class PractFact {
public static void main(String[] args) {
	int n = 0;
	int i=1;
	if (n==0)
			System.out.println("The factorial is 1");
	else
		do {
			i = i*n;
			n -= 1;
			
		}
		//while(n>0 && i<=n);
		while(n >=1);
		System.out.println(i);
		
	
}
}
