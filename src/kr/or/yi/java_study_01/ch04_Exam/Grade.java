package kr.or.yi.java_study_01.ch04_Exam;

class Grade {

	private int math;
	private int science;
	private int english;
	
	public Grade() {
		// TODO Auto-generated constructor stub
	}

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	
	public int average() {
		return (math+science +english)/3;
	}
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}
    
	
	
}
