package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q9_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr =new int[4][4]; //16개
		for(int row =0; row<arr.length; row++) {
			for(int col =0; col<arr[row].length; col++) {
				arr[row][col] = (int)(Math.random()*10)+1;
			}
		}
		
		for(int[] rows : arr) {
			for(int e : rows) {
				System.out.print(e +" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
