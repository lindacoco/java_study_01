package kr.or.yi.java_study_01.ch04_Exam;

class Day {
   private String work;
   
   
   
   public void set(String work) {
	   this.work = work;
   }
public String getWork() {
	return work;
}

public void show() {
	if(work ==null) {
		System.out.println("없습니다");
	}else {
		System.out.println(work +"입니다");
	}
}
   
}
