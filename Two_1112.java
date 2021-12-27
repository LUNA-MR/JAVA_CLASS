package two;

public class Two_1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte kor, math, eng;
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor+math+eng;
		System.out.println(sum);
		
		int avg_01 = sum / 3;
		System.out.println(avg_01);
		
		double avg_02 = sum/3;
		System.out.println(avg_02);
		
		double avg_03 = (double)sum/3;
		System.out.println(avg_03);
		
		double avg_04 = sum / 3.0;
		System.out.println(avg_04);
		
		double avg_05 = (double)sum / 3.0;
		System.out.println(avg_05);
		
		
		
		// 사칙연산 _  나머지, 몫
		int a = 10;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//짝수, 홀수 구분:
		System.out.println(a%2);
		System.out.println(b%2);
		//단항 연산자
		int c = 2;
		int d = -1;
		
		
		System.out.println(c);
		System.out.println(-c);
		System.out.println(-d);//d의 부호를 바꿔서 출력
	

	int j = 0 ;
	++j;
	System.out.println('j'+j);
}
}
