package kr.or.yi.java_study_01.ch04_Exam;

class TV {

	private String tvName;
	private int year;
	private int inch;
	
	
	public TV() {
		// TODO Auto-generated constructor stub
	}

	public TV(String tvName, int year, int inch) {
		this.tvName = tvName;
		this.year = year;
		this.inch = inch;
	}
    
	public void show() {
		System.out.printf("%s에서 만든 %d년 형 %d인치 TV", tvName, year, inch);
	}
    
	public String getTvName() {
		return tvName;
	}


	public void setTvName(String tvName) {
		this.tvName = tvName;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}


//	@Override
//	public String toString() {
//		return String.format("%s에서 만든 %d년 형 %d인치 TV", tvName, year, inch);
//	}
	
	
	
	
	
}
