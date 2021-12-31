package java2_seven_thread;
//lock���� �ְ� ������ ������ �ٸ��ֵ��� �����.//�� �ٸ��ֵ��� ������ �ȵ�->wait�� �׷��� ���ܳ�.
		//wait�޼ҵ�� �߰��� �Լ��� �����ϴ°��� ���߰� lock�� �ݳ��ؼ� �ٸ��ֵ� �����ϰ� ����.
		//notify�޼ҵ�� �ٽ� lock�� ���� �� �ֵ��� �ϴ� ����.
class Account{//account��� Ŭ������ ����
	int money= 0;
	public int showMoney() {
//	���� �����ִ� �ش� �޼ҵ� ����
	return money;
	}
	//�ΰ��� �޼ҵ� ��� synchornized�� �Ǿ� ���� 
	//�׸��� wait(�����)���� notify(����������� ������)�� ����
	//�̴� ����ȭ�� ���� ������ ����� �� ����.
	public synchronized void setMoney() {
		//�ѹ� ����ɶ� ���� ��Ӵϰ� ���� 2000���� �Ա���.
		try {
			Thread.sleep(1000);
		}catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println(ie.toString());
		}
		this.money+=2000;
		System.out.println("��Ӵϰ� �뵷�� �Ա��߽��ϴ�. ���� �ܾ�"+this.showMoney());
		this.notify();
	}
	public synchronized void getMoney() {
		if(money<=0) {
			try {
				System.out.println("���� �ܰ� ��� �Ƶ� ��� ��");
				this.wait();//�޼��带 ȣ���� ���� �ܴ�.
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			}this.money-=2000;
		}
		//��Ƽ ������� ������ ���� ����ɶ����� ��°��� �ٸ�
				//���࿡ getmoney�� ���� ����ɰ��, ������� ��µ� ->���α׷��� ����Ǹ� �ȵ� 10���� �����ؾ� �ϹǷ� wait�� �Ͽ� ������°� �Ǿ�
				//�ٸ� �޼ҵ���setmoney�� ����ǰ�, notify�� ����Ǿ, �ٽ� getmoney�� �����. 
		//0���� �۰ų� ������ �� ���� ���� ����ϰ�  wait�ϸ�  �ٸ� ����������lock�� �ݳ���.
		//�ش�Ǵ� ���� 0���� ũ�ٸ�2õ���� �����.
	}

class Son extends Thread{
//	�Ƶ��� 10�� �̰� 
	private Account account;
	Son(Account account){
		this.account = account;
	}
	public void run() {
		for(int i = 0; i<10;i++) {
			account.getMoney();
		}
	}
}
class Mom extends Thread{
//������ 10�� �Ա�
	private Account account; 
		Mom(Account account){
			this.account = account;
		}
		public void run() {
			for(int i = 0;i<10;i++) {
				account.setMoney();
			}
		}
		
	}

public class JAVA2_seven_Thread_lock_wait_notify_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
		}

}
