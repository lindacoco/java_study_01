package kr.or.yi.java_study_01.ch04;

import java.util.Arrays;

public class Testteste {

	public static void main(String[] args) {
		Circle[] circleArr = {new Circle(1,"자바"),new Circle(2,"피자"),new Circle(3,"고르곤"),null,null};

		System.out.println(Arrays.toString(circleArr));
		circleArr[0] = new Circle(1, "자바피자");
		
		 System.out.println(Arrays.toString(circleArr));
		
		 prnArr(circleArr);
		 
		 int idx=2;
	        circleArr[++idx] =new Circle(5,"빅피자");
	        prnArr(circleArr);
		 
		 
	}

	private static void prnArr(Circle[] circleArr) {
		for (Circle c : circleArr) {
			try {
				System.out.println(c);
			} catch (NullPointerException e) {
				System.out.print("null");  //3.14nullnullnullnull
			} 
		}
		
	}

}
