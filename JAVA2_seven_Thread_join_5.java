package java2_seven_thread;
//sleep�� �ݴ� ����
//sleep�� ������ block�� ������Ŵ
//join�� �� ���� �ٸ��ֵ��� ������Ŵ
class MyThread8 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("t1:"+i);
		}
		System.out.println("<<<t1�Ϸ�>>>");
	}
}
class MyThread9 implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("t2:"+i);
		}
		System.out.println("<<<t2�Ϸ�>>>");
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
			t1.join();//t1�� ������ �ٸ� ������ ���(block),t1�� �Ϸ�ɶ����� ��ٸ���. 
		}catch (InterruptedException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
		
		t2.start();
		try {
			t2.join();//t2�� ������ �ٸ� ������ ���(block),t2�� �Ϸ�ɶ����� ��ٸ���. 
		}catch (InterruptedException e) {
			System.out.print(e.toString());
			// TODO: handle exception
		}
		for(int i=0; i<10;i++) {
			System.out.println("���ν�����:"+i);

		}
	}

}
