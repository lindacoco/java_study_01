package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class 과제Q01_02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자입력하세요");
		int [] arr = new int [4];
		
		int sum=0; 
	   for(int i =0; i<arr.length;i++) {
		    arr[i]=sc.nextInt();
		     
		   System.out.print(arr[i]+" ");
		   if(i !=0) {
			   sum = sum+ arr[i];
//			   System.out.print(sum +" ");
		   }
	       
//		for(int j=0; j<arr.length; j++) {
//			sum = sum + (int)arr[(j+1)];
//			
//           System.out.print(sum); 

	   }System.out.print("*"+sum +" ");

	}

}
