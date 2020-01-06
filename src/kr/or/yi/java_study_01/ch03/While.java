package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class While {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			

	
//		gugudanwhile(3);
//		gugudanfullwhile(sc);
		
//		fac(5);
//		fibowhile(10);
		
//	 exam3_2while(sc);
//	 exam3_2for(sc);
//	 exam3_2fortc(sc);	
		
//		for(int i =0; i<10; i++) {
//			System.out.print(i);
//		}

		
//		int i=0;
//		while(i<10) {
//			System.out.print(i);
//			i++;
//		}
//		
//		ggu();
		fac1(5);
	 sc.close();
	
	}


	private static void fac1(int n) {
        int a=0;
        int b=1;
		System.out.printf("%d %d",a,b);
		int res= a+b;
        for(int i=1; i<n-1; i++);
           
		
	}


	private static void ggu() {
     for(int j=2; j<10; j++) {
     for(int i = 1; i<10; i++) {
    	 System.out.printf("%d * %d = %2d %n",j,i,i*j);
    	 
     }System.out.println();
     }	
	}


	private static void fibowhile(int n) {
		int a = 0;
		int b = 1;
		System.out.printf("%d %d ",a,b);
//		
//		for(int i=1; i<n-1; i++) {
//			int res= a+b;
//			System.out.print(res+" ");
//			a =b;
//			b =res;
//		}
		int i=1;
		while(i<n-1) {
			int res= a+b;
			System.out.print(res+" ");
			a =b;
			b =res;
			i++;
		}
	}

	private static void fac(int n) {
//		int res=1;
//		System.out.print(n + "!= ");
//		for(int i =1; i<n+1; i++) {
//			System.out.printf("%d %s",i,i==n?"=":"* ");
//			res = res*i;
//		}System.out.print(res);
		
		int res=1;
		int i = 1;
		System.out.print(n + "!= ");
		while(i<n+1) {
			System.out.printf("%d %s",i,i==n?"=":"* ");
			res = res*i;
			i++;			
		}System.out.println(res);
		
	}

	private static void gugudanfullwhile(Scanner sc) {
		// 2*1 3*1 4*1 5*1 ..
//		for(int j=2; j<10; j++) {
		
//		for(int i =1; i<10; i++) {
//			for(int j= 2; j<10; j++) {
//				System.out.printf("%d * %d =%2d  ",j,i,j*i);
//			}System.out.println();
//		}
		
//		int i=1;
//		int n=2;
//		while (i < 10) {
//			System.out.printf("%d * %d =%2d  ", n, i, n * i);
//			n++;
//			if(n>9) {
//				n = 2;
//				i++;
//				System.out.println();
//			}
//		}
//		
       int i=1;
       while (i <10) {
    	   int 단=2; 
       while (단 <10) {
    	   System.out.printf("%d * %d =%2d  ", 단, i, 단 * i);
    	   단++;
         }System.out.println();        
         i++;
       }	
	}
		
//			System.out.printf("%d * %d= %2d ",j,i,j*i);

		  
//	    }
//		int n =2;
//		int i =1;
//		while (i<10) {
//			System.out.println();
//		}
//		
		

	private static void gugudanwhile(int n) {
		// 2단 
		System.out.println("입력하세요");
		int i =1;
		while(i<10) {
			System.out.printf("%d*%d= %d %n",n,i,n*i);
			 i++;
		}
		
	}

	private static void exam3_2fortc(Scanner sc) {
		int sum=0;
		int c;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		int n = sc.nextInt();
		for(c=0; n!=-1; c++) {
			sum = sum+n;
			n=sc.nextInt();
		}System.out.printf("입력된 정수의 개수는%d 이며 평균은 %.1f입니다",c,(double)sum/c);	
		
	}

	private static void exam3_2for(Scanner sc) {
		int c =0;
		int sum=0;
		
		for(int n=sc.nextInt(); n !=-1; n=sc.nextInt()) {
			     sum= sum+ n;
			     c++;
			     
		}System.out.printf("입력된 정수의 개수는%d 이며 평균은 %.1f입니다",c,(double)sum/c);			
	}

	
	private static void exam3_2while(Scanner sc) {
		int c =0;
		int sum=0;
		
		System.out.println("입력하세요");
		int n=sc.nextInt();
		while(n != -1) {
			sum= sum+n;
			c++;
			System.out.println("입력하세요");
			n=sc.nextInt();
		}
		System.out.printf("입력된 정수의 개수는 %d이며 평균은 %d입니다",n,(sum/c));
		
	}

}
