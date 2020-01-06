package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형을 구성하는 두 점 (x1,y1),(x2,y2)를 입력하시오");
		int x1 = sc.nextInt();
	    int y1 = sc.nextInt();
	    int x2 = sc.nextInt();
	    int y2 = sc.nextInt();
		if ((x1 >= 100) && (x1 <=200)) {
			System.out.println("충돌합니다.");	
		}else if ((y1 >= 100) && (y1 <=200)) {
			System.out.println("충돌합니다.");	
		}else if ((x2 >= 100) && (x2 <=200)) {
			System.out.println("충돌합니다.");	
		}else if ((y2 >= 100) && (y2 <=200)) {
			System.out.println("충돌합니다.");	
		}else if ((x1 >= 0) && (y1 <=99) && (x2 >=201) && (y2 >= 201)){
			System.out.println("충돌합니다.");	
		}
		else {
			System.out.println("충돌하지 않습니다");
		}
		sc.close();
		
	}

}
