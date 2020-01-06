package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		char[] chArr = new char[26];
		prnArray(chArr);
		makeArray(chArr); //함수에 배열을 넘겨주기
	    prnArray(chArr);  //z y x ... a
		swapArray(chArr);
		
		//위치교환 (swap)
		// y z .... a
//         char temp = chArr[0];
//		 chArr[0]=chArr[1];
//		 chArr[1]=temp;
	     prnArray(chArr); 
		 	
		}
		
	

	private static void swapArray(char[]arr) {
		char temp=0;
		for(int i = 1 ; i<arr.length;i+=2) {
			 temp = arr[i-1];
			 arr[i-1]=arr[i];
			 arr[i]=temp;		 
		}
		
	}



	private static void prnArray(char[] arr) { //여기서만 유효함 이름이 chArr이라도 지역변수
		for(int i = 0 ; i<arr.length;i++) {
			System.out.printf("%c", arr[i]);
		}
		System.out.println();
	}
	
	private static void makeArray(char[] arr) { //chArr->arr  arr도 chArr을 참조 지역변수에서만 유효해서 
		char ch= 'z';
		for(int i = 0 ; i<arr.length;i++) {
			arr[i]= ch--;
		}
	}

}
