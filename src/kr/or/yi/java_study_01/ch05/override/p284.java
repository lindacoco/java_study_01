package kr.or.yi.java_study_01.ch05.override;

import kr.or.yi.java_study_01.ch05.Exam11.Circle;
import kr.or.yi.java_study_01.ch05.Exam11.Line;
import kr.or.yi.java_study_01.ch05.Exam11.Rect;
import kr.or.yi.java_study_01.ch05.Exam11.Shape;

public class p284 {

	public static void main(String[] args) {
		 
		   Shape start;
		   Shape last;
		   Shape obj;
		   
		   start = new Line();  //Line 객체 연결 
		   last = start;
		   obj = new Rect();    //Rect 객체 연결
		   last.next = obj;
		   last = obj;
		   obj = new Line();  //Line객체 연결
		   last.next = obj;
		   last = obj;
		   obj = new Circle(); //Circle객체 연결
		   last.next = obj;
		   //모든 도형 출력
		   Shape p = start;
		   while(p != null) {
			  p.draw();
			  p = p.next;

	 }
	}
}
