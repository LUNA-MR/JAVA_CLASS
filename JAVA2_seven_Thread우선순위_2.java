package java2_seven_thread;

 

//우선순위를 지정하지 않으면 기본이 5, 숫자가 높을수록 우선순위가 올라감.
//스레드 사용은 상속받거나 runnable을 구현하기
class MyThread3 implements Runnable{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("<" + Thread.currentThread().getName()+">");
		}
		for(int i = 0; i<1000;i++) {
			//시작 지연
		}
		System.out.println("---------------");
	}
}
public class JAVA2_seven_Thread우선순위_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우선순위를 정할 수는 있으나 상황에 맞춰서 실행되기때문에 절대적인 우선순위가 아니다 
		//가중치 부여개념, 절대적인 우선순위가 이님
		//메인여기의 순선는 항상 같음 위에 3개는 실행할때마다 결과순위가 다름
		 Runnable t = new MyThread3();
		 Thread t1 = new Thread(t,"thread1");
		 t1.setPriority(1);//우선 순위1로 지정
		 System.out.println("T1의 우선순위는:"+ t1.getPriority());
		 
		 Thread t2 = new Thread(t,"thread2");
		 //아무 우선 순위도 지정하지 않을 경우 우선순위 5
		 System.out.println("t2의 우선순위는:"+t2.getPriority());
		 
		 Thread t3 = new Thread(t,"threadd3");
		 t3.setPriority(10);//우선순위 10으로 지정
		 System.out.println("T3의 우선순위는:"+t3.getPriority());
		//이름지정 이유: 문자열 해당되는 스레드를 알수있음 왜냐 동일한 스레드를 3개나 하니까 어느스레드가 구현되는지 눈으로 확인하기 위해 
		//임으로 문자열을 하나 넣음.
		 
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
