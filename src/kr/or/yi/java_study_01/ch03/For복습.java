package kr.or.yi.java_study_01.ch03;

public class For복습 {

	public static void main(String[] args) {
//		포1();
		
		for(int j=0; j<5 ; j++) {
			for (int u=0; u<j; u++) {
				System.out.print("뇸 ");
			}
			for(int i =0; i<5-j ;i++) {
			System.out.print("* ");
		   }System.out.println();
	    }	
		System.out.println();
		
		
		for(int j=0; j<5 ; j++) {
			for(int i=0; i<5-j ; i++) {
				System.out.print("* ");
		 }for(int u=0; u<j ;u++) {
			 System.out.print("뇸 ");
			
		 }
		 System.out.println();
		  
		}
		
		}
		
		
	

	private static void 포1() {
		for (int j=1; j<10; j++) {
			System.out.println("==="+j + "단==="); 
		for(int i=2; i<10; i++) {	
			System.out.printf("%d * %d = %d %n",j,i,j*i);
		  }
		}
	}

}
