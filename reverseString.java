public class reverseString {
    public static void main(String[] args){
        String a = "Clear";
        String b = " ";
        for (int i = a.length()-1; i >= 0; i--){
            b += a.charAt(i);
        }
        System.out.println("The reversed string of" + a + "is :" + b);
    }
}
