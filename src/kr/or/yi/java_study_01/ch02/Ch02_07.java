package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		   int a =sc.nextInt();
		   int b =sc.nextInt();
		
		 if(a >= 100) {
			 if (a <=200) {
				 if (b >=100) {
					 if (b <=200) {
						 System.out.printf("(%d,%d)는 사각형 안에 있습니다.",a,b);
					 }
				 }
			 }
		 }
					
		sc.close();
	}

}
