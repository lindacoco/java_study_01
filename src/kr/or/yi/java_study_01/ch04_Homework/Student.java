package kr.or.yi.java_study_01.ch04_Homework;

class Student {

	private String name;
	private int ban;
	private int kor;
	private int eng;
	private int math;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int ban, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	public double getAverage() {
		double avg = (kor+eng+math)/3;
		return avg; 
	}
}
