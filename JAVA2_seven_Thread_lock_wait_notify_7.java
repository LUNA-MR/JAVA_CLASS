package java2_seven_thread;
//lock받은 애가 실행이 끝나야 다른애들이 실행됨.//즉 다른애들은 실행이 안됨->wait이 그래서 생겨남.
		//wait메소드는 중간에 함수를 실행하는것을 멈추고 lock을 반납해서 다른애들 실행하게 해줌.
		//notify메소드는 다시 lock을 얻을 수 있도록 하는 것임.
class Account{//account라는 클래스를 만듬
	int money= 0;
	public int showMoney() {
//	돈을 보여주는 해당 메소드 있음
	return money;
	}
	//두가지 메소드 모두 synchornized가 되어 있음 
	//그리고 wait(대기해)대기와 notify(대기하지말고 실행해)가 있음
	//이는 동기화를 하지 않으면 사용할 수 없음.
	public synchronized void setMoney() {
		//한번 실행될때 마다 어머니가 돈을 2000원씩 입금함.
		try {
			Thread.sleep(1000);
		}catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println(ie.toString());
		}
		this.money+=2000;
		System.out.println("어머니가 용돈을 입금했습니다. 현재 잔액"+this.showMoney());
		this.notify();
	}
	public synchronized void getMoney() {
		if(money<=0) {
			try {
				System.out.println("통장 잔고가 없어서 아들 대기 중");
				this.wait();//메서드를 호출한 놈이 잔다.
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			}this.money-=2000;
		}
		//멀티 스레드는 순서가 없음 실행될때마다 출력값이 다름
				//만약에 getmoney가 먼저 실행될경우, 대기중이 출력됨 ->프로그램이 종료되면 안됨 10번을 실행해야 하므로 wait을 하여 멈춤상태가 되어
				//다른 메소드인setmoney가 실행되고, notify가 실행되어서, 다시 getmoney가 실행됨. 
		//0보다 작거나 같으면 즉 돈이 없어 대기하고  wait하면  다른 스레드한테lock을 반납함.
		//해당되는 돈이 0보다 크다면2천원씩 출금함.
	}

class Son extends Thread{
//	아들은 10번 뽑고 
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
//엄마는 10번 입금
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
