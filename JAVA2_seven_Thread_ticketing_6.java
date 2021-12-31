package java2_seven_thread;
class MyThreadA implements Runnable  {
	//tickting 객체 만들기	
	Ticketing ticket = new Ticketing();
	public void run() {
		ticket.ticketing();
	}
}
class  Ticketing{
	int ticketNumber = 1;
	public synchronized void ticketing() {//thread의 동기화 : synchronized 단어! 메서드에 얘만 붙이면 동시실행을 막을 수 있음
		//lock받은 애가 실행이 끝나야 다른애들이 실행됨.//즉 다른애들은 실행이 안됨->wait이 그래서 생겨남.
		//wait메소드는 중간에 함수를 실행하는것을 멈추고 lock을 반납해서 다른애들 실행하게 해줌.
		//notify메소드는 다시 lock을 얻을 수 있도록 하는 것임.
//	public void ticketing() {
		 
		if(ticketNumber>0) {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅성공");
			ticketNumber = ticketNumber-1;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패");
		
		}
		System.out.println(Thread.currentThread().getName()+"가 티케팅시도 후 티켓 수:"+ticketNumber);
		
	}
	

}
public class JAVA2_seven_Thread_ticketing_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadA s1 = new MyThreadA();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		Thread t3 = new Thread(s1);
		t1.start();
		/*
		try {
			t1.join();//t1을 제외한 다른 스레드 블록(block),t1가 완료될때까지 기다린다. 
		}catch (InterruptedException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
		*/
		t2.start();
		t3.start();
		//재고는 1인데 티켓팅을 3명이 도전함.
		//t1,t2,t3를 실행하면 -1,-2로 성공이 표시됨.왜냐하면 멀티스레드이기 때문임.동시실행이기때문에
		//두번째부터는 티켓팅실패라고 떠야함-> 
	}
//스레드의 동기화: 공통의 메서드에 대해 한 스레드가 먼저 작업을 하고 있으면 다른 스레드의 접근을 막음.
}
