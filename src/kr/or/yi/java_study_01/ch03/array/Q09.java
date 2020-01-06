package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class Q09 {

	public static void main(String[] args) {
//		Q9(); 
		
	
		  int [][] four = new int [4][4];
		  System.out.println(Arrays.deepToString(four)); prnArray(four); int j =
		  (int)(Math.random()*2+1); for(int i =0; i<four.length; i++) {
		  four[i][j]=(int)(Math.random()*10+1);
		  System.out.printf("%3d",four[i][j]); }System.out.println();
	

	 Random rnd = new Random(1234567);
	 int row;
	 int col;
	 int count = 0;
	 for(int i =0; count<10; i++) {
         row = rnd.nextInt(4);
         col = rnd.nextInt(4);
         if(four[row][col] !=0) { //이미 해당위치에 값이 할당되어있음
        	 continue;
         }else {
        	 four[row][col]=rnd.nextInt(10)+1;
        	 count++;
         }
		 System.out.println(rnd.nextInt(16)); //0~15범위
		 System.out.println(rnd.nextInt(10)+1);//1~10까지
	 }
	// 1에서 10까지의 정수 10개만 랜덤하게 임의의 위치(0~15)에 삽입	
	 
	 System.out.print("count = "+count);
	}

	private static void prnArray(int[][] four) {
		for(int[]arr:four) {
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void Q9() {
		int [][] arr = new int[4][4];
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
			arr[i][j]=(int)(Math.random()*10+1);
			System.out.printf("%3d",arr[i][j]);
		   }
			System.out.println();
		}
	}

}
