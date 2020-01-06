package kr.or.yi.java_study_01.ch02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적=" +circleArea);  //314.0
		System.out.printf("원의 면적 = %.2f%n", circleArea); //314.00

	int n = 300;
	byte b= (byte) n;  //강제형변환
	System.out.println(b);  //44출력 값이 잘려나옴

	}

}
