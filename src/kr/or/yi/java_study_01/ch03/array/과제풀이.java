package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		exam1_A(sc);
//      exam1_B(sc);
//      exam1_C(sc);
		
//		exam2(sc);

        //3번. 프로그램에서 미리 결정된 정답을 알아맞추는 게임을 설계 낮은지 높은지만 알려주고  1부터 100까지의 수
		   //사용자가 음수를 입력하면 반복이 중단되도록한다.
		
		int 정답 = (int)(Math.random()*100) +1;  //미리 결정된 정답 
		System.out.println("정답 ="+정답);
		
		int cnt = 0; //시도 회수
		int res;
		do {
			System.out.print("1부터 100까지의 수를 입력하시오 >>");
			res = sc.nextInt();
            cnt++;
            
            if(res >정답 ) {
            	System.out.println("낮음");
            }else if(res ==정답) {
            	System.out.println("정답");
            	break;
            }else {
            	System.out.println("높음");
            }
		}while(res >0);
		
		System.out.printf("%d번 만에 맞췄음",cnt);
		
     sc.close();
	}

	private static void exam2(Scanner sc) {
		//2번 사용자가 입력한 정수를 반대로 출력 1의 자리수는 n%10 
		System.out.println("정수입력");
		int res = sc.nextInt(); //1206
		do { 
			 System.out.print(res%10);
			 res = res/10;
		}while(res >0);
	}

	private static void exam1_C(Scanner sc) {
		//처리될 정수의 개수를 지정하지 않고, 사용자가 0을 입력하면 반복을 중단하고 그때까지의 합을 출력한다 100 200 300 0
		System.out.println("입력값, 입력값 ... 0");
		int a=0;
		int sum =0;
		
		do {
			a = sc.nextInt();
			sum += a;			
		}while(a !=0);
		System.out.printf("%d%n",sum);
	}

	private static void exam1_B(Scanner sc) {
		//맨 처음에 입력되는 정수는 앞으로 입력될 정수의 개수를 지정한다.
		System.out.print("입력값의 개수 입력값1 입력값2..");
		int cnt = sc.nextInt();
		int sum =0;
		int a;
		for(int i = 0; i <cnt; i++) {
			a = sc.nextInt();
			sum += a;	
			System.out.printf("%d %s",a,i==cnt-1?"=":"+");
		}
		System.out.printf("%d%n",sum);
	}

	private static void exam1_A(Scanner sc) {
		// 1-A에서 100까지 정수의 합을 구하는 것
		System.out.print("시작값 종료값을 입력하세요>>");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum =0;
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.printf("%d에서 %d까지의 합은 %d%n",start,end,sum);
	}

}
