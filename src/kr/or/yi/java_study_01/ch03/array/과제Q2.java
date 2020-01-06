package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 과제Q2 {

	public static void main(String[] args) {
		//사용자가 입력한 특정한 정수의 자리를 반대로 바꾸어 출력하는 프로그램
     Scanner sc = new Scanner(System.in);
	int i =1;	
	 System.out.println("수를 입력하세요");
     int n =sc.nextInt();
//     int temp =n;
	
     do { 
        if(n <0) {
    	 System.out.println("양수를 입력하세요");
    	 break;
        }
    	 double n1 = (n/i)%10;   //double int는 없어도 된다. 
         System.out.print((int)n1);  
    	 i= i*10;        
//       n =temp;   
     } while((n/i)> 0);
       
//    	n1=n%10;
//    	n2=n/10%10;
//    	n3=n/100%10;
//    	n4=n/1000%10; 	
    	
     
	}

}
