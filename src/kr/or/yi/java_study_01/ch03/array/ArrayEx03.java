package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = {5,4,3,2,1};
		prnArray(intArr); // 5 4 3 2 1   
        sort(intArr); //정렬수행
        prnArray(intArr); // 1 2 3 4 5 출력
        
        
        
        //무조건 중첩 loop for 안의 for
        //앞 값이 크면 교환
	}

	private static void sort(int[] intArr) {
//		for(int i =0; i<intArr.length;i++) {
//		    System.out.println(intArr[(0+1)]);
//			for(int j =0; j<intArr.length;j++) {
//				     int temp = intArr[j];		
//		for (int j = 0; j < intArr.length; j++) {
//			for (int i = 0; i < intArr.length; i++) {
//				int temp = intArr[i];
//				if (intArr[i] > intArr[(i + 1)]) {
//					intArr[i] = intArr[(i + 1)];
//					intArr[i+1] = temp;
//					if ((i + 1) == intArr.length) {
//						break;
//					}
//					System.out.printf("%d", intArr[i]);
//				}
//				System.out.print(temp);
////					System.out.print(intArr[i]);
//			}
//		}
//				}System.out.print(intArr[j]);
//			}
//		}	
    	    
		    for(int j =0; j<intArr.length;j++) {
		    	    int temp=0;
		    	 for(int i=1; i<intArr.length; i++) {
		    		 if(intArr[i-1]> intArr[i]) {
		    			 temp = intArr[i-1];
		    			 intArr[i-1]=intArr[i];
		    			 intArr[i]=temp;
		    		 }
//		    		 else {
//		    			 continue;
//		    		 }
		    	    } 	    	 
		    	 }
	       }   

	private static void prnArray(int[] intArr) {
		for(int i =0; i<intArr.length;i++) {
			System.out.print(intArr[i]);
		}
		System.out.println();
	}

}
