package kr.or.yi.java_study_01.ch04_Exam;

class Rectangle {

	
	private int x;
	private int y;
	private int width;
	private int height;
		
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형 %n",x,y,width,height);
	}
	
	
	public boolean contains(Rectangle v) {
		int x1 = this.x ; 
		int y1 = this.y;
		int x12= this.x+this.width;
		int y12= this.y+this.height;
		int x2 = v.x ; 
		int y2 = v.y ; 
		int x21 =v.x +v.width;
		int y21 =v.y +v.height;
		
		if((x2 >= x1 && y2 >=y1) && (x21 <=x12 && y21 <= y12)) {
			return true;
		}else {
			return false;
		}

	}

}
