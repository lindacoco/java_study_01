package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEX복습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while(res<3) {
			if (res==1) {
				System.out.println("for");
				ex_for(sc);
			}else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}
		System.out.println("프로그램 종료.");
		
		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res = 1;
		int i=0;
		while(i<4) {	
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(i) {
			case 1: gugudan_while(); break;
			case 2: factorial_while();break;
			case 3: fibonacii_while(); break;
			default : System.out.println("for 문 종료");
			}
		}
		
		System.out.println(res);
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	

	private static void ex_for(Scanner sc) {
		int res=1;
		for(int i=0;res!=4;i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: gugudan_for(); break;
			case 2: factorail_for();break;
			case 3 :fibonacii_for();break;
			default :System.out.println("for 문 종료");
			}
		}
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_for() {
		System.out.println("fibonacii_for()");
	}

	private static void factorail_for() {
		System.out.println("factorail_for()");
		
	}

	private static void gugudan_for() {
		System.out.println("gugudan_for()");	
		
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
                    System.out.printf("%d * %d = %d ", i, j, j*i);
			}System.out.println();
		}
	}

	private static void gugudan_while() {
		// TODO Auto-generated method stub
		
	}

	private static void fibonacii_while() {
		// TODO Auto-generated method stub
		
	}

	private static void factorial_while() {
		// TODO Auto-generated method stub
		
	}
}
