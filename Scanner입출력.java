package java2_eight�����;
//������ �� ����Ʈ�� �޾Ҵµ� 
//Scanner�� ����ϸ� ĳ�������̳� �� ����,����,����ȭ �ʿ���� ����
//Scanner�� ��ü�� �����ϵ� System.in�� �Ű� ������ ������. 
//nextLine : ���ڿ� ����
//nextINT:���� ����
//��,scanner ���ڿ� �Է¹޴� �޼ҵ�, ���� �޴� �޼ҵ�, �̿��ؼ� �ٷ��������������

import java.util.Scanner;
 

public class Scanner����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ǥ�� �����
		//ȭ�鿡 ����ϰ� �Է¹޴� ǥ�� ����� Ŭ����
		//Scanner�׽�Ʈ�ϱ�
		//ǥ�� �Է� System.in�� ����ϸ� ����Ʈ ���� �ڷḸ ó���� �� ������ 
		//Scanner�� �پ��� �ڷ����� �Է��� ������
		//ǥ�� �Է��� �Ű� ������ ScannerŬ����������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸�:");
		String name = scanner.nextLine(); //nextLine():���ڿ� �Է�
		System.out.println("����:");
		String job = scanner.nextLine();//nextLine():���ڿ� �Է�
		System.out.println("���:");
		int num = scanner.nextInt();//nextInt():�����Է�
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
