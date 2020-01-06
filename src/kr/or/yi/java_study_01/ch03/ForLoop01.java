package kr.or.yi.java_study_01.ch03;

public class ForLoop01 {

	public static void main(String[] args) {
//		hardCoding();
// for(초기화;조건식;증감식)		
//		for_Loop01();

//	    2*2=4 ..2*9=
//		int dan =2;
//		for (int dan =2; dan<10; dan++) {
//			System.out.println("==== " + dan + " ====");
//			gugudan(dan); //이중루프

//		}
		
//      1부터 100까지 짝수만 출력하시오
		for (int i=1; i<11; i++) {
			if (i % 2 == 0) {
		
			System.out.printf("%d ",i);
		   }
		 }
		System.out.println();
		for (int i=2; i<11; i=i+2) {
			System.out.printf("%d ",i);  //이게 더 효율적
		   }
		System.out.println();
//      1부터 100까지 홀수만 출력하시오			
		for (int i=1; i<11; i++) {
			if (i % 2 == 1) {
		
			System.out.printf("%d ",i);
		   }
		 }
		System.out.println();
		for (int i=1; i<11; i=i+2) {
			System.out.printf("%d ",i);
		   }
		System.out.println();
		
	

    
//   극단적인 예	
	   for (int i=1; i<11; i=i+2, System.out.printf("%d ",i));
		
	
//		for (int i=1; i<10; i++) {
//		for(int dan=2; dan<10; ++dan) {
//			System.out.printf("%d * %d = %2d ",dan,i,dan*i);  //두자리 %2d로 
//		 }
//		System.out.println(); //줄바꿈만시켜주는 코드  없으면 한줄에 나오게됨 
		
     
		
	}

	private static void gugudan(int dan) {
		for(int i =1; i<10; i++) {
			   System.out.printf("%d * %d = %d %n",dan,i,dan*i);
		   }
	}
	
	private static void for_Loop01() {
		for(int a =0; a<10 ; a++) {
			System.out.println("Hello Java" + a);
		}
       System.out.println("done");
	}

	private static void hardCoding() {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
	}

}
