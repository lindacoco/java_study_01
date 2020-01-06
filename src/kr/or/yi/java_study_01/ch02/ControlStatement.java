package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
//      multipletree(sc);
//      ternaryTree(sc);
//        nestedIf(sc);       
//       grade(sc);
       nestedIfTeachar(sc);
       sc.close();
	}

	private static void nestedIfTeachar(Scanner sc) {
		// 점수화 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야한다.
		//1.점수와 학년을 입력받기.
		//2. 60점 이상이면 합격
		//3. 점수가 60점 미만이면 불합격.
		//4. 단, 합격자중에서 4학년일경우  70점 이상이어야 합격. 
	  System.out.printf("점수를 입력(0~100)\n학년을 입력하세요(1~4) 예) 90 3 >> "); 	
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
//		System.out.println(jumsu + " : " + year);
		if (jumsu >=60) {
			if (year == 4 ) {
				if (jumsu >=70) {
					System.out.println("합격"); // 4학년일 경우
				}else {
					System.out.println("불합격");	
				}
			}else {
				System.out.println("합격"); //그외 학년인경우  
			}
		}else {
			System.out.println("불합격");
		}
	}	

	private static void nestedIf(Scanner sc) {
		/*
		 * System.out.println("점수를 입력하세요(0~100):"); int score = sc.nextInt();
		 * System.out.println("학년을 입력하세요 (1~4):"); int year = sc.nextInt();
		 */
		
		 System.out.print("점수를 입력(0~100)\n학년을 입력하세요(1~4) 예) 90 3 >> ");
		 int score = sc.nextInt();
		 int year = sc.nextInt();		
		 if(score >= 60) {
			 
			 if (year != 4) {
				 System.out.println("합격!");
			 }else if(score >=70) {
				 System.out.println("합격!");
			 }else {
				 System.out.println("불합격!");
			 }
		 }
		else 
			System.out.println("불합격!");
		 
	}

	private static void grade(Scanner sc) {
		char grade; 
		System.out.println("점수를 입력하세요(0~99):");
		int score = sc.nextInt();
		if(score>=90) {
			grade= 'A';
		}else if(score>=80) {
			grade= 'B';
		}else if(score>=70) {
			grade= 'C';
		}else if(score>=60) {
			grade= 'D'; 
		}else {
			grade = 'F';
		}
		System.out.println("학점은"+ grade + "입니다");
	}

	private static void ternaryTree(Scanner sc) {
		//3항연산자를 이용하여 multipletree와 같은 결과가 출력되도록 
		System.out.println("수를 입력하시오:");
		int number = sc.nextInt();
		System.out.println((number%3 == 0)? "3의배수입니다" :"3의배수가 아닙니다");
		
//      String res = number%3 ==0? "3의배수입니다" :"3의배수가 아닙니다";
//		System.out.println(res);   -- 선생님꺼
//      String res = number%3 ==0? "입니다" :"아닙니다";
//		System.out.println("3의배수" + res);   -- 선생님꺼
	}

	private static void multipletree(Scanner sc) {
		System.out.println("수를 입력하시오:");
		int number = sc.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("3의 배수입니다");
			
		}else {
			
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}

}
