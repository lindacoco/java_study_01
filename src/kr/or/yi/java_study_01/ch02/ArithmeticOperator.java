package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
	  Scanner sc= new Scanner(System.in);	
      getHourMinuteSecond(sc);
	//  getPayCount(sc);  // 97870
 	// 오만원 1장 만원 4장 오천원 1장 천원2장 오백원 1개 백원3개 오십원 1개 십원2개
 
     sc.close();
     
     postfix();   
     prefix();	  
	 return;
	  
	}

	private static void prefix() {

		  int a = 10;
		  int b = ++a; //전위증감 a= 11 b=11 
		  System.out.printf("a= %d b=%d %n", a, b);
	}

	private static void postfix() {
		int a = 10;
		  int b = a++;  //후위증감  a= 11 b=10 
		  System.out.printf("a= %d b=%d %n", a, b);
	}
   // 정의만 한 것 위에서 주석처리 빼야 호출 
	private static void getPayCount(Scanner sc) {
		System.out.print("금액을 입력하시오");
		int cost = sc.nextInt();
		int 오만원 = cost / 50000; // 1
		int 만원 = (cost% 50000)/10000; // 47870 / 10000 -4장
		int 오천원 = ((cost%50000)%10000)/5000; // 47800 / 7800 -1장
        int 천원 = (((cost%50000)%10000)%5000)/1000;  // 47800 /7800/ 2800 2장
		int 오백원  =((((cost%50000)%10000)%5000)%1000)/500; // 
		int 백원  =(((((cost%50000)%10000)%5000)%1000)%500)/100;
		int 오십원 =((((((cost%50000)%10000)%5000)%1000)%500)%100)/50;
		int 십원 =(((((((cost%50000)%10000)%5000)%1000)%500)%100)%50)/10;
		
		System.out.printf("오만원 %d장 만원 %d장 오천원 %d장 천원 %d장 오백원 %d개 백원 %d개 오십원 %d개 십원 %d개",
				오만원, 만원, 오천원, 천원, 오백원 ,백원, 오십원, 십원);
	}

    	private static void getHourMinuteSecond(Scanner sc) {
		System.out.print("정수를입력하세요");
		int time = sc.nextInt();
		int second = time % 60;   //60으로 나눈 나머지는 초
		int minute = (time/60) %60;  //60으로 나눈 몫을 다시 60으로 나눈 나머지는 분 
		int hour =(time/60) / 60;  // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간 
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다. %n",time,hour,minute, second);

		
		
	}

}
