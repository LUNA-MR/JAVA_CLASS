package java2_four_exeption;

 

public class JAVA2_four_Exeption_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("���� ����"); //��ȣ�ȿ� "��"�� ������ ��������� null�� ����.
			//e ��ü�� ���� throw e�� �ϰ� �Ǹ� catch���� ���� ĳġ�ؼ� e�� ����
			throw e;	
		}//1. ���� �߻� throw����ؼ� catch�� e�� ����
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
			//e.getMessage�� ����Ͽ� ���� "���� ����"�� ����.
		}
	}

}
