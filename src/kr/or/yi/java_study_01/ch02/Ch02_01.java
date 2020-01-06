package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력하세요(단위 원)>>");
        int price = sc.nextInt();
	    float dollar = price /1100;
        System.out.printf("%d원은 $%.1f입니다.",price,dollar);
		
		sc.close();
	}

}

