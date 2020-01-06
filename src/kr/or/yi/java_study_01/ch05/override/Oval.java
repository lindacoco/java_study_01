package kr.or.yi.java_study_01.ch05.override;

public class Oval implements Shape {

    private int width;
    private int height;
    
    
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("%d x %d내접하는 타원입니다%n",width,height);

	}

	@Override
	public double getArea() {
		
		return Shape.PI * width * height;
	}

}
