package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
           System.out.print("첫번째 원의 중심과 반지름 입력>>");
           int x1 =sc.nextInt();
           int y1 =sc.nextInt();
           int z1 =sc.nextInt();
           System.out.print("두번째 원의 중심과 반지름 입력>>");
           int x2 =sc.nextInt();
           int y2 =sc.nextInt();
           int z2 =sc.nextInt();
		
          int sum = z1 +z2;
          double xy = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
           
          if (xy <sum) {
        	  System.out.println("두 원이 겹친다");
          }else {
        	  System.out.println("안겹친다");
          }
           
		sc.close();
	}

}
