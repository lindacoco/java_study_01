package kr.or.yi.java_study_01.ch04;

public class Circle { //extends object  생략
 //설계도  멤버변수가 두개인            ..//클래스 
	public int radius; //빨간집  0으로 초기화     //필드. 밑에 지역변수에 this없으면 지역변수가 더 우선순위 높다.
	public String name; //파란집  null로 초기화
		

	public Circle() {
		//super(); 생략되어있음 부모생성자 호출 this 쓸때 충돌 
		
	}
		
	public Circle(String name) { //하나만 받고 omit으로 super 생략 생성자 3개가 됨. 
		this.name = name;
	}

	public Circle(int radius, String name) { //생성자 overloading
		super();
		this.radius = radius;  //this는 나 자신을 의미한다. 나 자산의 radius 지역변수..에 필드의 radius를 저장해라 
		this.name = name;
	}
	
	
	
 public Circle(int radius) {
		this.radius = radius;
	}

	//194 
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %.2f", radius, name, getArea());
	} //나도 toString을 가지고 있게된다.  

	
	

}
