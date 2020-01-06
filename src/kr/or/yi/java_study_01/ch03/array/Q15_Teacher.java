package kr.or.yi.java_study_01.ch03.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q15_Teacher {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
     
		do {
			System.out.print("곱하고자 하는 두 수 입력 >>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m + "=" + m * n);
			}

			catch (InputMismatchException e) {
				System.out.println("실수를 입력하면 안됩니다");
				sc.nextLine();
			}

		} while (true);
	
	}
	

}
