package java2_first;
//�޼ҵ尡 �پ��
//3������ 1���� �پ��

class Zookeeper2{
	void feed(Animal animal) {//���ڿ��� ���� �ִ� �޼ҵ�
		System.out.println(animal + "���� ��� �ֱ�");
	}
}


public class JAVA2_first_�پ缺_���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion1 = new Lion();//Lion �ν��Ͻ� ����
		Zookeeper2 james= new Zookeeper2();//james��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion1);//james�� lion1���� ���̸� ��
		
		Animal rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Animal monkey1 = new Monkey();
		james.feed(monkey1);
	}

}
