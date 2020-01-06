package kr.or.yi.java_study_01.ch04_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
     
       
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
//       q6(sc);
//       q7();
//		 q8();
		
//       homework01();
//		 homework02();
//       homework03();
		
        sc.close();
		
	}

	private static void homework03() {
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값"+ Max.max(data));
		System.out.println("최대값"+ Max.max(null));
		System.out.println("최대값"+ Max.max(new int[]{}));
	}

	private static void homework02() {
		MyTv t = new MyTv();
		t.setChannel(100);
		t.setVolume(0);
		System.out.println("CH:"+ t.getChannel()+", Vol:"+t.getVolume());
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+ t.getChannel()+", Vol:"+t.getVolume());
		
		t.setVolume(100);
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+ t.getChannel()+", Vol:"+t.getVolume());
	}

	private static void homework01() {
		Student st = new Student();
		st = new Student("장현서",1,30,70,100);
		System.out.println(st.getTotal());
		System.out.println(st.getAverage());
	}

	private static void q8() {
		PhoneBook d = new PhoneBook();
		d.run();
	}

	private static void q7() {
		MonthSchedule ms = new MonthSchedule(30);
		ms.run();
	}

	private static void q6(Scanner sc) {
		Circle[]  circles = new Circle[3];
  //      3.0 3.0 5 2.5 2.7 6 5.0 2.0 4
        double x;
        double y;
        int radius;
        for(int i =0; i<circles.length; i++) {
        	System.out.println("x,y,radius>>");
        	x = sc.nextDouble();
        	y = sc.nextDouble();
        	radius = sc.nextInt();
        	circles[i] =new Circle(x,y,radius);
        }
        System.out.println(Arrays.toString(circles));
		
        int bigCircleIdx =0;
        for(int i =0; i<circles.length;i++) {
        	if(circles[bigCircleIdx].getArea() <circles[i].getArea() ) {
        		bigCircleIdx =i;
        	}
        }
        System.out.println("가장 큰 면적인 원은" + circles[bigCircleIdx]);
	}

}
