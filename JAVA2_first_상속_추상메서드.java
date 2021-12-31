package java2_first;
//private �� ���� class�������� ���밡��,���ٰ���.
//abstract = �߻�޼ҵ��°�

abstract class Pokemon{//���ϸ� �߻� Ŭ���� ����
	//  abstract + class/method�ϸ� �߻��̶�°���.
	String nameString; 

	//���� �ϱ�  
	abstract void attack();//���� �߻� �޼ҵ� ��ӹ��� Ŭ�������� ������ �����ؾ���.
	abstract void sound();
	//�߻� �޼ҵ带 �����ϸ� ������ �����ؾ���.	
	
	public String getName() {//���ϸ��� �̸��� �����ϴ� �޼��� 
		return this.nameString;
	}

}

class Pikachu extends Pokemon{//��Ÿ�� Ŭ����
	Pikachu(){//�̸��� �����ϴ� ������
		this.nameString = "��ī��"; //this�� ������ ������ ��Ÿ��?
	}
	void attack() {//��ü������ ����
		System.out.println("���� ����");
	}
	void sound() {
		System.out.println("��ī��ī!");
	}
}
class Squirtle extends Pokemon{//��ī�� Ŭ����
	Squirtle() {//�̸��� �����ϴ� ������
		this.nameString="���α�";
	}
	void attack() {//��ü������ ����
		System.out.println("�� ����");
		
	}	
	void sound() {
		System.out.println("���� ����!");
	}

}

public class JAVA2_first_���_�߻�޼��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pikachu1 = new Pikachu();
		System.out.println("�� ���ϸ���" + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("�� ���ϸ���"+ squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}

}
