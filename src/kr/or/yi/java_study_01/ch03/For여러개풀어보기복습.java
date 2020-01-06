package kr.or.yi.java_study_01.ch03;

public class For여러개풀어보기복습 {

	public static void main(String[] args) {
		
//	fact1(5);	
//	fact2(5);	
		
//		pibo1(10);
		gugudan_for();	
//	fac(5);
//	facc(5);
//  pibo(10);

	}

	
	private static void gugudan_for() {
		System.out.println("gugudan_for()");	
		
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
                    System.out.printf("%d * %d = %2d ", i, j, j*i);
			}System.out.println();
		}
	}
	private static void pibo1(int n) {
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

	private static void fact2(int n) {
		// 5! = 1 * 2 * 3 * 4 * 5 = 120
		int res=1;
		System.out.print(n + "!= ");
		for(int i =1; i<n+1; i++) {
			System.out.printf("%d %s",i,i==n?"=":"* ");
			res = res*i;
		}System.out.print(res);
		
	}

	private static void fact1(int n) {
		// 5! = 5*4*3*2*1 = 120
		System.out.print(n + "!= ");
		int res = 1;
		for(int i =n; i>0; i--) {
			System.out.printf("%d %s",i,i==1?"=":"* ");
			res= res* i;
		}System.out.println(res);
	}

	private static void pibo(int i) {
		int a =0;
		int b =1;
		
		System.out.printf("%d %d  ",a,b);
		for(int j =0; j<i-2; j++) {
			int res= a+b;
			System.out.print(res+"  ");
			a= b;
			b= res;
		}
		
	}

	private static void facc(int i) {
		System.out.print(i + "!= ");
		int res=1;
		for(int j=5; j>0; j--) {
			System.out.printf("%d %s",j,j==1?"=":"* ");
			res = res*j;
		}System.out.println(res);
	}

	private static void fac(int i) {
		
		System.out.print(i + "!= ");
		int res=1;
		for(int j =1; j<i+1; j++) {
			System.out.printf("%d %s",j,i==j?"=":"* ");
			res=res*j;
		}System.out.println(res);		
	}
}
