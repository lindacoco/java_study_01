package kr.or.yi.java_study_01.ch04;

import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		prnTest();
		TestMain tm = new TestMain();
		tm.prnTest();

	}
	
	public static void prn() {
		System.out.println("ggg");
	}
	
	
	public void prnTest() {
		System.out.println("haha");
		prn();
	}

}
