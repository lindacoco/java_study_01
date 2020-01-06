package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      System.out.print("소문자 알파벳 하나를 입력하시오>>");
      String n = sc.next();
      char alp = n.charAt(0);
	  int put = (int)alp;   //System.out.println(put-(int)'a'+1); 5
//	  System.out.println(put); 101
	for(int i =0; i<=put-((int)'a');i++) {
		for(int j =0; j<=put-((int)'a')-i ;j++) {
			System.out.print(((char)(j+((int)'a')))+" ");
		}System.out.println();
		
	
		
		
		
		
	}
	
	}

}
