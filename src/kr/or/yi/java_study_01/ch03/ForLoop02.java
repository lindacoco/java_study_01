package kr.or.yi.java_study_01.ch03;

public class ForLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//    1부터 100가지의 짝수합과 홀수합, 전체합을 구하는 반복문을 작성하시오
		
		int sum=0;
		
		for(int i=1; i<11; i++) {
			sum = sum + i;		
		}
		   System.out.println(sum);
		
		
		int even =0;
		int odd = 0;
		for(int i=0; i<101; i++) {
			if(i % 2 ==0) {
				even= even+i;
			}else {
				odd= odd+i;
			}
		}
		System.out.printf("홀수의 합 %d 짝수의 합 %d 전체의 합 %d %n",odd,even,odd+even);
			
		}
		
	}


