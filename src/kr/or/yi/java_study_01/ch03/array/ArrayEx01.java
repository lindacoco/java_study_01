package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열선언
//		array1();		
		array2();				
//		array3();		
//		max(sc);				
		System.out.println("찾고자하는 정수값을 입력하세요");
		int[] intArray = {5,4,3,2,1};

		int searchKey = sc.nextInt();
		//intArray에 searchKey가 존재하면 "위치하고 있는 인덱스를 출력하고 찾지못하면 -1을 출력하도록 작성하시오.
		int findIndex = -1;
		for(int i =0; i<intArray.length ; i++) {			
			if(searchKey==intArray[i]) {
				findIndex= i;
				break;
			}			
		}
		System.out.printf("serchKey %d는 %d의 위치에 있습니다",searchKey,findIndex);					
//		int max = Integer.MIN_VALUE;  //현재가장큰수
//		int min = Integer.MAX_VALUE;
//		System.out.printf("정수형 범위 %d ~ %d %n",Integer.MIN_VALUE,Integer.MAX_VALUE);
				
		sc.close();
	}
	private static void max(Scanner sc) {
		int intArray[] = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("양수 5개를 입력");
		for (int i = 0 ; i<5; i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i]>max) {
				max = intArray[i];
		}
			if(intArray[i]<min) {
				min =intArray[i];
			} 
	}System.out.printf("가장 큰 수는 %d 가장 작은 수는 %d",max,min);		
		}	
	private static void array3() {
		char[] chArr = new char[26];
		char ch = 'a';
		for (int i= 0; i<chArr.length;i++){
//			System.out.printf("%c",chArr[i]); //아무것도 안나옴 
			chArr[i] = ch++; 
		}
		System.out.println();
		for (int i = 0; i<chArr.length;i++) {
			System.out.printf("%c", chArr[i]); // abcdefghijklmnopqrstuvwxyz
//			System.out.printf("%d", (int)chArr[i]); 
		}
	}

	private static void array2() {
		int[] intArray = {5,4,3,2,1};
		
		for(int i=0; i<intArray.length;i++) {
			System.out.printf("%2d ", intArray[i]);
		}
		
		intArray[2] = 10;
		System.out.println();
		int[] myArray = intArray;
		for (int i =0; i<myArray.length;i++) {
			System.out.printf("%2d ",myArray[i]);
		}
	}

	private static void array1() {
		int[] intArray01 = null; //정수형 배열 선언
		System.out.println(intArray01);  //지역변수는 반드시초기화
		intArray01 = new int[5];
		System.out.println(intArray01);   //[I@15db9742 주소값 출력
		System.out.println(intArray01[0]); 
		System.out.println(intArray01[1]); 
		System.out.println(intArray01[2]); 
		System.out.println(intArray01[3]); 
		System.out.println(intArray01[4]); //다 0이 들어가 있음
		//배열의 크기
		System.out.println("배열의 크기 "+ intArray01.length); //5출력
		for(int i=0; i<intArray01.length; i++) {
			System.out.printf("%d ",intArray01[i]);
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d ",intArray01[i]);
		}
	}

}
