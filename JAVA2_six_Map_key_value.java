package java2_six_set;
//�˻��� ���� ���Ǵ� ��
//���̽��� ��ųʸ�
//Set�� �ε��� ���� ���� ������� ���� x
//map�� key�� value�� ������. setó�� hashcode�� equals�� �����.
//key Ÿ���� �ַ� string�� ���� �����. ���ڿ��� ���� ��� ���� ��ü�� �� �� �ֵ��� hasecode�� equals�޼ҵ尡 ������ �ؼ� ������ ����

import java.util.HashMap;
import java.util.Scanner;

 
public class JAVA2_six_Map_key_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		hm.put("apple", "���");
		hm.put("paper", "����");
		hm.put("flower", "��");
		String voca;
		System.out.println("�˰� ���� �ܾ �Է��ϼ���:");
		voca = sc.nextLine();
		
		if(hm.containsKey(voca)) {
			System.out.println("�ش��ϴ� ����: " + hm.get(voca));
		}
		else {
			System.out.println("�ش� �ܾ ���� ���� �����ͺ��̽��� �����ϴ�.");
		}
 //get(voca)�� �ϸ� �ش� Ű�� value���� ��ȯ��.
	}

}
