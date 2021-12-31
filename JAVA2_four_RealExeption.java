package java2_four_exeption;
//file입출력관련 import해줘야함
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JAVA2_four_RealExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\test.txt.txt";//이스케이프 문자\를 사용하여 \\로 나타냄.
		FileInputStream fiS = null;
		
		try {
			fiS = new FileInputStream(path);
			System.out.println("지정한 경로에 파일이 존재합니다.");
		} catch (FileNotFoundException e) {
			System.out.println("지정한 경로에 파일이 존재하지 않습니다.");
			// TODO: handle exception
		}finally {
			if(fiS != null) {
				try {
					fiS.close();
				}catch (IOException e) {;}
				System.out.println("파일을 닫았습니다.");
					// TODO: handle exception
				}
				System.out.println("자원을 해제하고 종료합니다.");
			
		}
	}

}
