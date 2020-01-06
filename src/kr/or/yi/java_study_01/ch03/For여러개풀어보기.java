package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class For여러개풀어보기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		fac(sc);
//		facc(sc);
		
//		facc2(20);
						
//		faccccc(5);
//		faccccc2(5);
		
		pibo(15);
		sc.close();
 }

	private static void pibo(int n) {
		int f1 = 0;
		int f2 = 1;
		System.out.print(f1+" "+f2 +"  ");
        int f3=0;
		for (int i =0; i<n-2; i++) {
			f3=f1+f2;
			System.out.print(f3 +" ");
			f1=f2;
			f2=f3;			
		}				
	}

	private static void faccccc2(int d) {
		int res=1;
		System.out.print(d +"!= ");
		for(int i=d; i>0; i--) {
			res = res *i;
			System.out.printf("%d %s",i ,i==1?"=":"* ");
		}System.out.println(res);		
	}

	private static void faccccc(int n) {
		int res=1;
		System.out.print(n+"!=");
		for(int i =1; i<n+1; i++) {
			res= res*i;
			System.out.print(i + (i==n?"=":"*"));			
		}System.out.println(res);		
	}

	private static void facc2(int cnt) {
		long res = 1;
		System.out.print(cnt + "!= ");
		for (int i = cnt; i > 0 ; i--)		{
			res = res * i;
			System.out.printf("%d %s ",i,i==1?"=":"*");
		}
		System.out.printf("%d ",res);		
	}

	private static void facc(Scanner sc) {
		System.out.println("숫자입력하시오");
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		int cnt = sc.nextInt();
		int res = 1;
		System.out.print(cnt + "!= ");
		for (int i = cnt; i > 0 ; i--)		{
			res = res * i;
			System.out.printf("%d %s ",i,i==1?"=":"*");
		}
		System.out.printf("%d ",res);		
	}

	private static void fac(Scanner sc) {
		System.out.println("숫자입력하시오");
		int cnt = sc.nextInt();
		int res = 1;
		System.out.print(cnt + "!= ");
		for (int i = 1; i < cnt + 1; i++) {
			res = res * i;
			System.out.printf("%d %s ",i,i==cnt?"=":"*");
		}
		System.out.printf("%d",res);
	}
}
