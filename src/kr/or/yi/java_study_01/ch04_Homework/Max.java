package kr.or.yi.java_study_01.ch04_Homework;

class Max {
	
	public static int max(int [] arr) {
	   if(arr ==null || arr.length == 0 ){
		   return -999999;
	   }
	  
 	   int max =0;
 	   for(int i =0; i<arr.length ; i++) {
 		  
			 if(arr[i] > max) {
				 max = arr[i];
			 } 
		}
 	     return max;
	}

}
