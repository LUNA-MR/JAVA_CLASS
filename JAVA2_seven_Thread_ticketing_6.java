package java2_seven_thread;
class MyThreadA implements Runnable  {
	//tickting ��ü �����	
	Ticketing ticket = new Ticketing();
	public void run() {
		ticket.ticketing();
	}
}
class  Ticketing{
	int ticketNumber = 1;
	public synchronized void ticketing() {//thread�� ����ȭ : synchronized �ܾ�! �޼��忡 �길 ���̸� ���ý����� ���� �� ����
		//lock���� �ְ� ������ ������ �ٸ��ֵ��� �����.//�� �ٸ��ֵ��� ������ �ȵ�->wait�� �׷��� ���ܳ�.
		//wait�޼ҵ�� �߰��� �Լ��� �����ϴ°��� ���߰� lock�� �ݳ��ؼ� �ٸ��ֵ� �����ϰ� ����.
		//notify�޼ҵ�� �ٽ� lock�� ���� �� �ֵ��� �ϴ� ����.
//	public void ticketing() {
		 
		if(ticketNumber>0) {
			System.out.println(Thread.currentThread().getName()+"�� Ƽ���ü���");
			ticketNumber = ticketNumber-1;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"�� Ƽ���� ����");
		
		}
		System.out.println(Thread.currentThread().getName()+"�� Ƽ���ýõ� �� Ƽ�� ��:"+ticketNumber);
		
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
			t1.join();//t1�� ������ �ٸ� ������ ���(block),t1�� �Ϸ�ɶ����� ��ٸ���. 
		}catch (InterruptedException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
		*/
		t2.start();
		t3.start();
		//���� 1�ε� Ƽ������ 3���� ������.
		//t1,t2,t3�� �����ϸ� -1,-2�� ������ ǥ�õ�.�ֳ��ϸ� ��Ƽ�������̱� ������.���ý����̱⶧����
		//�ι�°���ʹ� Ƽ���ý��ж�� ������-> 
	}
//�������� ����ȭ: ������ �޼��忡 ���� �� �����尡 ���� �۾��� �ϰ� ������ �ٸ� �������� ������ ����.
}
