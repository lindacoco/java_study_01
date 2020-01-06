package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner s = new Scanner(System.in);
	   System.out.print("점 (x,y)의 좌표를 입력하시오>>");
	   int a = s.nextInt();
	   int b = s.nextInt();
       if((a>=100) && (a <=200)) {
    	   if((b>=100) && (b <=200)){
    		   System.out.printf("(%d,%d)는 사각형 안에 있습니다.",a,b);
    	   }
       }
       
       s.close();
	}

}
