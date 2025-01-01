package assignment;

public class PractArray {
	public static void main(String[] args) {

		int[][] arr = new int [3] [2];
		arr[0][0]=3;
		arr[0][1]=4;
		
		arr[1][0] = 9;
		arr[1][1]=2;
		
		arr[2][0]=8;
		arr[2][1]=6;
		for(int i=0;i<arr.length; i++) {
			int[] singleRow = arr[i];
			for(int j=0; j<singleRow.length; j++)
			{
			   System.out.print(singleRow[j] + " ");
			}
	        System.out.println(); 
		}
	}

}
