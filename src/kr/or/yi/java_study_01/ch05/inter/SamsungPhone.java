package kr.or.yi.java_study_01.ch05.inter;

public class SamsungPhone implements PhoneInterface {
    private String pName; //제품명
    private int pYear; //생산연도
	
    @Override
	public void sendCall() {
		System.out.println("띠리리리링");

	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");

	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜짐");
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpYear() {
		return pYear;
	}

	public void setpYear(int pYear) {
		this.pYear = pYear;
	}

	
}
