package kr.or.yi.java_study_01.ch05.override;

public class Circle implements Shape {
    
	private double radius;
	
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름이"+radius +"인 원입니다");
		

	}

	@Override
	public double getArea() {
		
		return Shape.PI *radius * radius ;
	}

}
