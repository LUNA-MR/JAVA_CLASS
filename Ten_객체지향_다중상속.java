package ten;
//�������̵� ���� Ŭ���� �̸��� ��� �ڽ�Ŭ������ �켱������ ����ȴ�. 
class Student2{
	void learn() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("������ �ȳ��ϼ���!");
	}
}

class Leader extends Student2{
	void lead() {
		
	}

	void say() {
	System.out.println("�����Բ� �λ�");
}
}
public class Ten_��ü����_���߻�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader1 = new Leader();
		leader1.eat();//��� ���� �޼��� ���
		leader1.say();//���� ���̵��� �޼��� ���
}

}
