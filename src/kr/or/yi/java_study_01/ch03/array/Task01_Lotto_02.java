package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Task01_Lotto_02 {

	public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
				
			   int [] lotto = {5,8,17,28,39,45};
			   int [] bonus = {2};

			   System.out.print("당첨번호는 ");
			   for(int l =0; l<lotto.length; l++) {
			   System.out.printf("%s, ",lotto[l]);
			   } System.out.printf("보너스 번호 %s %n",bonus[0]);   
			   
			   int [] key = new int [6];
			   int [] mykey = new int [6];
			   int input;
		
			   for (int a = 0; a < mykey.length; a++) {
				    input = (int) (Math.random() * 45 + 1);
					
					boolean number = check(input, mykey, a);
					if(number) {
						a--;
						continue;
					} else {
						mykey[a] = input;
					}
				}	       
			   System.out.print("당신의 번호는 ");
			  for(int b = 0; b<mykey.length; b++) {
				System.out.printf("%2d ",mykey[b]);
			   }
			   int mybonus = (int)(Math.random()*45+1);
			   System.out.print("보너스 번호 "+mybonus+" ");
			   
			   
			   int count =0;
			   int mine;
			   for(int i =0; i<6; i++) {  
				   mine = mykey[i];
				   boolean isDuplicate = checkDup(mine,lotto,i); 
					  if(isDuplicate) {
						  count= count+1;
					  }else {
						  continue;
					  }
				   }
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
			   
	}



private static boolean check(int input, int[] mykey, int a) {
	for(int j = 0; j<mykey.length; j++) {
		if(input == mykey[j]) {
			return true;
		}
	}
	return false;
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