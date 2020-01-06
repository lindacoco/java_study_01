package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q04_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 하나만 입력>>");
		String s = sc.next();
		if(s.length() !=1) {
			System.out.println("알파벳 하나만 입력해");

			return; //바로 끝남
		}
		
		char ch = s.charAt(0);
		if(ch<'a' || ch >'z') {
			System.out.println("소문자만 입력해");

			return; //바로 끝남			
		}
		for(char m=ch; m>='a';m--) {
			for(char u ='a'; u<=m; u++) {
				System.out.print(u +" ");
			}
			System.out.println();
		}

	}

}
