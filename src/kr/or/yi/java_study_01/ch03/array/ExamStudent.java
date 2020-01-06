package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class ExamStudent {

	public static void main(String[] args) {
		//1. 12명의 국어, 영어, 수학 점수를 담는 2차원 배열 선언 
		Random rnd = new Random(12345);
		int score[][]= new int [12][3];
		
		
		String name[] = {"차은우1","신세경1","유인나1","차은우2","신세경2","유인나2","차은우3","신세경3","유인나3","차은우4","신세경4","유인나4"};
		int sum = 0;
		int average = 0; 
		double kor = 0;
		double eng = 0;
		double math = 0;
		for(int i =0; i<score.length; i++) {
			sum=0;
			average=0;
			System.out.print("이름: "+name[i]+"의 점수 (국어, 영어, 수학, 총점 ,평균 ):");

			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (rnd.nextInt(40) + 60);
				System.out.print(score[i][j] + " ");
				sum = sum + score[i][j];
				average = (sum / score[i].length);

				if (j == 0) {
					kor = kor + score[i][j];
				}
				if (j == 1) {
					eng = eng + score[i][j];
				}
				if (j == 2) {
					math = math + score[i][j];
				}
			}
			System.out.print(sum + " ");
			System.out.println(average);
			System.out.println();
			
		}System.out.print("국어 전체 평균 ");
		System.out.printf("%.2f %n",kor/score.length);
		System.out.print("영어 전체 평균 ");
		System.out.printf("%.2f %n",eng/score.length);
		System.out.print("수학 전체 평균 ");
		System.out.printf("%.2f %n",math/score.length);
		
	}

}
