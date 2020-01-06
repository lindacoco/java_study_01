package kr.or.yi.java_study_01.ch01;


public class HelloJava {
   
	public static void main(String[] args) {
//		함수내에서 선언된 변수는 지역변수  ctrl +/ 해제도 똑같
        String name= "이상원1"; 
		System.out.print("Hello Java");
		
//	    슬래시 이후의 문자들을 주석처리	
		/*  블럭주석  ctrl +shift +/ 해제는 ctrl+shift +\ 역슬래시
		 * 문자열 + 변수 -> 문자열 + 문자열로 -> 하나의 문자열로 결합 더하기가아님 숫자가 오면 더하기가됨
		 */
		System.out.println("힘들지 " + name);
		
	}

}
