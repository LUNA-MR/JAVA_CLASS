package four;
//반복하는 동안 걸리는 시간 
//1970.1.1을 기준으로 몇초 걸렸는지를 보기때문에 새로고침 해서 할때마다 시간은 계속 증가될것. 기본 숫자가 천분의 일초?

public class Four_currenttimeMills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i =0; i<1000000000; i++) {
			;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("시작시간:" + startTime);
		System.out.println("종료시간:" + endTime);
		System.out.println("소요시간:" + (endTime - startTime));
	}

}
