package kr.or.yi.java_study_01.ch04_Exam;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Scanner;

public class Ch04QMain {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int res;
		
//		q1();
//		q2(sc);
//		q3();
//      q4();  
//      q5(sc);
//      q6(sc);
//      q7();

       int num = sc.nextInt();
       PhoneBook pp = new PhoneBook(num);
       
    
		sc.close();	
		
	}




	private static void q7() {
		MonthSchedule december =new MonthSchedule(31);
		  december.run();
	}

	private static void q6(Scanner sc) {
		Circle c[] = new Circle[3];
		  for(int i=0; i<c.length; i++) {
			  System.out.print("x,y,radius >>");
			  double x =sc.nextDouble();
			  double y =sc.nextDouble();
			  int radius =sc.nextInt();		  
			  c[i] = new Circle(x,y,radius);		  
		  }
		  for(int i=0; i<c.length; i++) {	   
			  int findIdx = find(c,i);		 
			  if(findIdx == c[i].getRadius()) {
				  System.out.print("가장 면적이 큰 원은"+ c[i]);  
			  }
			  
		  }
	}
     //p133
	private static int find(Circle[] c, int i) {
		int max=0;
		int array[] = new int [3];
		for(int j =0; j<c.length; j++) {
		 array[j] = c[j].getRadius();
			 if(array[j] > max) {
				 max = array[j];
			 }
		}
		return max;
	
	}

	private static void q5(Scanner sc) {
		Circle c[] = new Circle[3];
		  for(int i=0; i<c.length; i++) {
			  System.out.print("x,y,radius >>");
			  double x =sc.nextDouble();
			  double y =sc.nextDouble();
			  int radius =sc.nextInt();
			  
			  c[i] = new Circle(x,y,radius);
			  
		  }
		  for(int i=0; i<c.length; i++) {
			  System.out.println(c[i]);
		  }
	}

	private static void q4() {
		  Rectangle r = new Rectangle(2, 2, 8, 7);
		  Rectangle s = new Rectangle(5, 5, 6, 6);
		  Rectangle t = new Rectangle(1, 1, 10, 10);
	
		  r.show();
		  System.out.println("s의 면적은"+s.square());
		  if(t.contains(r)) System.out.println("t는 r을 포함합니다");
		  if(t.contains(s)) System.out.println("t는 s를 포함합니다");
	}

	private static void q3() {
		
		Song ss = new Song("Dacing Queen","ABBA",1978,"스웨덴");
        ss.show();
	}

	private static void q2(Scanner sc) {
		System.out.print("수학,과학,영어순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english =sc.nextInt();
		
		Grade me = new Grade(math,science,english);
		System.out.println("평균은"+me.average());
	}

	private static void q1() {
		TV myTV= new TV("LG",2017,32);
		myTV.show();
	}

}
