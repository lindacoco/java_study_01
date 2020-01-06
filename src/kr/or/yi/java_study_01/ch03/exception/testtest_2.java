package kr.or.yi.java_study_01.ch03.exception;

public class testtest_2 {

	public static void main(String[] args) {
		
			
			
		int k =0;
		int [][] arr = new int [4][];
		arr[0]= new int [4];
		arr[1]= new int [1];
		arr[2]= new int [1];
		arr[3]= new int [4];
		
		for(int j = 0; j<arr.length; j++) {
        		 arr[0][j] = k++;
		}
		arr[1][0] = k++;
		arr[2][0] = k++;
		for(int m=0; m<arr.length;m++) {
			arr[3][m] = k++;
		}
		
		for(int u=0; u<arr.length;u++) {
			for(int n=0; n<arr[u].length; n++) {
				System.out.print(arr[u][n]+" ");
			}System.out.println();
		}
	
		
		
		
		
		
	}

}
