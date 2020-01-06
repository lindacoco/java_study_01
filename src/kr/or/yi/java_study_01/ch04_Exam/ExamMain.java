package kr.or.yi.java_study_01.ch04_Exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		// 학생정보를 관리하는 프로그램을 작성하세요 -student와 연결
		// 학생클래스를 정의 (번호, 성명, 국어, 영어, 수학) 15개의 학생정보를 담을 수 있는 배열
		// 메뉴 작성 1.학생목록 -배열에 들어간 학생 불러오기 2.학생추가 3.학생수정 4. 학생삭제 5.종료

	test();

		// 배열 틀 만들기
		Scanner sc = new Scanner(System.in);
		int res;
		Student[] stdArr = { new Student(1, "배진우", 80, 90, 80), new Student(2, "초초코", 80, 90, 80),
				new Student(3, "딸딸기", 40, 90, 80), new Student(4, "구아바", 50, 90, 80), new Student(5, "잠온다", 80, 90, 80),
				new Student(6, "바나나", 60, 90, 80), new Student(7, "장현서", 90, 90, 90), null, null, null, null, null,
				null, null, null };

//		for(int i =0; i<stdArr.length;i++) {
//			System.out.println(stdArr[i]);	
//		}

		do {

			System.out.print("1.학생목록  2.학생추가 3.학생수정  4.학생삭제 5.학생검색 6.종료");
			res = sc.nextInt();

			switch (res) {
			case 1:
				prnStudentInfo(stdArr);
				break;

			case 2:

				addStudent(stdArr, sc);
				prnStudentInfo(stdArr);
				break;

			case 3:

				updateStudent(stdArr, sc);
				break;

			case 4:

				deleteStudent(stdArr, sc);
				break;

			case 5:

				searchStudent(stdArr, sc);
				
			}
		} while (res < 6); // 5넘으면 종료

		System.out.println("학생관리 프로그램을 종료합니다. ");
		sc.close();

	}

	private static void searchStudent(Student[] stdArr, Scanner sc) {

		System.out.println("검색하고자 하는 학생의 번호를 입력하시오");
		int no = sc.nextInt();
		int searchStdIdx= indexOfStd(stdArr,no);
		
		if(searchStdIdx == -1) {
			System.out.println("해당 학생이 없습니다");
			return;
		}

		System.out.println("검색한 학생의 정보는 "+stdArr[searchStdIdx]);
	}

	private static int indexOfStd(Student[] stdArr, int stdNo) {
		for(int i =0; i<stdArr.length && stdArr[i] != null; i++) {
			if (stdArr[i].getStdNo() == stdNo) {
				return i;
			}
		}
		return -1;
	}

	private static void deleteStudent(Student[] stdArr, Scanner sc) {
		System.out.println("삭제 학생 번호 입력");
		int stdNo = sc.nextInt();
		int findIdx = indexOfStd(stdArr, stdNo);
		
		if (findIdx == -1) {
			System.out.println(" 해당학생이 없음");
			return;
		} 
		int i;
		for ( i = findIdx; i < stdArr.length - 1 && stdArr[i] != null; i++) {
			stdArr[i] = stdArr[i + 1];
		}
		stdArr[i - 1] = null;
		
		for(int j = 0; j < stdArr.length - 1 && stdArr[j] != null ; j++) {
			stdArr[j].setStdNo(j+1); 
		}
	}

	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("수정 학생 번호 입력");
		int stdNo = sc.nextInt();
		int findIdx = indexOfStd(stdArr, stdNo);
		
		if (findIdx == -1) {
			System.out.println(" 해당학생이 없음");
			return;
		} 
		System.out.print("학생 수정 순서대로 입력하세요 (국어, 영어, 수학) 스페이스로 구분");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		stdArr[findIdx].setKor(kor);
		stdArr[findIdx].setMath(math);
		stdArr[findIdx].setEng(eng);
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("순서대로 입력하세요 (성명, 국어, 영어, 수학) 스페이스로 구분 ");
		String stdName = sc.next();
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < stdArr.length; i++) {
			if (stdArr[i] == null) {
				cnt++;
			}
		}
		stdArr[cnt - 1] = new Student(cnt, stdName, kor, math, eng);

	}

	private static void prnStudentInfo(Student[] stdArr) {
		System.out.println("학생목록 구현");
		for (int i = 0; i < stdArr.length && stdArr[i] != null; i++) {
					System.out.println(stdArr[i]);			
		}
	}

	private static void test() {
		Student std01 = new Student(1, "배진우", 80, 90, 80);
		System.out.println(std01);

		Student std02 = new Student(2, "LeeDongJu ", 60, 90, 90);
		System.out.println(std02);

		// 배열 쓸래 효율적으로
		Student[] stdArr = { std01, std02 };
		for (Student d : stdArr) {
			System.out.println(d.getKor());
		}
	}

}
