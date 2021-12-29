package seven;
import java.util.*;




public class Seven_For문_함수 {
	
	//--문자 '*'을 n개 연속 표시 --//
	//void 메소드
		
	static void purStarts(int n) {
		while(n-->0)
			System.out.print('*');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner stdIn = new Scanner(System.in);
	System.out.println("최하변의 직각인 직각사각형을 표시합니다.");
	System.out.print("몇 단? : ");
	int n = stdIn.nextInt();
	
	for (int i=1;i<=n;i++) {
		purStarts(i);
		System.out.println();
	}
	}

}
