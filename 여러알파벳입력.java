package java2_eight�����;

import java.io.IOException;

public class �������ĺ��Է� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ǥ�������
		//ȭ�鿡 �����Ȥ �Է¹޴� ǥ�� ����� Ŭ����
		//���� �������� �Է¹ޱ�
		System.out.print("���ĺ� ���� ���� ����[enter]�� ��������");
		int i ;
		try{while ((i=System.in.read())!= -1){//system.in:ǥ�� �Է� ��Ʈ��.
			System.out.print((char)i);///System.out:ǥ�� ��� ��Ʈ��
		}
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
