package java2_four_exeption;

public class JAVA2_four_Exeptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1.������ ������ ���
	//	int num = 10;
	//	int num2 = 0;
		
	//	System.out.println("**���� ���� 0���� ������ ����**");
		//�������� ���� ����
	//	System.out.println("10/0=" + (num/num2));//0�Q �������� ������ ������ �� ���� �߱������� �����۵��̶� ȭ�鿡 ��µ�.
	//	System.out.println("try/catch���� �� ���� ����");
		
		
 //2.try-catch ����
		int num = 10;
		int num2 = 0;
		
		try {
		 System.out.println("**���� ���� 0���� ������ ����**");			 
		 System.out.println("10/0=" + (num/num2)); 
		 //���ܰ� �߻��� ���Ұ�� �Ʒ� ������ ����
		 System.out.println("**�������� 0���� ������ ���� �Ϸ�**");
		}catch (Exception e) {
			//���ܰ� �߻��� ��� ��µǴ� ����
			System.out.println("0���� ���� �� �����ϴ�.");
			// TODO: handle exception
		}
		System.out.println("���α׷��� ���� �����մϴ�.");	
	}
//�̷��� ���ܰ� �߻��ϸ� ���������� ���ᰡ �߻��ϰ� �Ǵµ�, ���������� ���Ḧ �����ϰ��� "����ó��"�� ����.
}
