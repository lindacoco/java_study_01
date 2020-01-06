package kr.or.yi.java_study_01.ch05.override;

import kr.or.yi.java_study_01.ch05.Exam11.Circle;
import kr.or.yi.java_study_01.ch05.Exam11.Line;
import kr.or.yi.java_study_01.ch05.Exam11.Rect;
import kr.or.yi.java_study_01.ch05.Exam11.Shape;

public class MethodOverridingEx {

	   static void paint(Shape p) {
//		array2(p); 
		
		  
		   }
		   
	
		
	   


	private static void array2(Shape p) {
		p.draw();
	}
  

public static void main(String[] args) {
	Line line = new Line();
	
	
	paint(line);
	paint(new Shape());
	paint(new Line());
	paint(new Rect());
	paint(new Circle());

 }

}