package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Gbb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		gBB(sc);
		
		
		sc.close();
		
		System.out.println("\"를 출력하려면 \\다음에 \"를 붙여 \\\"과 같이 하면 됩니다.");
	}

	private static void gBB(Scanner sc) {
		System.out.println("가위바위보 게임입니다. 가위,바위,보 중에서 입력하세요");
		System.out.print("철수 >>");
		String var1 = sc.next();
		System.out.print("영희 >>");
		String var2 = sc.next();
       
		if (var1.contentEquals("가위")){
			if(var2.contentEquals("바위")) {
				System.out.println("영희가 이겼습니다");
			}else if(var2.contentEquals("보")){
				System.out.println("철수가 이겼습니다");
			}else {
				System.out.println("비겼습니다.");
			}
		}else if(var1.contentEquals("바위")){
			if(var2.contentEquals("보")) {
				System.out.println("영희가 이겼습니다");
			}else if(var2.contentEquals("가위")){
				System.out.println("철수가 이겼습니다");
			}else {
				System.out.println("비겼습니다.");
			} 
		} 
		else if(var1.contentEquals("보")){
			if(var2.contentEquals("가위")) {
				System.out.println("영희가 이겼습니다");
			}else if(var2.contentEquals("주먹")){
				System.out.println("철수가 이겼습니다");
			}else {
				System.out.println("비겼습니다.");
			}	
	     }
	}

}
