package java2_seven_thread;
//yield()�޼��带 Ȱ���ϸ� ������ ���� �۾��� �ð��� �纸�Ͽ� �ٸ� �۾����� ����
class Mythread6 implements Runnable{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.print("+");
			Thread.yield();//�ڽſ��� �־��� �ð� �纸 //�ڽ��� block����
			//�纸�� ������ ���������� �и��ؼ� �������� �����°� �ƴ� �����̱��ϳ� �纸�ϴ� ������ �ִٴ� �ͤ�.��
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
