package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("컴퓨터와 가위바위보 게임을 합니다");
		
		String com[] = {"가위","바위","보"};
		
		String res;
		int comResIdx;
		do {
			System.out.print("가위 바위 보! >>");
			res = sc.nextLine();
			if(res.contentEquals("그만")){
				System.out.println("프로그램 종료");
					break;
			}
			comResIdx =(int)(Math.random()*3); //0부터 3보다 작은 임의의 수 0 1 2
			System.out.printf("사용자: %s 컴퓨터 %s %n",res,com[comResIdx]);
			resultWinOrLose(res,com[comResIdx]);
		}while(true); 
			

		
		
		sc.close();
	}

	private static void resultWinOrLose(String user, String com) {
		if(user.equals("가위")) {
			if(com.equals("가위")) {
				System.out.println("비김");
				
			}else if(com.equals("바위")) {
				System.out.println("컴퓨터가 이겼음 ");
			}else {
				System.out.println("사용자가 이겼음 ");
			}
		}else if(user.contentEquals("바위")) {
			if(com.equals("가위")) {
				System.out.println("사용자가 이김");
				
			}else if(com.equals("바위")) {
				System.out.println("비김");
			}else {
				System.out.println("컴퓨터가 이겼음 ");
			}
		
	}else {
		if(com.equals("가위")) {
			System.out.println("컴이이김");
			
		}else if(com.equals("바위")) {
			System.out.println("사용자가 이겼음 ");
		}else {
			System.out.println("비겼음  ");
		}
	 }
	}
}
