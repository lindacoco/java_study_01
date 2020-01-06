package kr.or.yi.java_study_01.ch03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		devideByZeroHandling(sc);
		
//		int dividend=5;
//		int divisor =1;
//		System.out.print("나뉨수를 입력하시오:");
//		dividend =sc.nextInt();
//		System.out.print("나눗수를 입력하시오:");
//		divisor =sc.nextInt();
//		System.out.printf("%d 를 %d로 나누면 몫은 %d 입니다",dividend, divisor, dividend/divisor);
//		System.out.println("계산완료");
		
//		exam01(dividend, divisor);
		
		try {
			int[] intArr = new int[5];
//			System.out.println(5/0);
//			int b = sc.nextInt();
//			intArr[5] = 10;
			int c = Integer.parseInt("a");
		} catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("예외발생");     //부모가 Exception e  근데 안좋은 방법 어떤 예외가 발생했는지 모름
		} catch(ArithmeticException d) {
			System.out.println("쥬글래");
		} catch(NumberFormatException e) {
			System.out.println("문자화된 숫자만 가능");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만가능");
		}
//		} catch(Exception e) {
//			System.out.println("위의 예외를 제외한 나머지 예외");
//			e.printStackTrace();
//		}
		
		
	sc.close();
		
	}
	private static void devideByZeroHandling(Scanner sc) {
		while(true) {
			System.out.print("나뉨수를 입력하시오:");
			int dividend =sc.nextInt();
			System.out.print("나눗수를 입력하시오:");
			int divisor =sc.nextInt();
			try {
				System.out.printf("%d 를 %d로 나누면 몫은 %d 입니다",dividend, divisor, dividend/divisor);
				break;  //정상적인 나누기 완료후 while벗어나기
			}
			catch(ArithmeticException e) {  //ArithmeticException예외 처리 코드
				System.out.printf(" %d / %d 예외발생 0으로 나눌 수 없음", dividend,divisor);
			}	  
		}
	}
	private static void exam01(int dividend, int divisor) {
		
		try{System.out.printf("%d 를 %d로 나누면 몫은 %d입니다",dividend, divisor, dividend/divisor);
		    System.out.println("계산완료");
		}catch(ArithmeticException e) {
		System.out.printf(" %d / %d 예외발생 0으로 나눌 수 없음", dividend,divisor);
	  
		}
		System.out.println("main() 수행완료 ~~!!");
	}
       
 }


