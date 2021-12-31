package java2_seven_thread;

class SleepThread extends Thread{
	public void run() {
		System.out.println("카운트다운 5초");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {//0인 경우에는 1초를 기다리지 않음)
				try{
					Thread.sleep(1000);//thread안에sleep메소드를 사용하여 1초동안 멈춤
				}catch (InterruptedException ie) {
					System.out.println(ie.toString());
					// TODO: handle exception
				}
				
			}
		}
		System.out.println("종료");
		
	}
}
public class JAVA2_seven_Thread_라이프사이클3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t = new SleepThread();
		t.start();
	}

}
