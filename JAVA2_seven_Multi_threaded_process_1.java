package java2_seven_thread;
//���μ���: �������� ���α׷� �ڿ�(resources)�� thread�� ����
//thread : ���μ��� ������ ���� �۾��� ����
//��� ���μ����� �ּ��� �ϳ� �̻��� �����带 ������ �ִ�. 
//�̱� ������ ���μ��� : �ڿ� + ������
//��Ƽ ������ ���μ���: �ڿ�+������+������+...+������
class MyThread extends Thread{
	public void run() {
		for( int i = 0; i<10;i++) {
			System.out.println("������ ���� ��"+i);
		}
	}
}
class MyThread2 implements Runnable{//:runnalbe �������̽��� ����
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("���ʺ� ���� ��"+i);
		}
	}
}
public class JAVA2_seven_Multi_threaded_process_1 {
//��Ƽ������ : �ϳ��� ���μ��� �ȿ��� �� ���� �̻��� ���� �ϵ��� ������.
	//�ΰ��� �̻� ���μ���->�ΰ��� �̻��� �����尡 �ʿ�
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();//Thread����� Ŭ����
		Runnable th2 = new MyThread2();//Runnalbe ������ Ŭ����
		Thread t = new Thread(th2);
		
		th1.start();
		t.start();
		for(int i = 0; i<10;i++) {
			System.out.println("���� �Լ� ���� ��"+i);
		}
	}

}
