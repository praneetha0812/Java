public class SumArrays {
    public static void main(String args[]){
        int[] a = {12, 1, 2, 46};
        int sum = a[0];
        for (int i=1; i<a.length; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
