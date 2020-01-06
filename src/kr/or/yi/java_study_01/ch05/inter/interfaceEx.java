package kr.or.yi.java_study_01.ch05.inter;

public class interfaceEx {

	public static void main(String[] args) {
		SamsungPhone galaxy10 = new SamsungPhone();
		PhoneInterface galaxyNote = new SamsungPhone();
		
		galaxy10.setpName("갤럭시10");
		galaxy10.setpYear(2019);
		
		galaxyNote.prnLogo();
		galaxyNote.receiveCall();
		galaxyNote.sendCall();
		
		galaxy10.prnLogo();
		galaxy10.sendCall();
		galaxy10.receiveCall();
        HwaweiPhone Hi = new HwaweiPhone();
        Hi.prnLogo();
	}

}
