package kr.or.yi.java_study_01.ch05.ab;

public class MethodOverridingEx {

	public static void main(String[] args) {
		Shape[] shapes = { new Circle(), new Rect(), new Line(), new Line() };
		for (Shape s : shapes) {
			paint(s);
		}
	}

	private static void paint(Shape s) {
		s.draw();

	}

}