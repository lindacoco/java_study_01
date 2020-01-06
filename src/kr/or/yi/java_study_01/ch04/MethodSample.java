package kr.or.yi.java_study_01.ch04;

public class MethodSample {

	public static void main(String[] args) {
		MethodSample a = new MethodSample();
		
		int i = a.getSum(1,2);
		int j = a.getSum(1,2,3);
		double k =a.getSum(1.1, 2.2);
		
	System.out.println(i);

	}

	private double getSum(double d, double e) {
		// TODO Auto-generated method stub
		return d +e;
	}

	private int getSum(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}

	private int getSum(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
