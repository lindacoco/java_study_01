package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task_01_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("이진수로 바꾸고자 하는 수를 입력하시오");
	     int num = sc.nextInt();
	     
	     int [] box = new int [8];
//	     System.out.print(Arrays.toString(box));
	     
	     for(int i =7; i>-1; i--) {
	    	 box[i]=num%2;
	    	 num= num/2;
	    	 
	    	 System.out.print(box[i]);
	     }//System.out.print(Arrays.toString(box));
	     
	
	}

}
