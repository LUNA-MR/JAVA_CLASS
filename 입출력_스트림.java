package java2_eight�����;
//IO��Ű��=input+output ��Ű��

import java.io.IOException;

//��Ʈ��: �������� ����� �� �� �������θ� �����ϴٴ� Ư¡����.
//1.input/output������
//2.try,catch����ó���� �׻� �����ؾ��� 
public class �����_��Ʈ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ĺ��� �ֱ�
		//�ƽ�Ű�ڵ� = ���ڸ� ���ڷ�, ���ڸ� ���ڷ�
		//ȭ�鿡 ����ϰ� �Է¹޴� ǥ�� ����� Ŭ����
		//static printStream out:ǥ�� ��� ��Ʈ��
		//static printStream in : ǥ�� �Է� ��Ʈ��
		//static outputstream err: ǥ�� ���� ��� ��Ʈ��
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		int i ;
		try {//����� ��Ű���Ҷ��� try,catch ������ Ȱ���ϱ�
			//System.in:ǥ�� �Է� ��Ʈ��
			i=System.in.read();//read()�޼���� �� ����Ʈ ����
			//System.out:ǥ�� ��� ��Ʈ��.
			System.out.println(i);//int�� 4����Ʈ ������ 1����Ʈ�� �о ���
			System.out.println((char)i);//���ڷ� ��ȯ�Ͽ� ���
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
