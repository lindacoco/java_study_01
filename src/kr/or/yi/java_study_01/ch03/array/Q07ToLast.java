package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q07ToLast {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//     Q007();
  

       System.out.print("정수 몇개? 100보다 작은 개수 ");
       int num = sc.nextInt();
       int arr [] =new int[num];
       int key;
       for(int i=1; i<num+1; i++) {
    	   
    	   key=(int)(Math.random()*100+1);
    	   boolean isDuplicate=checkDup(key,arr,i);
    	   if(isDuplicate) {
    		   //키값과 그 전의 배열 중복값이있으면 다시  체크 
    		   i--;
    		   continue;
    	   }else {
    		   arr[i-1]=key;
    	   }
//    	   System.out.println(Arrays.toString(arr));
    	   //else
    	   
//    	   arr[i-1]=(int)(Math.random()*100+1);
//    	   //
    	   System.out.printf("%3d ",arr[i-1]);
    	   if(i !=0 && i%10 == 0) {
    		   System.out.println();
    	   }
//    	   int searchKey = arr[i-1];
 //   	   search(arr[], searchKey);
       }      
//      for(int j =1; j<num+1; j++) {
//      int searchKey = arr[j-1];
//	   if(arr[i-1]== searchKey) {
//	   System.out.print(i-1);
//	   }      
		sc.close();		
	  }
private static boolean checkDup(int key, int[] arr, int i) {
	//	System.out.printf("키는 %d 배열 %s i값 %d %n",key,Arrays.toString(arr),i);
		for(int j =0; j<i;j++) {
			if(key == arr[j]) {
				return true;
			}
		}
		return false;
	}

//	private static void search(Class<arr[]> class1, int searchKey) {
//		for(int j =0; j< arr.length; j++) {
//			if(arr[j] == searchKey ) {
//				System.out.print("중복되는 값"+j);
//		
//	}

	private static void Q007() {
		int [] ten = new int[10];
		 int sum =0;
		 System.out.print("랜덤한 정수들 : ");
		 for(int i = 1; i <=10; i++) {
		    ten[i-1]=(int)(Math.random()*10+1); 	 
		    System.out.print(ten[i-1]+" ");
		    sum += ten[i-1];
		 }
		 System.out.printf("%n평균은 %.1f",(double)sum/ten.length);
	}

}
