package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class testtesttest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("수를 입력하세요");
//	     int n =sc.nextInt();
//	     int i =1;
//	     double n1 = (n/(i*100))%10;
//	       System.out.print((int)n1);  
	     int sum=0;
	     int [] arr = new int [50];
//	     int [] arr = {3,1,2,3};
	     int cnt =0;
	     for(int i =0; i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	    	 if(arr[i] !=0) {
	    	 cnt++;
//	    	 System.out.print(arr[i]+" ");
	    	for(int j=1; j<arr.length; j++) {
	         sum = sum + (int)(arr[j]);
	         
	         System.out.println("합계는"+sum/(cnt-1));
	    	 }//System.out.print(sum );
	    	}
	     }
		sc.close();

	}

}
