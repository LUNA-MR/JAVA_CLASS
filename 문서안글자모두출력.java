package java2_eight�����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class �����ȱ��ڸ����� {

	public static void main(String[] args) {
	 //���� ������ �б�
		//read�޼���� ������ �д� ��� ������ ���� ������ �ϸ� -1�� ��ȯ
		
		 try(FileInputStream fis=new FileInputStream("C:\\input.txt")){
			int i;
			//1���� -1�� �ƴ� ���� read()�޼ҵ�� �� ����Ʈ�� �ݺ��ؼ� ����
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
		 