package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q14_Teacher {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String course [] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
	      int score[] = {95,88,76,62,55};
	      	      
	     String subject;
	     int findIdx;
	     while(true) {
	    	 System.out.print("과목이름 >>");
	    	 subject = sc.next();
	    	 if(subject.equals("그만")) {
	    		 System.out.println("종료합니다");
	    		 break;
	    	 }	    	 
	    	 findIdx = find(subject,course);
	    	 
	    	 if(findIdx == -1 ) {
	    		 System.out.println("없는과목");
	    		 continue;  //밑에 엘스 적으면 컨티뉴 할 필요는 없다. 
	    	 }
	    	 System.out.printf("%s 과목의 점수는 %d%n",subject,score[findIdx]);
	     }
	}
	private static int find(String subject, String[] course) {
		for(int i =0; i<course.length; i++) {
			if(subject.contentEquals(course[i])) {
				return i;
			}
		}
		return -1;
	}
}
