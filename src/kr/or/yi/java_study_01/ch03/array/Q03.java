package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int n = sc.nextInt();
		
		for(int i =0; i<n;i++) {
			for(int j =0; j<n-i; j++) {
			System.out.print("*");
		}System.out.println();
	  }
	}

}
