public class Demo {
    public static void main(String arg[])
    {
        int a = 3;
        int b= 5;
        int temp;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
