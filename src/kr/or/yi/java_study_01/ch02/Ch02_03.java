package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Ch02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int pp =sc.nextInt();
		int 오만원권 = pp/50000;
		int 만원권 = (pp%50000)/10000;
		int 천원권 = ((pp%50000)%10000)/1000;
	    int 백원  =  (((pp%50000)%10000)%1000)/100;
	    int 오십원 = ((((pp%50000)%10000)%1000)%100)/50;
	    int 십원 =  (((((pp%50000)%10000)%1000)%100)%50)/10;
	    int 일원 = ((((((pp%50000)%10000)%1000)%100)%50)%10)/1;
		
	    System.out.printf("오만원권 %d매%n만원권 %d매%n천원권 %d매%n백원 %d개%n오십원 %d개%n십원 %d개%n일원 %d개%n",
	    		오만원권,만원권,천원권,백원,오십원,십원,일원);
		sc.close();
	}

}
