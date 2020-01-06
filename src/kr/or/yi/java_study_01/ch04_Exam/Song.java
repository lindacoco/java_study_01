package kr.or.yi.java_study_01.ch04_Exam;

class Song {

	private String title;
	private String artist;
	private int year;
	private String country;

	
	
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
    
	public void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s",year,country,artist,title);
	}
	
	
	
}
