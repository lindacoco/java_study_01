package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		nestedTea(sc);
//		nestedIf(sc);
		
		
//      ternarvTree(sc);
		
		
//		terT(sc);
		
//		ifElseSwitch(sc);
		
		
		getGrade(sc);
		
		sc.close();

	}

	private static void getGrade(Scanner sc) {
		System.out.println("점수를입력하세요 : ");
		char grade;
		int score = sc.nextInt();
		if(score>=90)
		{grade = 'A';}
		else if(score>=80)
		{grade = 'B';}
		else if(score>=70)
		{grade = 'C';}
		else if(score>=60)
		{grade = 'D';}
		else {grade = 'F';}
		System.out.println("학점은"+grade +"입니다");
	}

	private static void ifElseSwitch(Scanner sc) {
		System.out.println("어떤커피를 드릴까요");
		String order =sc.next();
		int price = 0;
		switch(order) {
		case "에스프레소" :
		case "카푸치노" :
			price = 3500;
			break;
		case "아메리카노" :
			price = 3000;
			break;
		default: System.out.println("메뉴에없음");
		
		
		}
		if(price !=0) System.out.println(order+ "는" + price + "원 입니다.");
		
	}

	private static void terT(Scanner sc) {
		System.out.println("숫자를입력하세요");
		int number = sc.nextInt();
		System.out.println((number%3 ==0)? "3의배수입니다": "3의배수가 아닙니다");
		
	}

	private static void ternarvTree(Scanner sc) {
		System.out.println("숫자를입력하시오: ");
		int number = sc.nextInt();
		if(number % 3 ==0) {
			System.out.println("3의배수입니다");
		}else {
			System.out.println("3의배수가 아닙니다.");
		}
	}

	private static void nestedIf(Scanner sc) {
		System.out.printf("점수와 학년을 입력하세요 %n");
		int score = sc.nextInt();
		int year = sc.nextInt();
		if (score>=60) {
			if (year != 4) {
				System.out.println("합격");
			}else if (score >=70){
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
	
		
	}

	private static void nestedTea(Scanner sc) {
		System.out.printf("점수를 입력하세요 학년을 입력하세요(1~4) 예 90 1 %n");
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
		if (jumsu >=60) {
			if(year ==4) {
				if (jumsu >= 70) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
		        }
			}else {
		    System.out.println("합격");
		}
			
		}
		else {
			System.out.println("불합격");
		}
			
			
			
			
				
				
	}

}
