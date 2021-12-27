package java2_eight입출력;
//IO패키지=input+output 패키지

import java.io.IOException;

//스트림: 데이터의 통신은 한 쪽 방향으로만 가능하다는 특징있음.
//1.input/output따로임
//2.try,catch예외처리로 항상 구현해야함 
public class 입출력_스트림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//알파벳을 넣기
		//아스키코드 = 문자를 숫자로, 숫자를 문자로
		//화면에 출력하고 입력받는 표준 입출력 클래스
		//static printStream out:표준 출력 스트림
		//static printStream in : 표준 입력 스트림
		//static outputstream err: 표준 오류 출력 스트림
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i ;
		try {//입출력 패키지할때는 try,catch 구문을 활용하기
			//System.in:표준 입력 스트림
			i=System.in.read();//read()메서드로 한 바이트 읽음
			//System.out:표준 출력 스트림.
			System.out.println(i);//int는 4바이트 이지만 1바이트만 읽어서 출력
			System.out.println((char)i);//문자로 변환하여 출력
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
