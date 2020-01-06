package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ScannerEX {

	public static void main(String[] args) {
	   System.out.print("이름,도시,나이,체중,독신여부를 빈칸으로 분리하여 입력하세요. >>");
		/* Scanner sc  패키지가 다를때 명시*/
	   Scanner sc= new Scanner(System.in);
	   
//	   System.out.println(sc.nextLine()); 있으면 출력 안됨
	   
	   String name = sc.next();
	   String city = sc.next();
	   int age = sc.nextInt();
	   double weight = sc.nextDouble();
	   boolean isSingle = sc.hasNextBoolean();
	   
	   System.out.printf("이름 %s 도시 %s 나이%d 체중 %.2f 독신여부 %b %n",
			      name, city, age, weight, isSingle);
	   sc.close();
	   
//	   System.out.println(sc.nextLine());

	}

}
