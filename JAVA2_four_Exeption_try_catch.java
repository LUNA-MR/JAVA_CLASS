package java2_four_exeption;

public class JAVA2_four_Exeption_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = {2,0};
			int b = 4;
			System.out.println("���� ó�� ���� ��1");
			int c = b/a[0];
			System.out.println("���� ó�� ���� �� 2");
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			//0�� ������� ��µ�
			System.out.println("��� ���� �߻�");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			//���� �迭������ �Է��ϸ� ��µ�
			System.out.println("�迭 ���� ���� �߻��Դϴ�.");
		}
		System.out.println("���� ó�� ���� ��3");
	}

}
