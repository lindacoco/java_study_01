package kr.or.yi.java_study_01.ch03;

public class ForLoop02_01 {

	public static void main(String[] args) {
//    별 찍기
//		별찍기01();
		
		
//		별찍기123();
		
		
		for (int j =0; j<5; j++) {
			for (int i=0; i<5-j; i++) {
				System.out.print("* ");
			   }
			  System.out.println();
		}
		
		
	}

	private static void 별찍기123() {
		for (int j =0; j<5; j++) {
			for (int i=0; i<j+1; i++) {
				System.out.print("* ");
			   }
			  System.out.println();
		}
	}

	private static void 별찍기01() {
		for (int j =0; j<5; j++) {
		for (int i=0; i<5; i++) {
			System.out.print("* ");
		   }
		  System.out.println();
		}
	}

}
