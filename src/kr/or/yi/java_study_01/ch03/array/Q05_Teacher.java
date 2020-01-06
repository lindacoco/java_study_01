package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q05_Teacher {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("양의 정수 10개를 입력하시오 >>");
		int [] array = new int[10];
		for(int i =0; i<array.length;i++) {
			array[i] = sc.nextInt();
		}
        System.out.print("3의 배수는");
        for(int i =0; i<array.length;i++) {
        	if(array[i] %3 ==0) {
        		System.out.printf("%d ",array[i]);
        	}
        }
	}

}
