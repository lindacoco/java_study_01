package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_12_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		double a =sc.nextInt();
		String z =sc.next();
		double b =sc.nextInt();
		
		
		switch (z) {
		case "+" :
			System.out.print(a);
			System.out.print(z);
			System.out.print(b);
			System.out.print("의 계산 결과는"+(a+b));
			break;
		case "-" :
			System.out.print(a);
			System.out.print(z);
			System.out.print(b);
			System.out.print("의 계산 결과는"+(a-b));
			break;
		case "/" :
			    if(b==0) {
			    	System.out.println("0으로 나눌 수 없습니다.");
			    	break;
			    }else {
			    	System.out.print(a);
					System.out.print(z);
					System.out.print(b);
					System.out.print("의 계산 결과는"+(a/b));	
					break;
			    }				
		case "*" :
			System.out.print(a);
			System.out.print(z);
			System.out.print(b);
			System.out.print("의 계산 결과는"+(a*b));
			break;
		}
		sc.close();

	}

}
