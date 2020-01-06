package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 과제Q3 {

	public static void main(String[] args) {
		//
       Scanner sc = new Scanner(System.in);
	 System.out.println("수를 정했습니다. 맞춰보세요");
	 System.out.println("0-99");
	 int n = (int)(Math.random()*99+1);
	 int v = 0;
	 while(v != n) {
		 v =sc.nextInt();
		 if(v <n) {
			 System.out.println("더 높게");
			 System.out.println(v+"-99");
		 }else if(v >n) {
			 System.out.println("더 낮게");
		 System.out.println("0 -"+v);
		 }else if(v ==n) {
			 System.out.println("정답입니다!");
		 }
		 
		 
	 }
	 
	 sc.close();
	 
	}

}
