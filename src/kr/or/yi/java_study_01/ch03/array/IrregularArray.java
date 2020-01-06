package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class IrregularArray {

	public static void main(String[] args) {
		int intArray[][]  =new int[4][];
		createArray(intArray);
		
		initArray(intArray);
	
		prn_Array(intArray);  // 출력하는 것  컨트롤 해서 이동해서 살펴보기 
	}

	private static void prn_Array(int[][] intArray) {   //출력하는 것 
		for (int i =0; i<intArray.length;i++) {
			for (int j=0; j <intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
				
			}System.out.println();
		}
	}

	private static void initArray(int[][] intArray) {
		for (int i=0; i<intArray.length; i++) {          //4
			for (int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 +j;
			}
		}
	}

	private static void createArray(int[][] intArray) {
		System.out.println(Arrays.deepToString(intArray));  //일차원일때만 투스트링 [null, null, null, null]
		intArray[0] = new int[3];
		System.out.println(Arrays.deepToString(intArray));  //[[0, 0, 0], null, null, null]
		intArray[1] = new int[2];
		System.out.println(Arrays.deepToString(intArray));  //[[0, 0, 0], [0, 0], null, null]
		intArray[2] = new int[3];
		System.out.println(Arrays.deepToString(intArray));  //[[0, 0, 0], [0, 0], [0, 0, 0], null]
		intArray[3] = new int[2];
		System.out.println(Arrays.deepToString(intArray));  //[[0, 0, 0], [0, 0], [0, 0, 0], [0, 0]]
	}

}
