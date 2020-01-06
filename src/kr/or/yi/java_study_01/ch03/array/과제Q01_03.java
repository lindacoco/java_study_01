package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 과제Q01_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum =0;
		System.out.println("수를 입력하세요 0을 쓰기 전까지의 합을 구합니다.");
		int n = sc.nextInt();
		while(n !=0) {
		  sum = sum+n;
		  n = sc.nextInt();
		}System.out.println(sum);
				
		sc.close();
	}

}
