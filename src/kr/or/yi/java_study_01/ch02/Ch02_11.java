package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
		int month =sc.nextInt();
		
		
		if((month == 3)||(month == 4)||(month == 5)) {
			System.out.println("봄");
		}else if((month == 6)||(month == 7)||(month == 8)) {
			System.out.println("여름");
		}else if((month == 9)||(month == 10)||(month == 11)) {
			System.out.println("가을");
		}else if((month == 12)||(month == 1)||(month == 2)) {
			System.out.println("겨울");	
		} 
		sc.close();
	}
	

}
