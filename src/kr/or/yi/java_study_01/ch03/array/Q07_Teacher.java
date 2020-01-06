package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int [] array = new int[10];
		System.out.println(Arrays.toString(array));
		int sum =0;
		for(int i =0; i<array.length; i++) {
			array[i] =(int)(Math.random()*10)+1;
			sum += array[i];
		}
		
	System.out.print(Arrays.toString(array));
	for(int e : array) {
		System.out.print(e + " ");
		
		//sum += e; 해도 됨 위에꺼 빼고
	}
	System.out.print("평균은"+(double)sum/array.length);
	sc.close();
	}

}
