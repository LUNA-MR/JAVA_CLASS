package java2_eight�����;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;



public class ������Ʈ��_����_input�ڷ��б� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//����Ʈ ���� ��Ʈ���� �ϰ� ����
		//inputStream: �ش� ������ ��ǲ�ϴ� ����: ����Ʈ ������ �д� ��Ʈ�� �� �ֻ��� ��Ʈ��
		
		//InputStream�� ���� ��Ʈ��
		//FilterInputStream : ���Ͽ��� ����Ʈ ������ �ڷḦ ����:��� ��Ʈ������ �ڷḦ ������ �߰��� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ����
		//ByteArrayInputStream : byte�ſ� ���𸮿��� ����Ʈ ������ �ڷḦ ����
		//FilterInputStream: ��� ��Ʈ�������ڷḦ ���� �� �߰� ����� �����ϴ�
		//������Ʈ���� ���� Ŭ����
		
		//InputStream���� �����ϴ� �޼��� 
		//int read(): �Է� ��Ʈ������ ���� �� ����Ʈ�� �ڷḦ �н��ϴ�. ���� �ڷ��� ����Ʈ ���� ��ȯ
		//void close():�Է� ��Ʈ���� ����� ��� ���ҽ��� �ݽ��ϴ�.

		FileInputStream fis = null;

		try {//read�� �ѹ���Ʈ�� ����.
	//	������ �� �����̱� ������ ���� ���� ���� ���� ���� ���ʿ� ����, �ݴ°͸� ���ָ��.	
			fis = new FileInputStream("C:\\input.txt");
			System.out.println((char) fis.read());//A
			System.out.println((char)fis.read());//B
			System.out.println((char)fis.read());//C
		} catch (Exception e) {
			// TODO: handle exception
			//��ΰ� �ش���������� ���ܹ߻���.
			System.out.println(e);
			
		}finally {
			try {
				fis.close();//���� ��Ʈ���� finally��Ͽ��� ����
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {//��Ʈ���� nuall�� ���
				System.out.println(e);
				//������ ���� ���� �������� try-catch����
				//������ ��� �ش������̿������ʾ����Ƿ� null���� �����������
			}
			
		}
		System.out.println("end");
	}
		
}


