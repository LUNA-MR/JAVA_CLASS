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
		//(1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
		 
	}
	void VolumeUP() {
		//(2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1 ������Ų��. 
		if ( volume < MAX_VOLUME) {
			volume += 1;
	}
	}
	void volumeDown() {
		//(3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1 ���ҽ�Ų��.
		if(volume > MIN_VOLUME) {
			volume -= 1;
		}
	}
	void channelUp() {
		//(4)channel�� ���� 1 ������Ų��. 
		//���� channel�� MAX_CHANNEL�̸�,channel�� ���� MIN_CHANNEL�� �ٲ۴�. 
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNLE;
	}
	}
	void channelDown() {
		//(5)channel�� ���� 1 ���ҽ�Ų��. 
		//���� channel MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�. 
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
