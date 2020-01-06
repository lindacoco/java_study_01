package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 과제Q01_01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int n = sc.nextInt();
		int sum = 0;
		int n2;
		for(int i=0; i<n; i++) {
			n2 =sc.nextInt();
			sum = sum+n2;
			System.out.print(n2 + " ");
		}System.out.println(sum + "입니다");

		
	sc.close();
	}

}
