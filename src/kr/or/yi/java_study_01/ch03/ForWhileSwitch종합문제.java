package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class ForWhileSwitch종합문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 입력하세요 1.for문 2.while 3.종료");
		int n = sc.nextInt();
		while(n <4) {
			if (n==1) {
				System.out.println("for문");
				System.out.println("번호를 입력하세요 1.gugudan 2.factorial 3.fibonacci 4.종료");
				int f = sc.nextInt();
				switch(f) {				
				  case 1: System.out.println("gugudan_for");
				      gugudan_for();
					break;
				  case 2: System.out.println("factorial_for");
				      factorial_for(sc);
					break;
				  case 3 : System.out.println("fibonacci_for");
				      fibonacci_for(sc);
					break;
				  case 4 : 
					break;
					  
				}System.out.println();

			}else if(n==2){
				System.out.println("while문");
				System.out.println("번호를 입력하세요 1.gugudan 2.factorial 3.fibonacci 4.종료");
				int f = sc.nextInt();
				switch(f) {				
				  case 1: System.out.println("gugudan_while");
				      gugudan_while();
					break;
				  case 2: System.out.println("factorial_while");
				      factorial_while(sc);
					break;
				  case 3 : System.out.println("fibonacci_while");
				      fibonacci_while(sc);
					break;
				  case 4 : 
					break;
				}
			}else {
				System.out.println("종료");
			}
		

	}
     sc.close();
	}

	private static void gugudan_while() {
		int i=1;
		while(i<10) {
			int 단 =2;
		   while (단 <10) {
			   System.out.printf("%d * %d =%2d  ", 단, i, 단 * i); 
		        단++;
		   }System.out.println();
		} i++;
	}

	private static void factorial_while(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void fibonacci_while(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void fibonacci_for(Scanner sc) {
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.printf("%d %d ",a,b);
		
		for(int i=1; i<n-1; i++) {
			int res= a+b;
			System.out.print(res+" ");
			a =b;
			b =res;
		}
		
	}

	private static void factorial_for(Scanner sc) {
		int n =sc.nextInt();
		int res=1;
		System.out.print(n + "!= ");
		for(int i =1; i<n+1; i++) {
			System.out.printf("%d %s",i,i==n?"=":"* ");
			res = res*i;
		}System.out.print(res);
				
	}

	private static void gugudan_for() {
		for(int j=2; j<10; j++) {
		     for(int i = 1; i<10; i++) {
		    	 System.out.printf("%d * %d = %2d %n",j,i,i*j);
		    	 
		     }System.out.println();
		     }	
		
	}
}
