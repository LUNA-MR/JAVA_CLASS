package java2_first;



class Rabbit extends Animal{//���� Ŭ������ ����� �䳢 Ŭ����
	public String toString() {
		return "�䳢";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "������";
	}
}

class Zookeeper1{//������ Ŭ����
	void feed(Lion lion) {//���ڿ��� ���� �ִ¸޼ҵ�
		System.out.println(lion+"���� ��� �ֱ�");
	}
	 
	void feed(Rabbit rabbit) {//�䳢���� ���� �ֱ�
		System.out.println(rabbit+"���� ���� �ֱ�");
	}
	void feed(Monkey monkey) {//�����̿��� ���� �ֱ� 
		System.out.println(monkey+"���� ���� �ֱ�");
	}

}
public class JAVA2_first_�پ缺_���1_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1 = new Lion();//Lion �ν��Ͻ� ����
		Zookeeper1 james = new Zookeeper1();//james��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion1);//james�� lion1���� ���̸� ��
	
		Rabbit rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Monkey monkey1 = new Monkey();
		james.feed(monkey1);
	}

}
