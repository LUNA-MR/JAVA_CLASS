package java2_seven_thread;
//sleep의 반대 개념
//sleep은 본인이 block등 지연시킴
//join은 나 말고 다른애들을 지연시킴
class MyThread8 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("t1:"+i);
		}
		System.out.println("<<<t1완료>>>");
	}
}
class MyThread9 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("t2:"+i);
		}
		System.out.println("<<<t2완료>>>");
	}
}
public class JAVA2_seven_Thread_join_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8 s1 = new MyThread8();
		MyThread9 s2 = new MyThread9();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		try {
			t1.join();//t1을 제외한 다른 스레드 블록(block),t1가 완료될때까지 기다린다. 
		}catch (InterruptedException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
		
		t2.start();
		try {
			t2.join();//t2를 제외한 다른 스레드 블록(block),t2가 완료될때까지 기다린다. 
		}catch (InterruptedException e) {
			System.out.print(e.toString());
			// TODO: handle exception
		}
		for(int i=0; i<10;i++) {
			System.out.println("메인스레드:"+i);

		}
	}

}
