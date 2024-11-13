public class largestArray {
    public static void main(String arg[])
    {
        int[] large  = {12, 14, 24, 23,45,30};
        int l = large[0];
        for(int i=1; i < large.length; i++){
            if (large[i] > l){
               l = large[i];
            }
        }
        System.out.println("The largest number in the array is:" + l);
        System.out.println("The length of the array is:" + large.length);

    }



}

