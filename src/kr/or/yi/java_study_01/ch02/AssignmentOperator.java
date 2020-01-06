package kr.or.yi.java_study_01.ch02;

public class AssignmentOperator {

	public static void main(String[] args) {
//		assignmentIncDec();
//		logicalOperator();
		ternaryOperator();
		System.out.printf("%04x%n",10);  // 4칸이고 0으로 채워라 ,없으면 그냥 네자리가 됨 앞에 세칸띄워진채 .. 16진수로 표시해달라 92쪽 -000a
		System.out.printf("%4x%n",10);   //    a
		System.out.printf("%x%n",10);    //a
	}

	private static void ternaryOperator() {
		int a=3;
		int b=5;  // a와 b 값을 반대로 바꾸더라도 같은 결과 두수의 차는2로 출력
		
		int res= a> b ? a-b : b-a;
		System.out.printf("두수의 차는%d%n",res );
	    System.out.println("두수의 차는 "+ ((a> b) ? (a-b) : (b-a)));
	}

	private static void logicalOperator() {
		System.out.println('a'>'b');    //false
		System.out.println(3 >=2);      //true
		System.out.println(-1 <0);      //true
		System.out.println(3.45 <=2);   //false
		System.out.println(3 ==2);      //false
		System.out.println(3 != 2);     //true
		System.out.println(!(3 !=2));   //false
		
		System.out.println((3>2) && (3>4));   //false
		System.out.println((3!=2) || (-1 > 0)); //true
		System.out.println((3!=2) ^(-1 > 0));   //true
		
	}

	private static void assignmentIncDec() {
		int a=3, b=3, c=3;
		
		a += 3;   // a= a+ 3
		b *= 3;   // b = b *3
		c %= 2;   // c= c%2 
		System.out.printf("a=%d, b=%d, c=%d%n" , a, b ,c ); //a=6, b=9, c=1

		
		int d=3;
		a = d++;  // a =3, d =4
		System.out.printf("a=%d b=%d%n",a,d);
		
		a = ++d;
		System.out.printf("a=%d b=%d%n",a,d);
		
		a= d--;
		System.out.printf("a=%d b=%d%n",a,d);
		
		a = --d;
		System.out.printf("a=%d b=%d%n",a,d);
	}

}
