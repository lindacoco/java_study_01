package kr.or.yi.java_study_01.ch05.override;

public class q13 {

	public static void main(String[] args) {
//		q13();

		
//		Shape [] list = new Shape[3];
//		list[0] = new Circle(10);
//		list[1] = new Oval(20,30);
//		list[2] = new Rect(10,40);
		
		Shape[] list = {new Circle(10), new Oval(20,30), new Rect(10,40)};
		for(Shape s : list) {
			s.redraw();
			s.getArea();
		}
		
		
		for(int i =0; i<list.length ;i++);
		for(int i=0; i<list.length;i++) {
			System.out.println("면적은" +list[i].getArea());
		}
		
	}

	private static void q13() {
		Shape donut= new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

}
