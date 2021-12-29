package seven;
import java.util.Scanner;

public class Seven_소스재활용 {
	static int max(int a, int b,int c) {
		int max = a;  
		if(b>max)max = b;
		if(c>max)max = c; 
		return max; //max를 반환하기 max값을 메인 함수값에 전달해줘야 해서 return을 씀
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdInScanner = new Scanner(System.in);
		
		System.out.println("정수 a : "); int a = stdInScanner.nextInt();
		System.out.println("정수 b : "); int b = stdInScanner.nextInt();
		System.out.println("정수 c : "); int c = stdInScanner.nextInt();
		
		System.out.println("최대값은" + max(a, b, c)+ "입니다.");
	}

	
	//정수 최대값을 반환
//	if(a<b)
//		return b;
//	else return a;
}
