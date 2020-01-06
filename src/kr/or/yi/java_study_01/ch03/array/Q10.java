package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		int [][] intArr = new int[4][4];
		Random rd = new Random();
		int cnt = 0;
		int a = 0;
		int b = 0;
		for(int i=0; i<10; i++) {
			a = rd.nextInt(4);
			b = rd.nextInt(4);
			intArr[a][b] = rd.nextInt(10)+1;
		}
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr.length;j++) {
				if(intArr[i][j]==0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		while(cnt>6) {
			a = rd.nextInt(4);
			b = rd.nextInt(4);
			if(intArr[a][b]==0) {
				intArr[a][b] = rd.nextInt(10)+1;
				cnt--;
			}
		}
		for(int i =0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length;j++) {
				System.out.printf("%3d",intArr[i][j]);
			}
			System.out.println();
		}
	}

}
