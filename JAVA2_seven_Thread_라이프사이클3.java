package java2_seven_thread;

class SleepThread extends Thread{
	public void run() {
		System.out.println("ī��Ʈ�ٿ� 5��");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {//0�� ��쿡�� 1�ʸ� ��ٸ��� ����)
				try{
					Thread.sleep(1000);//thread�ȿ�sleep�޼ҵ带 ����Ͽ� 1�ʵ��� ����
				}catch (InterruptedException ie) {
					System.out.println(ie.toString());
					// TODO: handle exception
				}
				
			}
		}
		System.out.println("����");
		
	}
}
public class JAVA2_seven_Thread_����������Ŭ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t = new SleepThread();
		t.start();
	}

}
