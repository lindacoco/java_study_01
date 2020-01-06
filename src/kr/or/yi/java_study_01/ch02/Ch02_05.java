package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.print("정수 3개를 입력하시오>>");
		  int a =sc.nextInt();
		  int b =sc.nextInt();
		  int c =sc.nextInt();
		
		 if ((a > b) && (b > c) && (a > c)) {
			 if (a < (b+c)) {
				 System.out.println("삼각형이 됩니다.");
			 }			 
		 }else if ((a > b) && (b < c) && (a > c)) {
			 if (a < (b+c)) {
				 System.out.println("삼각형이 됩니다.");
			 }			 
		 }else if ((a < b) && (b > c) && (a > c)) {
			 if (b < (a+c)) {
				 System.out.println("삼각형이 됩니다.");
			 }			 
		 }else if ((a > b) && (b < c) && (a < c)) {
			 if (c < (a+b)) {
				 System.out.println("삼각형이 됩니다.");
			 }			 
		 }else if ((a < b) && (b > c) && (a < c)) {
			 if (b < (a+c)) {
				 System.out.println("삼각형이 됩니다.");
			 }			 
		 }else if ((a < b) && (b < c) && (a < c)) {
			 if (c < (a+b)) {
				 System.out.println("삼각형이 됩니다.");
			 }			 
		 }
				
		sc.close();
	}

}
