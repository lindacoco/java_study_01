package kr.or.yi.java_study_01.ch03;

public class DoWhile {



	public static void main(String[] args) {
//		char c ='a';
//		
//		do {
//			System.out.print(c+" ");
//			c=(char)(c+1);
//		}while(c <='z');
//		
//		int i='a'-'A';
//		System.out.printf("%d %c",i,(char)i);

		
		
//		exceptfor5();
//		exceptfor5_1();
//		t5();
//		t55();
		
//		checkpoint3_3();
//		forwhiledowhile();
		
		even();
	}

	private static void even() {
	    int sum=0;
		for(int i = 1; i<101; i++) {
			if(i%2==0) {
				sum =sum+i;
				
			}
		}System.out.println(sum);
		
	}

	private static void forwhiledowhile() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<101; i++) {
			     sum=sum+i;
		}System.out.printf("전체합은 %d",sum);
		   int i = 1;
		   int even = 0;
		   while(i%2==0) {
				System.out.print("짝수합을 구하시오");
				even = even+i;
				i++;
				if (i>101) break;
			}System.out.printf("짝수합은 %d",even);
			
		
	}

	private static void checkpoint3_3() {
		// 1부터 100까지 3의배수의 합 
		int sum=0;
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				
				sum= sum+i;
			}
		}System.out.println(sum);
		
	}

	private static void t55() {
		for(int i=1; i<10; i++) {
			for(int dan=2;dan<10; dan++) {
	                 if(dan>5)
	                	 break;
	                 System.out.printf("%d*%d = %2d ",dan,i,dan*i);         
			}
			if(i>=5)
				break;
			System.out.println();
		
		}
		
	}

	private static void t5() {
		for(int j=1; j<10; j++) {
			for(int i=2;i<10; i++) {
	                 if(j>5)
	                	 break;
	                 System.out.printf("%d*%d = %2d ",i,j,j*i);
	                 
			}System.out.println();
		
		}
	}

	private static void exceptfor5_1() {
		for(int j=1; j<10; j++) {
			for(int i=2;i<10; i++) {
	                 if(j==5)
	                	 continue;
	                 System.out.printf("%d*%d = %2d ",i,j,j*i);
	                 
			}
			if(j != 5)
			System.out.println();
		  }
		
	}

	private static void exceptfor5() {
        // 2*1 2*2 2*3 2*4 2*6..
		for(int j=2; j<10; j++) {
		for(int i=1;i<10; i++) {
                 if(i==5)
                	  continue;
                 System.out.printf("%d*%d = %2d ",j,i,j*i);
                 
		}System.out.println();
	  }
		
		
	}
}
