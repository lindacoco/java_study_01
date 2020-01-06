package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks_01 {

	public static void main(String[] args) {
		// 10진수를 2진수로 변환하기 
		Scanner sc = new Scanner(System.in);
     System.out.println("이진수로 바꾸고자 하는 수를 입력하시오");
     int num = sc.nextInt();
     int num2 = num;
     int [] box = new int [8];
//     System.out.print(Arrays.toString(box));
     int cnt = 0;
     for(int i =0;num2!=0; i++) {
    	 box[i]=num2%2;
    	 num2= num2/2;
    	 cnt++;
     }//System.out.print(Arrays.toString(box));
     
     for(int i=cnt-1; i>=0; i--) { 
    	 System.out.print(box[i]);
     }
     sc.close();
	}

}
 