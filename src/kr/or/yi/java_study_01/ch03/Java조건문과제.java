package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Java조건문과제 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		upperCaseLowerCase(sc);
		 
//		Math.pow(b/100,2))		
//		char code = convert.ToChar(ascii);
		
		costs(sc);	
		
//		bmi(sc);
		
//		minimum(sc);
		
		discount(sc);
		
		
		sc.close();
	}


	private static void discount(Scanner sc) {
		for (int a = 1; a < 5; a++) {
			System.out.println("수량을 입력하시오");
			int i = sc.nextInt();
			int sum = i * 100;

			if (i >= 100) {
				System.out.printf("원래가격 %d원이지만 20%%할인하여 %1.0f원%n", sum, sum * 0.8);
			}else if (i >= 20) {
				System.out.printf("원래가격 %d원이지만 15%%할인하여 %1.0f원%n", sum, sum * 0.85);
			}else if (i >= 10) {
				System.out.printf("원래가격 %d원이지만 10%%할인하여 %1.0f원%n", sum, sum * 0.9);
			}else {
				System.out.printf("가격은 %d원입니다",sum);
			}

		}
	}


	private static void minimum(Scanner sc) {
		for(int i =0; i<6 ; i++) {
		System.out.println("3개의 정수를 입력하시오. 띄어쓰기로 구분");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
			if (a > b) {
				if (a > c) {
					if (b > c) {
						System.out.println(c);
					}else {
						System.out.println(b);
					}
				}
			} else if (b > a) {
				if (b > c) {
					if (a > c) {
						System.out.println(c);
					}else {
						System.out.println(a);
					}
				}
			} 
			if (c > b) {
				if (c > a) {
					if (b > a) {
						System.out.println(a);
					}else {
						System.out.println(b);	
					}
				}
		}
		}
	}


	private static void bmi(Scanner sc) {
		for (int i =0; i<5; i++) {
			System.out.println("체중과 신장을 입력하시오");
			double a = sc.nextInt();
			double b = sc.nextInt();
			double z = (a / ((b / 100) * (b / 100)));
			System.out.printf("%.1f%n", z);

			System.out.println("20대 or 30대 ?");
			String s = sc.next();
			if (s.equals("20대")) {
				if (z < 17.9) {
					System.out.println("저체중");
				} else if (z >= 18 && z <= 23) {
					System.out.println("표준체중");
				} else if (z >= 24 && z <= 30) {
					System.out.println("과체중");
				} else {
					System.out.println("비만");
				}
			} else if (s.equals("30대")) {
				if (z < 18.4) {
					System.out.println("저체중");
				} else if (z >= 18.5 && z <= 24) {
					System.out.println("표준체중");
				} else if (z >= 25 && z <= 30) {
					System.out.println("과체중");
				} else {
					System.out.println("비만");
				}
			}
		
		}
	}
	

	private static void costs(Scanner sc) {
		for(int i=0; i<3; i++) {
		System.out.println("자유이용권  or 입장권?");
		String a = sc.next();
		System.out.println("나이를 입력하시오. 대인? 소인?(3~12세, 65세이상)");
		int b =sc.nextInt();
		System.out.println("주간? 야간?(9~24로입력)");
		int c =sc.nextInt();
		String 자유이용권 = null ;
		String 입장권 =null ;
		String 주간 =null;
		String 야간 =null;
		String 대인 =null ;
		String 소인 =null ;
		if (a.equals("자유이용권")) {
			if (b<=2) {
				System.out.println("입장무료");
			}
				else if ((b >= 13) && (b < 65)) { // 대인이고
					if ((c >= 9) && (c <= 16)) { // 주간이면
						System.out.println("34000원");
					} else { // 야간이면
						System.out.println("29000원");
					}
				} else if ((c >= 9) && (c <= 16)) { // 대인이 아니고 주간이면
					System.out.println("25000원");
				} else {
					System.out.println("21000원"); // 야간이면
				}
			} else if (a.contentEquals("입장권")) { // 이용권이면
				if (b <= 2) {
					System.out.println("입장무료");
				} else if ((b >= 13) && (b < 65)) { // 대인이고
					if ((c >= 9) && (c <= 16)) {// 주간이면
						System.out.println("27000원");
					} else { // 야간이면
						System.out.println("23000원");
					}
				} else if ((c >= 9) && (c <= 16)) { // 대인이 아니고 주간이면
					System.out.println("20000원");
				} else { // 대인아니고 야간이면
					System.out.println("17000원");
				}
			}
		}
	}

	private static void upperCaseLowerCase(Scanner sc) {
		for(int u =0; u<5; u++) {
         System.out.println("문자를 입력하시오 ");
         char i = sc.next().charAt(0);
		 int j = i;
		 if((j >=65) && (j <=90)) {
			 System.out.println((char)(j+32));
		 }else if((j >=97) && (j <=122)){
			 System.out.println("대문자를 입력하시오");
		 }else {
			 System.out.println("소문자 혹은 대문자를 입력하시오");
		 }
		}
	}

}
