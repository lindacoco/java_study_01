package kr.or.yi.java_study_01.ch04;

import java.util.Arrays;

public class Ch04Main2 {

	public static void main(String[] args) {
		Circle[] circleArr = {new Circle(1,"자바"),new Circle(2,"피자"),new Circle(3,"고르곤"),null,null};
		
		//디버깅 용도
//		System.out.println(Arrays.toString(circleArr)); //[null, null, null, null, null]
 //       circleArr[0] = new Circle(1, "자바피자");
		
        System.out.println(Arrays.toString(circleArr));
        //[Circle [반지름=1, 제품명=자바피자, 면적()=3.14], null, null, null, null]
	
        //함수로 만들어보자
        prnArr(circleArr);
        //1, 자바, 3.14
        //2, 피자, 12.56
        //3, 고르곤, 28.26
        
       //추가 
        int idx=2;
        circleArr[++idx] =new Circle(5,"빅피자");
        prnArr(circleArr);
	

	 //삭제
	int delNum =1; //1번을 삭제 2.피자를 
    circleArr[delNum] =null;
    for(int i =delNum ; i<circleArr.length-1; i++) {
    	circleArr[i] = circleArr[i+1];
    }
    prnArr(circleArr);
    
    
    //수정 
    System.out.println("====수정 =====================");
    //radius =4; name = "치즈피자" index =0
    circleArr[0].setRadius(4);
    circleArr[0].setName("치즈피자");
    prnArr(circleArr);
    
    
    //1, 자바, 3.14
    // null 1의 위치 삭제됨 
    // 3, 고르곤, 28.26

	}
	private static void prnArr(Circle[] circleArr) {
		for (Circle c : circleArr) {
			try {
				System.out.println(c);
			} catch (NullPointerException e) {
				System.out.print("null");  //3.14nullnullnullnull
			} 
		}
	}

}
