package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
//		System.out.println(Arrays.toString(unit));//[0, 0, 0, 0, 0, 0, 0, 0]
        
		System.out.println("금액을 입력하시오 >>");
		int money = sc.nextInt();
		
	
	   for(int i =0; i<unit.length; i++) {
		   int g = money/unit[i];
		   if(g !=0) {
			   System.out.printf("%d원 짜리: %d개 %n",unit[i],g);
		   }
//		    for (int j =0; i<unit.length;j++) {
		    	money = money % unit[i];	
//		    }
		      	   
	   }
		
		
	}

}
