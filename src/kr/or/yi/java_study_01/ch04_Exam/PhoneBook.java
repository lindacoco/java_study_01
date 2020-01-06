package kr.or.yi.java_study_01.ch04_Exam;

import java.util.Arrays;
import java.util.Scanner;

class PhoneBook {
     Scanner sc = new Scanner(System.in);
	
     private int num;
     private Phone [] info;
	 private String towof;
	
	public PhoneBook(int number) {
		this.num = number;
		this.info = new Phone[number];
		for(int i =0; i<info.length; i++) {
			info[i] = new Phone();
		}
	}
	
	private void put() {
		for(int i=0; i<info.length; i++) {
		System.out.println("이름과 전화번호 입력 이름과 번호는 빈 칸없이");
	    String towof = sc.next(); 
//	    info[i].set(name,tel)
	}System.out.println("저장 되었습니다");

	
	
	}	
}
