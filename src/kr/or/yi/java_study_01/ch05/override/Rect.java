package kr.or.yi.java_study_01.ch05.override;

public class Rect implements Shape {
    private int width;
    private int height;
    
    
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("%d x %d크기의 사각형입니다%n",width,height);

	}

	@Override
	public double getArea() {
		
		return width * height;
	}

}
