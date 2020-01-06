package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 랜덤
//		generate_number();
		
		
		Random rnd = new Random(1234567);
		int[] arr = new int[6];
		System.out.println(Arrays.toString(arr));
		
		
		init_lotto(rnd, arr);
		//간단한 배열 출력방법
		System.out.println(Arrays.toString(arr)); //외워
		
		bubble_sort(arr);
		System.out.println(Arrays.toString(arr)); //실행하면 15 17 27 33 36 43이 나와야한다
		
		
		
		int searchKey=43;
		int findIdx= findSearch(arr,searchKey);
		System.out.printf("%s 배열에서 %d의 위치는 %d 입니다%n",Arrays.toString(arr),searchKey, findIdx);
		
		findIdx = binarySearch(arr,searchKey);
		System.out.printf("%s 배열에서 %d의 위치는 %d 입니다%n",Arrays.toString(arr),searchKey, findIdx);
		
		
		
	}

	private static int binarySearch(int[] arr, int searchKey) {
		// 이분검색
		int left = 0;
		int right = arr.length-1;
		int mid = (left+right)/2;
		while (left<=right) {
			if (arr[mid] > searchKey) {
				right = mid - 1;
			}
			if (arr[mid] < searchKey) {
				left = mid + 1;
			}
			if (arr[mid] == searchKey) {
                 return mid;        
			}
			mid = (left+right)/2;
		}
		return -1;
	}
    //서치 키 36
	// [15, 17, 27, 33, 36, 43]
	// arr[mid]  left    right     mid        left<= right
	//  27        0       5                      0<= 5
	//                          0+5 /2 = 2
	//            3                             3<= 5
	//                          3+5 / 2 =4
	//  36
	// 10찾기
	//  0         5  
	// 27                          0+5 /2 = 2 
	//                  2-1 =1  
	//  15 
	private static int findSearch(int[] arr, int searchKey) {
		// arr배열에서 searchKey가 존재하면 위치 index 리턴, 만약 존재하지 않을 경우 -1을 리턴
		
	    for(int i = 0; i <arr.length; i++) {
	    	if(arr[i]== searchKey) {
	    		return i;
	    	}
	    }
	    return -1;
	}

	private static void bubble_sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int j = 1; j < arr.length; j++) {
			int temp = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
				} else {
					continue;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void init_lotto(Random rnd, int[] arr) {
		for (int i = 0; i<arr.length;i++) {
			arr[i]= rnd.nextInt(46)+1;
		}
	}

	private static void generate_number() {
		Random rnd = new Random();
		//한번만 반복하게   -- 테스트 용이
		rnd.setSeed(1234);
		for(int i = 0; i<=6; i++) {
	System.out.print(rnd.nextInt(45)+1+" "); //로또번호 생성 0<-rand.nextInt(45)<45 ->1 < < 46
		}
	}

}
