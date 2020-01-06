package kr.or.yi.java_study_01.ch04;

public class Ch04Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(); //생성자인 오른쪽 의미! 

		//c1이 가리키는 곳에가보면 Circle타입이 있다.....
		
//		ch04_01(c1);
		
//		ch04_02();
		
//	    ch04_03();
		
//      ch04_04();
		
		
//		Book book1 = new Book();
//		System.out.println(book1); //투 스트링으로 오버라이딩 했기 때문에 나온다.
//		//Book [title=춘향전, author=작자미상]
		
		
	}

	private static void ch04_04() {
		Circle ob1 = new Circle(1); //ctl space 사용할 수 있는 생성자 나옴 
		Circle ob2 = new Circle(2);
		Circle ob3 = new Circle(3);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		ob1.setRadius(4);
		ob2.setRadius(5);
		ob3.setRadius(6);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

	private static void ch04_03() {
		Book littlePrince =new Book("어린왕자","생택쥐베리");
		  Book loveStory = new Book("춘향전");
		  
		  Book book2 = new Book();
		  System.out.printf("%s : %s %n",littlePrince.title,littlePrince.author); //어린왕자 : 생택쥐베리 
		  System.out.printf("%s : %s %n",loveStory.title,loveStory.author);	 //춘향전 : 작자미상 
		  
		  System.out.println(littlePrince); //kr.or.yi.java_study_01.ch04.Book@4aa298b7 JVM상에서 정의 Object 상에서
			//alt shift s 로 toString추가해버림 
		  
		  //Book [title=어린왕자, author=생택쥐베리]
	}

	private static void ch04_02() {
		Rectangle rect = new Rectangle();
		
		rect.width =4;
		rect.height =5;
		System.out.printf("사각형의 면적은 %d %n",rect.getArea());
	
	   Rectangle rect2 = new Rectangle(5,5);
	   System.out.printf("사각형의 면적은 %d %n",rect.getArea());
	}

	private static void ch04_01(Circle c1) {
		c1.name = "구아바";
		c1.radius =100;
		
//		 System.out.printf("이름 %s 반지름 %d 면적 %.2f %n",c1.name,c1.radius,c1.getArea());
		 System.out.println(c1);
		 
		 //((Circle)c2) 괄호로 우선순위 높여서 타입캐스트 먼저 하고 . 수행
		 Object c2 = new Circle();
		 ((Circle)c2).name = "스타프룻";
		 ((Circle)c2).radius = 50;
		 
//		 System.out.printf("이름 %s 반지름 %d %n",((Circle)c2).name,((Circle)c2).radius);
		 System.out.println(c2);
		 
		 Circle c3 = new Circle(30, "시카고피자");
		 System.out.println(c3);
	}

}
