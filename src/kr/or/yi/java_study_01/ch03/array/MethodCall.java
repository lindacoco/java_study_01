package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class MethodCall {

	public static void main(String[] args) {
		void_method(5);
		int res= return_method(3,5);
	
		System.out.println("res="+res); //res=8
		
		
	makeIntArray(5);
	
	
	int a = 5;
	int b = 3;
	System.out.printf("변경 전 a = %d, b = %d %n",a,b);   // 변경 전 a = 5, b = 3 
	swap(a,b);                                         //a = 3, b = 5 
	System.out.printf("변경 후 a = %d, b = %d %n",a,b);  // 변경 전 a = 5, b = 3  함수를 썼기때문에 초기화됨 
	  //바꾼것을 유지하고 싶다면 레퍼런스 써야한다 
	int [] arr = {5,3};
	System.out.printf("변경 전 arr[0] = %d, arr[1] = %d %n",arr[0],arr[1]); //변경 전 arr[0] = 5, arr[1] = 3 
	swap(arr);
	System.out.printf("변경 후 arr[0] = %d, arr[1] = %d %n",arr[0],arr[1]); //변경 후 arr[0] = 3, arr[1] = 5 		
	}
	//메인에서 사라졌지만 heap영역에 있기때문에 바뀐 값이 유지된다.
	
	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0]= arr[1];
		arr[1] = temp;
		System.out.printf("swap(int[] arr)->arr[0] = %d, arr[1] = %d %n",arr[0],arr[1]); //swap(int[] arr)->arr[0] = 3, arr[1] = 5 
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("a = %d, b = %d %n",a,b);
		
	}


	private static void makeIntArray(int size) {
		int [] temp = new int [size];
		System.out.println(Arrays.toString(temp));  //[0, 0, 0, 0, 0]
		
	}


	public static int return_method(int a , int b) {
		int c = a + b;
		return c;
		
	}

	public static void void_method(int size) {
		System.out.println("size= "+ size);  //size= 5
		return;
	}
	
}
