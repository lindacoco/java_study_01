package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
		System.out.println("두자리수 정수 입력(10~99)>>");
		int t =sc.nextInt();
		int a = t/10;
		int b = t%10;
		
		if (a == b) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");		
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		}
	
		sc.close();
	}

}
