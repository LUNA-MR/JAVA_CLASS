package java2_seven_thread;
//프로세스: 실행중인 프로그램 자원(resources)과 thread로 구성
//thread : 프로세스 내에서 실제 작업을 수행
//모든 프로세스는 최소한 하나 이상의 쓰레드를 가지고 있다. 
//싱글 쓰레드 프로세스 : 자원 + 쓰레드
//멀티 쓰레드 프로세스: 자원+쓰레드+쓰레드+...+쓰레드
class MyThread extends Thread{
	public void run() {
		for( int i = 0; i<10;i++) {
			System.out.println("스레드 진행 중"+i);
		}
	}
}
class MyThread2 implements Runnable{//:runnalbe 인터페이스를 구현
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("러너블 진행 중"+i);
		}
	}
}
public class JAVA2_seven_Multi_threaded_process_1 {
//멀티스레드 : 하나의 프로세스 안에서 두 가지 이상의 일을 하도록 도와줌.
	//두가지 이상 프로세스->두가지 이상의 스레드가 필요
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();//Thread상속한 클래스
		Runnable th2 = new MyThread2();//Runnalbe 구현한 클래스
		Thread t = new Thread(th2);
		
		th1.start();
		t.start();
		for(int i = 0; i<10;i++) {
			System.out.println("메인 함수 진행 중"+i);
		}
	}

}
