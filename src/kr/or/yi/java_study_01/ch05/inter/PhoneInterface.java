package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	// 상수, 추상메서드, 디폴트메서드만 선언가능
	public static final int TIMEOUT = 10000;   // 상수
	// public static final 인터페이스기 때문에 이게 없어도 인식함
	// int TIMEOUT =10000;

	public abstract void sendCall();          // 추상메서드
	/// public abstract 생략가능

	public abstract void receiveCall();                       // 추상메서드

	default void prnLogo() {
		System.out.println("**Phone**"); // 파일에 D가 붙어있는걸 확인할 수 있다 디폴트의 의미
	}
	
}
