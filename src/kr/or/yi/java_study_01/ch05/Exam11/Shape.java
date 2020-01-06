package kr.or.yi.java_study_01.ch05.Exam11;

public class Shape {
   public Shape next;
   
   public Shape() {
	   next =null;
   }
   public void setNext(Shape obj) {
	   next = obj;
   }
   public Shape getNext() {
	   return next;
   }
   
   public void draw() {
	   System.out.println("Shape");
   }
}
