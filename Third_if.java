//���Ϸ� �����ϱ� : allenis@naver.com



package third;

//if-elif-else�� ���ؼ�import��
import java.util.Scanner; // java�ȿ� input���ֱ� ���ؼ� import�ؾ���.
import java.util.*; // * :�ڹ� �ȿ� ������ �ܾ�´�.

public class Third_if {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;  
		
		//if���� �����
		if (a>3) {//if���� ������ �߿���. if {�� �ȿ��� ���� ������ ������.}
			System.out.println("a�� 3���� Ů�ϴ�.");
		}
		System.out.println("�˻簡 �������ϴ�.");
	 
		//if -else��
		
		int age = 20;
		if(age>19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		else {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���.");
		System.out.println("���̸� �Է��ϼ��� : ");
		
		//if(����) - else if(����) -else
		Scanner input = new Scanner(System.in);
		int ag;
		//1)������ ����
		//ag = input.nextInt();//
		String tmp;
		tmp = input.nextLine();
		ag = Integer.parseInt( tmp);
		
		if (ag>60) {
			System.out.println("61�� �̻��Դϴ�.");
			System.out.println("��� ��� ����� ����˴ϴ�.");
		}
		else if (ag>19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ����˴ϴ�.");
		}
		else if(ag>13) {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ����� ����˴ϴ�.");
		}
		else if(ag>8) {
			System.out.println("����Դϴ�.");
			System.out.println("��� ����� ����˴ϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");		
		}
		System.out.println("������ ������ �ּ���.");
		
		String id, password;
	
		System.out.printf("���̵� �Է����ּ���:");
		id = input.nextLine();
		
		if (id.equals("java")) {
			System.out.println("���̵� ��ġ");
			System.out.printf("��й�ȣ�� �Է��� �ּ���:");
			password = input.nextLine();
			if (password.equals("abc123")) {
				System.out.println("��й�ȣ ��ġ");
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ ����ġ");
			}
		}
		else {
			System.out.println("���̵� ����ġ");
		}
	}
}
