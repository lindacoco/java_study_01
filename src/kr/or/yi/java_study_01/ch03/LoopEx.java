package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
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
		int res=1;
		int i=0;
		while(res != 4){
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: guguwhile(); break;
			case 2: facwhile(sc);break;
			case 3 :fibowhile(sc);break;
			default :System.out.println("for 문 종료");
			} i++;
		}
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void ex_for(Scanner sc) {
		int res=1;
		for(int i=0;res!=4;i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: gugufor(); break;
			case 2: facfor(sc);break;
			case 3 :fibofor(sc);break;
			default :System.out.println("for 문 종료");
			}
		}
	}
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	
//		gugufor();
//		facfor(sc);
//		fibofor(sc);
		
//		guguwhile();
//		facwhile(sc);
//		fibowhile(sc);
		
		
	

	private static void fibowhile(Scanner sc) {
		System.out.println("입력해");
		int n = sc.nextInt();
		int a= 0;
		int b= 1;
		System.out.printf("%d %d ",a,b);
		
		int i = 1;
		while(i<n-1) {
			int c = a+b;
			System.out.print(c+" ");		
			i++;
			a=b;
			b=c;
		}
		
		
	}

	private static void facwhile(Scanner sc) {
		System.out.println("입력해");
		int n = sc.nextInt();
		System.out.printf("%d! = ",n);
		int i =1;
		int c=1;
		while(i<n+1) {
			System.out.printf("%d %s",i,i==n?"=":"*");
			c= c*i;
			i++;
		}System.out.println(c);		
	}

	private static void guguwhile() {
		
		int j = 1;	
		while (j < 10) {
			int i = 2;
			while (i < 10) {				
				System.out.printf("%d * %d= %2d ",i,j,j*i);
				i++;
			}System.out.println();
			 j++;
		}
	}

	private static void fibofor(Scanner sc) {
		System.out.println("정수입력");
		int n=sc.nextInt();
		int a= 0;
		int b= 1;
		
		System.out.printf("%d %d  ",a,b);
		for(int i=1; i<n-1; i++) {
			int c= a+b;			
			System.out.print(c+" ");
			a= b;
			b= c;
		}
		
	}

	private static void facfor(Scanner sc) {
		System.out.println("정수입력");
		int n=sc.nextInt();
		System.out.printf("%d! =",n);
		int res=1;
		for(int i=1; i<n+1; i++ ) {
			System.out.printf("%d %s",i,n==i?"=":"*");
			res= res*i;
		} System.out.println(res);
		
	}

	private static void gugufor() {
		
		for(int j=2; j<10; j++) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %2d ", j,i,j*i);
			System.out.println();
		}System.out.println();
		}
	}

}
