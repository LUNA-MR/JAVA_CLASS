package java2_four_exeption;

public class JAVA2_four_Exeption_try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b=2;
	 
		try {
			System.out.println("�ܺη� ����");
			int c = b/a;
			System.out.println("���� ����");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("������ �߻��߽��ϴ�.");
			//System.out.println("���� ����");
		}
		finally {
			//���ܰ� �߻��� ���� �߻����� ���� ��� ��� ���
			System.out.println("���� ����");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
