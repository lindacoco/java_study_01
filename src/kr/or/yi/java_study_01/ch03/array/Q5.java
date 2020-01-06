package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] n = new int[10];
		System.out.print("양의 정수 10개를 입력하시오 >>");
		int cnt =0;
		for(int i =0; i<10; i++) {
			 n[i] =sc.nextInt();
			 
			 if(i ==0) {
				 System.out.print("3의 배수는 ");
			 }
			 if(n[i]%3==0) {
				cnt = cnt +1;
				System.out.print(n[i]+" ");	
			}
		}
		if(cnt == 0) {
			System.out.print("없습니다");
		
		}
// 11 11 11 11 11 11 11 11 11 11 		
//      1 5 99 22 345 154 2346 55 32 85		
//		System.out.print("3의 배수는");
	}

}
