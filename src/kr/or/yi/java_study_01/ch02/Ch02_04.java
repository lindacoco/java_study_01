package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 3개 입력>>");
		int a =sc.nextInt(); 
		int b =sc.nextInt(); 
		int c =sc.nextInt(); 
		
		if(b > a) {
			if(c > b) {
				if(c > a) {
					System.out.println("중간 값은"+ b);
				}				
			}else {
				     System.out.println("중간 값은"+ c);
			}
	    }else if(b > a) {
	              if(c < b) {
		            if(a > c) {
			         System.out.println("중간 값은"+ a);
		          }
		      }else {
		    	     System.out.println("중간 값은"+ a);
         }
       }else if(a > b) {
	             if(c > b) {
		            if(a > c) {
			         System.out.println("중간 값은"+ c);
		          }
		      }else {
		    	      System.out.println("중간 값은"+ c);  
		      }
      }
   
			sc.close();
	}

}
