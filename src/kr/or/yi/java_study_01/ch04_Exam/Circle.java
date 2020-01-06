package kr.or.yi.java_study_01.ch04_Exam;

class Circle {

	
	private double x;
	private double y;
	private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void show() {
		System.out.printf("%.2f %.2f %.2f",x,y,radius);
	}

	@Override
	public String toString() {
		return String.format("(%s,%s)%d", x, y, radius);
		
	}
	
	
}
