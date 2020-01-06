package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_Lotto {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		
	   int [] lotto = {5,8,17,28,39,45};
	   int [] bonus = {2};
	  
//	   System.out.print(Arrays.toString(lotto));
//	   System.out.print(Arrays.toString(bonus));
	   
	   System.out.print("당첨번호는 ");
	   for(int l =0; l<lotto.length; l++) {
	   System.out.printf("%s, ",lotto[l]);
	   } System.out.printf("보너스 번호 %s %n",bonus[0]);
//	   = (int)(Math.random()*45+1);
//	   System.out.println("번호 입력하세요 번호 6개 + 보너스 번호");
//	   int number = sc.nextInt();
	   
	   int [] key = {5,8,17,28,39,45};
	   
	   System.out.print("당신의 번호는 ");
	   for(int k1 = 0; k1<key.length; k1++) {
		   System.out.printf("%2d ",key[k1]);
	   }
	   int mybonus = 3;
	   System.out.printf("보너스번호 %d ",mybonus);
	   
//	   System.out.print(Arrays.toString(key));
	   int count =0;
	   int mine;
	   for(int i =0; i<6; i++) {
//		   System.out.print(key[i]);
		  mine = key[i];
//		  System.out.print(key[i]);
		  boolean isDuplicate = checkDup(mine,lotto,i); 
		  if(isDuplicate) {
			  count= count+1;
		  }else {
			  continue;
		  }
	   }
//	   System.out.println(count);
	   if(count==6) {
		   System.out.println("당첨 결과 : 1등");
	   }else if(count==5) {
		   if(mybonus == bonus[0]) {
			   System.out.println("당첨 결과 : 2등");
		   }else {
			   System.out.println("당첨 결과 : 3등");
		   }
	   }else if(count==4) {
		     System.out.println("당첨 결과 : 4등");
	   }else if(count==3) {
		   System.out.println("당첨 결과 : 3등");
	   }else {
		   System.out.println("당첨 결과 : 다음 기회에");
	   }
//		else if(count==5 && lotto[5]==key) {
//		   
//	   }
	}
	private static boolean checkDup(int mine, int[] lotto, int i) {
		for(int j = 0; j<lotto.length; j++) {
			if(mine == lotto[j]) {
				return true;
			}
		}
		return false;
	}
	
}
/*	private static boolean checkDup(int[] key, int[] lotto, int i) {
		for(int j =0; j< i; j++) {
			if(key[i] == lotto[j]) {
				return true;
			}
		return false;
	}

	
}*/
