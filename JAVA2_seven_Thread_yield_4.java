package java2_seven_thread;
//yield()메서드를 활용하면 급하지 않은 작업의 시간을 양보하여 다른 작업부터 수행
class Mythread6 implements Runnable{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.print("+");
			Thread.yield();//자신에게 주어진 시간 양보 //자신이 block상태
			//양보는 하지만 절대적으로 분리해서 마지막에 나오는건 아님 랜덤이긴하나 양보하는 측면이 있다는 것ㅇ.ㅁ
		}
	}
}
class Mythread7 implements Runnable{
	public void run() {
		for(int i = 0;i<30;i++) {
			System.out.print("*");
		}
	}
}

public class JAVA2_seven_Thread_yield_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread6 s1 = new Mythread6();
		Mythread7 s2 = new Mythread7();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t2.start();
		t1.start();
	}

}
