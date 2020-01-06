package kr.or.yi.java_study_01.ch04_Homework;

public class MyTv {
  private boolean isPowerOn;
  private int channel;
  private int volume;
  
  int MAX_VOLUME =100;
  int MIN_VOLUME =0;
  int MAX_CHANNEL = 100;
  int MIN_CHANNEL =1;
	
	void turnOnOff(boolean isPowerOn) {
		if(isPowerOn == true) {
			isPowerOn = false;
		}else {
			isPowerOn = true;
		}
	}
	void volumeUp() {
		if(volume < MAX_VOLUME) {
			++volume;
		}
	}
	void volumeDown() {
		if(volume > MIN_VOLUME ) {
			--volume;
		}
	}
	void channelUp() {
		
		if(channel == MAX_CHANNEL ) {
			channel = MIN_CHANNEL;
		}channel ++;
	}
	void channelDown() {
		channel --;
		if(channel == MIN_CHANNEL ) {
			channel = MAX_CHANNEL;
		}
	}
	public MyTv() {
		// TODO Auto-generated constructor stub
	}
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	public void setMAX_VOLUME(int mAX_VOLUME) {
		MAX_VOLUME = mAX_VOLUME;
	}
	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	public void setMIN_VOLUME(int mIN_VOLUME) {
		MIN_VOLUME = mIN_VOLUME;
	}
	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}
	public void setMAX_CHANNEL(int mAX_CHANNEL) {
		MAX_CHANNEL = mAX_CHANNEL;
	}
	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}
	public void setMIN_CHANNEL(int mIN_CHANNEL) {
		MIN_CHANNEL = mIN_CHANNEL;
	}
	
	
}
