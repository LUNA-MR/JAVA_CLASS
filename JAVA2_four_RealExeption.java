package java2_four_exeption;
//file����°��� import�������
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JAVA2_four_RealExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\test.txt.txt";//�̽������� ����\�� ����Ͽ� \\�� ��Ÿ��.
		FileInputStream fiS = null;
		
		try {
			fiS = new FileInputStream(path);
			System.out.println("������ ��ο� ������ �����մϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("������ ��ο� ������ �������� �ʽ��ϴ�.");
			// TODO: handle exception
		}finally {
			if(fiS != null) {
				try {
					fiS.close();
				}catch (IOException e) {;}
				System.out.println("������ �ݾҽ��ϴ�.");
					// TODO: handle exception
				}
				System.out.println("�ڿ��� �����ϰ� �����մϴ�.");
			
		}
	}

}
