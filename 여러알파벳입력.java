package java2_eight입출력;

import java.io.IOException;

public class 여러알파벳입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//표준입출력
		//화면에 출려가혹 입력받는 표준 입출력 클래스
		//문자 여러개를 입력받기
		System.out.print("알파벳 여러 개를 쓰고[enter]를 누르세요");
		int i ;
		try{while ((i=System.in.read())!= -1){//system.in:표준 입력 스트림.
			System.out.print((char)i);///System.out:표준 출력 스트림
		}
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
