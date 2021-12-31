package java2_third;

 

public class JAVA2_Three_Class_TV {
	private static final int MIN_CHANNLE = 0;
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void turnOnOFF() {
		//(1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		 
	}
	void VolumeUP() {
		//(2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다. 
		if ( volume < MAX_VOLUME) {
			volume += 1;
	}
	}
	void volumeDown() {
		//(3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
		if(volume > MIN_VOLUME) {
			volume -= 1;
		}
	}
	void channelUp() {
		//(4)channel의 값을 1 증가시킨다. 
		//만일 channel이 MAX_CHANNEL이면,channel이 값을 MIN_CHANNEL로 바꾼다. 
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNLE;
	}
	}
	void channelDown() {
		//(5)channel의 값을 1 감소시킨다. 
		//만약 channel MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다. 
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
	}
//clas MYtv
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAVA2_Three_Class_TV t = new JAVA2_Three_Class_TV();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel+",VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH : " + t.channel+",VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.VolumeUP();
		System.out.println("CH : " + t.channel+",VOL:" + t.volume);
	}

}
