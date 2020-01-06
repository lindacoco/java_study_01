package kr.or.yi.java_study_01.ch02;

/** 
 * alt shift J 주석
 * 
 * 소스파일 : Hello.java
 * 작성일 : 2019.11.20
 * 아래 클래스에 대한 설명을 적는공간
 */
public class Hello {

	public static void main(String[] args) {
		 //지역변수(함수 내 선언된 변수는 무조건 다 지역변수이다 args도 지역변수 그 영역안에서만 유효하다는 의미 중괄호가 영역)
		int i = 20;  //선언과 초기화
		// 등호를 할당연산자로 봐야한다 ,배정연산자 lvalue2저장소 rvalue1값 r을 l에 집어넣어라
		int s;  //정수형 변수 선언만 한 것
		char a; //문자형 변수 선언만 
        double PI = 3.141592;
        PI = 3.14; //에러뜨고 FINAL 삭제
        
		s= sum(i,10);
		a ='?';
	    
		System.out.println(a + "Hello" + s); 
		//'a'+'Hello'+30한꺼번에 수행 , 우결합
		//"a"+"Hello" + 30
		//"aHello" +30
		//"aHello" + "30" 문자화된 30 결합연산이된다
		//?Hello30출력
		System.out.println(a +"Hello" +s +10);
	    //?Hello3010 출력
		System.out.println(a +"Hello" + (s +10));
		//?Hello40 숫자 숫자 더해져서 40으로 출력되는 것 더하기 연산이 된다 
		System.out.printf("%c %s %d %5.2f %n", a,"Hello", s, 5/3.0);
       //캐릭터 스트링 d는 정수형 f는 실수  %n은 띄우기  %.2f 소수점 이하 두자리  5 전체자리수 2 소수점이하 자리수
		//? Hello 30  1.67 
		System.out.printf("%c %10s %d %5.2f %n", a,"Hello", s, 5/3.0);
		//?      Hello 30  1.67 
		System.out.printf("%c %-10s %d %5.2f %n", a,"Hello", s, 5/3.0);
		//? Hello      30  1.67 좌측정렬 
		/*
		 * System.out.println("i = %d, j= %d%n", i, m); //j 못찾음 여기 i는 아래 i와 다름 지역변수, 이상원
		 * <->프린트기 전역변수..자바엔없는개념
		 */	
		
	    System.out.println("\"java's 어렵다\"");
	    
	}
    //괄호 끝나고 나면 변수 값들 사라짐 
	private static int sum(int n, int m) {
        // alt shift r 동시 바꿀 수 있음
		// i 범위가 틀려서 못찾음 
		return n + m;
		
	}

}
