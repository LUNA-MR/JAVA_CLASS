package java2_seven_thread;

 

//�켱������ �������� ������ �⺻�� 5, ���ڰ� �������� �켱������ �ö�.
//������ ����� ��ӹްų� runnable�� �����ϱ�
class MyThread3 implements Runnable{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("<" + Thread.currentThread().getName()+">");
		}
		for(int i = 0; i<1000;i++) {
			//���� ����
		}
		System.out.println("---------------");
	}
}
public class JAVA2_seven_Thread�켱����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�켱������ ���� ���� ������ ��Ȳ�� ���缭 ����Ǳ⶧���� �������� �켱������ �ƴϴ� 
		//����ġ �ο�����, �������� �켱������ �̴�
		//���ο����� ������ �׻� ���� ���� 3���� �����Ҷ����� ��������� �ٸ�
		 Runnable t = new MyThread3();
		 Thread t1 = new Thread(t,"thread1");
		 t1.setPriority(1);//�켱 ����1�� ����
		 System.out.println("T1�� �켱������:"+ t1.getPriority());
		 
		 Thread t2 = new Thread(t,"thread2");
		 //�ƹ� �켱 ������ �������� ���� ��� �켱���� 5
		 System.out.println("t2�� �켱������:"+t2.getPriority());
		 
		 Thread t3 = new Thread(t,"threadd3");
		 t3.setPriority(10);//�켱���� 10���� ����
		 System.out.println("T3�� �켱������:"+t3.getPriority());
		//�̸����� ����: ���ڿ� �ش�Ǵ� �����带 �˼����� �ֳ� ������ �����带 3���� �ϴϱ� ��������尡 �����Ǵ��� ������ Ȯ���ϱ� ���� 
		//������ ���ڿ��� �ϳ� ����.
		 
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
