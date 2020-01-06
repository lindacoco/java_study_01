package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("두 정수를 입력하시오. 공백으로 분리 >>");
		Scanner sc = new Scanner(System.in); /* ctl shif o 자동import */
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = sum(a,b);
		System.out.printf("두 수 (%d, %d) 의 합은 %d%n" ,a, b, res);
		
		

		 int resa = sub(a,b); //두 수의 차
		  System.out.printf("두 수 (%d, %d) 의  차는 %d%n" ,a, b, resa);
		 int resb = mul(a,b); //두 수의 곱
		  System.out.printf("두 수 (%d, %d) 의 곱은 %d%n" ,a, b, resb);
		 float resc = div(a,b); //두 수의 몫
		  System.out.printf("두 수 (%d, %d) 의 몫은 %.2f%n" ,a, b, resc);
		
		sc.close();

	}

	private static float div(float a, float b) {
		return a / b;
	}

	private static int mul(int a, int b) {
		return a * b;
	}

	private static int sub(int a, int b) {
		return a-b;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

}
