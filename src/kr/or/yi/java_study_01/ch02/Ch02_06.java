package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오>>");
		int z = sc.nextInt();
		
		   if ((z == 3) || (z == 6)  || (z ==9)  || 
		      (z == 13) || (z == 16) || (z ==19) || 
		      (z == 23) || (z == 26) || (z ==29) ||
		      (z == 43) || (z == 46) || (z ==49) ||
		      (z == 53) || (z == 56) || (z ==59) ||
		      (z == 73) || (z == 76) || (z ==79) ||
		      (z == 83) || (z == 86) || (z ==89) ) {
			   System.out.println("박수짝");
		}else if((z == 30) || (z == 31) || (z ==32) ||
				 (z == 34) || (z == 35) || (z ==37) ||
				 (z == 38) || (z == 60) || (z ==61) ||
				 (z == 62) || (z == 64) || (z ==65) ||
				 (z == 67) || (z == 68) || (z ==90) ||
				 (z == 91) || (z == 92) || (z ==94) ||
				 (z == 95) || (z == 97) || (z ==98) ) {
			System.out.println("박수짝");
		}else if ((z == 33)|| (z == 36) || (z ==39) ||
				 (z == 63) || (z == 66) || (z ==69) ||
				 (z == 93) || (z == 96) || (z ==99) ) {
			System.out.println("박수짝짝");
		}
		
		
		
		
		sc.close();

	}

}
