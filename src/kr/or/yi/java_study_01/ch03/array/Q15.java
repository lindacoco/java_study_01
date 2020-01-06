package kr.or.yi.java_study_01.ch03.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int m;
		for(int i =0; i<3; i++) {
			System.out.print("곱하고자 하는 두 수 입력 >>");

		try {
			n = sc.nextInt();
		    m = sc.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("실수를 입력하면 안됩니다");
			sc.nextLine();
			continue;
		}
		System.out.println(n + "x" + m + "=" + n*m);
		
		}
		
		sc.close();
		
	}	
}
