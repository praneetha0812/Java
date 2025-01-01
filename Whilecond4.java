package assignment;

public class Whilecond4 {
	public static void main(String[] args) {
		int i=40;
		int sum=0;
        while (i<=80) {
        	if(i%2 == 0) {
        	sum = sum+i;
        	}
        	i+=2;
        }
        System.out.println(sum);
	}

}
