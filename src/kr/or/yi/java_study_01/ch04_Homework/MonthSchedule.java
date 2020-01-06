package kr.or.yi.java_study_01.ch04_Homework;

import java.util.Scanner;

class MonthSchedule {
	private Scanner sc;
	private int nDays; //해당 월의 총 일수
	private Day[] days;
	
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays]; //일수 만큼의 데이객체를 가지는 배열 생성
		this.sc = new Scanner(System.in);
		
	}
	
	public void input() {
		System.out.print("날짜(1~30)");
		int day = sc.nextInt();
	
		
		if(day <0 || day >nDays) {
			System.out.println("날짜를 잘못입력하셨습니다.");
			System.out.printf("1~ %d까지의 값을 입력하세요",nDays);
		    return;
 		}	
		
		System.out.print("할일 입력");
		String work = sc.next();
		
		Day d = new Day();
		d.set(work);
		days[day-1] = d;
	}
	public void view() {
		System.out.print("날짜(1~30)");
		int day = sc.nextInt();

		if(day <0 || day >nDays) {
			System.out.println("날짜를 잘못입력하셨습니다.");
			System.out.printf("1~ %d까지의 값을 입력하세요",nDays);
		    return;
 		}
		System.out.print(day+"일의 할 일은 ");
		if(days[day-1] == null) {
			System.out.println("해당일에는 스케줄이 없습니다.");
		}
		days[day-1].show();
	}
	public void finish() {
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		int menu;
		do {
			System.out.println("할일 (입력: 1,보기 :2, 끝내기:3)>>>");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			}
		}while(menu < 3 );
		finish();
	}
}
