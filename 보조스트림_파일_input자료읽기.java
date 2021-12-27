package java2_eight입출력;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;



public class 보조스트림_파일_input자료읽기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//바이트 단위 스트림을 하고 있음
		//inputStream: 해당 파일을 인풋하는 것임: 바이트 단위로 읽는 스트림 중 최상위 스트림
		
		//InputStream의 하위 스트림
		//FilterInputStream : 파일에서 바이트 단위로 자료를 읽음:기반 스트림에서 자료를 읽을때 추가ㅣ 기능을 제공하는 보조 스트림의 상위 클래스
		//ByteArrayInputStream : byte매열 베모리에서 바이트 단위로 자료를 읽음
		//FilterInputStream: 기반 스트림에서자료를 읽을 때 추가 기능을 제공하는
		//보조스트림의 상위 클래스
		
		//InputStream에서 제공하는 메서드 
		//int read(): 입력 스트림으로 부터 한 바이트의 자료를 읽습니다. 읽은 자료의 자이트 수를 반환
		//void close():입력 스트림과 연결된 대상 리소스를 닫습니다.

		FileInputStream fis = null;

		try {//read는 한바이트씩 읽음.
	//	파일을 연 상태이기 때문에 파일 여는 것은 따로 구현 할필요 없고, 닫는것만 해주면됨.	
			fis = new FileInputStream("C:\\input.txt");
			System.out.println((char) fis.read());//A
			System.out.println((char)fis.read());//B
			System.out.println((char)fis.read());//C
		} catch (Exception e) {
			// TODO: handle exception
			//경로가 해당되지않으면 예외발생함.
			System.out.println(e);
			
		}finally {
			try {
				fis.close();//열린 스트림은 finally블록에서 닫음
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {//스트림이 nuall인 경우
				System.out.println(e);
				//파일을 닫을 때도 이중으로 try-catch구현
				//예외일 경우 해당파일이열리지않았으므로 null값도 정의해줘야함
			}
			
		}
		System.out.println("end");
	}
		
}


