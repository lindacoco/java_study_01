package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        double xx =sc.nextInt();
        double yy =sc.nextInt();
        double z = sc.nextDouble();
        System.out.print("점 입력>>");
        double x = sc.nextInt();
        double y = sc.nextInt();
        
        if(((x >=(xx-z)) && (x <=xx)) && ((y >yy) && (y <= (yy+z)))) {
        	System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",x,y);
        }else if(((x >=(xx-z)) && (x <=xx)) && ((y >(yy-z)) && (y <= yy))) {
        	System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",x,y);
        }else if(((x >=xx) && (x <=(xx+z))) && ((y >(yy-z)) && (y <= yy))) {
        	System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",x,y);
        }else if(((x >=xx) && (x <=(xx+z))) && ((y <(yy+z)) && (y >= yy))) {
        	System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",x,y);
        }else
            System.out.println("잉");
        sc.close();
	}
  
}
