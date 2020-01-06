package kr.or.yi.java_study_01.ch05.Exam11;

public class ShapeMgn {
	private Shape start;
	private Shape end;

	public Shape getStart() {
		return start;
	}

	public void setStart(Shape start) {
		this.start = start;
	}

	public Shape getEnd() {
		return end;
	}

	public void setEnd(Shape end) {
		this.end = end;
	}
    public boolean isEmpty() {
    	return start == end && start == null;  //엠프티라는뜻
    }
}
