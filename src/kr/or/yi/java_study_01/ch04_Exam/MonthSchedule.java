package kr.or.yi.java_study_01.ch04_Exam;

import java.util.Scanner;

class MonthSchedule {
    Scanner sc = new Scanner(System.in); //스캐너 호출
	private int date;                    //데이트 변수 선언
	private Day [] days;                 //day객체 배열 days생성       
	
	public MonthSchedule() {
		// 생성자
	}	
	public MonthSchedule(int date) {
		this.date = date;
		this.days =new Day[date];     //배열 할당?
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	 private void input() {
		System.out.println("날짜(1~31)?");
		int day = sc.nextInt();
		System.out.println("할일(빈칸없이 입력)");
        String work =sc.next();	
        if(day <0 || day>date ) {
        	System.out.println("날짜를 잘못입력했습니다.");
        	return;
        }
        days[day-1].set(work);      
	}

	public void view() {
		System.out.println("날짜 (1~31)");
		int day =sc.nextInt();
		if(day <0 || day>date) {
			System.out.println("잘못입력");
			return;
		}
		System.out.print(day+"일의 할 일은");
		days[day-1].show();
	}

	public static void finish() {
		System.out.println("프로그램 종료"); 
	}
	public void run() {
		System.out.println("이번달 관리 프로그램");
		while(true) {
			System.out.println("1.입력 2.보기 3.종료");
			int res = sc.nextInt();
			switch(res) {
			case 1 :
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			   default: 
				   System.out.println("잘못입력하였습니다 ");
			}
			System.out.println();
		}
	}
}
