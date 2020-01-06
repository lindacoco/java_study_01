package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q08_Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		if(n <= 0 || n >100) {
			System.out.println("1부터 100까지만 ");
			return;
		}
        int [] array= new int[n];
        
        int r;
        for(int i =0; i<array.length; i++) {
        	r = (int) ((Math.random()*100)+1); //임의의 100
        	for(int j=i-1; j>-1; j--) {
        		if(array[j] ==r) {
        			i--;
        			continue; //이후에는 수행하지 마라 
        		}
        	}//이까지 중복을 검사한것
        	array[i] =r;   // 배열에 r을 넣어라
        }
		 for(int e : array) {
			 System.out.print(e+" ");
			  
		 }
		
		sc.close();
	}

}
