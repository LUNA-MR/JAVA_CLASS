package ten;

class Leader2 extends Student2{
	void lead() {}
	

	void say() {
		System.out.println("�����Բ� �λ�");//overridng
		super.say();//���� Ŭ������ �޼ҵ� ����
	}
}

public class Ten_��ü_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader2 leader2 = new Leader2();
		leader2.say();//�������̵��� �޼��� ���
		
	}

}
