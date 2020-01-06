package kr.or.yi.java_study_01.ch03.array;

public class 복습2 {

	public static void main(String[] args) {
		double score [][] = {{3.3, 3.4}, {3.5, 3.6},{3.7, 4.0},{4.1, 4.2}};
		
			double yearSum =0;
			for (int year = 0; year < score.length; year++) {
			System.out.print(year+1 + "학년 ");
			yearSum = 0;
			for (int term = 0; term < score[year].length; term++) {
			
				yearSum += score[year][term];
			}
			System.out.printf("%.2f %n", yearSum / 2.0);
			}
						

	}

}
