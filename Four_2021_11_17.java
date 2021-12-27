package four;

public class Four_2021_11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for( 초기값 ; 조건식 ; 증감식)
		//1)초기값 실행 첫번째
		//2) 조건식확인 두번째(두번쨰 ,빠져나와야하는 조건)
		//3) 조건식이 참이면 명령문 실행
		//4)증감식 실행 세번째
		//5)조건식 확인 두번째
		//6) 조건식이 참이면 명령문 실행
		//4)5)6) 반복
		
		
		
		
		int sum = 0;//총 합을 담을 변수
		for(int i = 1; i <= 10; i++) {//int sum=0;int=num;    for(num = 1; sum <100; num++){sum += num; System.out.println("num:" + num +"/sum:"+sum);}
			//1분터 10까지의 합
			System.out.printf("i = %d sum = %d/n", i ,sum += i);
		
			}
		int num ;  // for문 밖에 설정했을경우 전체에서 사용가능
		for(num = 0; sum<100; num++) {
			sum += num;
			System.out.println("num : " + num+"/sum :" + sum);
		}
		System.out.println("num:"+num); //for ( 1;2;3) -> 1한번 실행후 2번 실행, 3번실행후 - 2번실행을 반복함.
		System.out.println("sum:"+sum);
		
		
		
		
		//for - if 문
		int s = 0;
		int n = 0;
		for (n=0;;n++) {
			s += n;
			System.out.println("n: "+n+"/s:"+s);
			if (s >= 100)
				break;	
		}
		System.out.println("n:"+n);
		System.out.println("s:"+s);
	}

}
