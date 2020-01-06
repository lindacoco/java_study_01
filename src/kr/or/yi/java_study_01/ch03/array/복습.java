package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
//		max();
//		starfor();
//		starwhile();
//		stardowhile();
		
		/*
		 * int sum=0; for(int i = 1; i<=10; i++) { sum += i;
		 * 
		 * }System.out.println(sum+" ");
		 */
		   
		   
		for(int i=1; i<=20; i++) {
			if(i%3 !=0)
				continue;
			System.out.printf("%d",i);
		}
		   
		   
		char [] arr = new char[26];   
		char ch='z';
		char temp=0;
		for(int i = 0; i<arr.length;i++) {
			arr[i]=ch--;
			System.out.print(arr[i]);
		}System.out.println();
		int i;
		for (i=1; i<arr.length;i+=2) {			
			temp = arr[i-1];
			arr[i-1]= arr[i];
			arr[i] = temp;			
		}
		for(i = 0 ; i<arr.length;i++) {
			System.out.printf("%c", arr[i]);
		}
		System.out.println();
	}

	private static void max() {
		int [] intArray = new int[5];
		int max=0;
		System.out.println("양수 5개를 입력하세요");
		
	}

	private static void stardowhile() {
		int i = 0;
		do {
			i++;
			int j = -1;
			do {
				System.out.print("*");
				j++;
			} 
			while (j < 5 - i);
			System.out.println();
		} 
		while (i < 5);
	}

	private static void starwhile() {

     int i = 0;
     while(i<5) {
    	 int j=0;
    	   while(j<5-i) {
    	 System.out.print("*");
    	 j++;
     } System.out.println();
    	   i++;
     }	
	}

	private static void starfor() {
		for(int i = 0; i<5; i++) {
			for(int j =0; j<5-i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
