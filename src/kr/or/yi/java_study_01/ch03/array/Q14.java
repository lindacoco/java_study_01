package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String course [] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
      int score[] = {95,88,76,62,55};
  
    
    for(int j=0; j<5; j++) {    	
			System.out.print("과목이름>>");
			String subject = sc.next();
			if (subject.equals("그만")) {
				System.out.println("종료되었습니다");
				break;
			}
			for (int i = 0; i < 5; i++) {
				if (course[i].equals(subject)) {
					System.out.println(course[i] + "의 점수는" + score[i]);
				}
				boolean isduplicate = check(subject, course);
				if (isduplicate) {
					continue;
				} else {
					System.out.println("없는 과목입니다.");
					break;
				}
			}
		}
     sc.close();
	}
	private static boolean check(String subject, String[] course) {
		for(int i=0; i<course.length; i++) {
			if(subject.equals(course[i])) {
	             return true;						
	     	}
		  }
		return false;
	  } 
}

