package kr.or.yi.java_study_01.ch04;

public class Rectangle {
	
	//접근지정이 없다 private - <default =package ~(앞에 아무것도 없음) < protected(상속관계 허용)# < public(아무나)+
	public int width;
	int height;
	

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
   
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public int getArea() {
		return width *  height ;
	}

}
