package java2_eight입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 문서안글자모두출력 {

	public static void main(String[] args) {
	 //파일 끝까지 읽기
		//read메서드로 파일을 읽는 경우 파일의 끝에 도달을 하면 -1을 반환
		
		 try(FileInputStream fis=new FileInputStream("C:\\input.txt")){
			int i;
			//1값이 -1이 아닌 동안 read()메소드로 한 바이트를 반복해서 읽음
			while((i = fis.read())!= -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
		 