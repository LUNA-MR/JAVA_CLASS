package java2_first;

 
class Animal{
	void breath() {
		System.out.println("������");
	}
}

class Lion extends Animal{
	public String toString() {
		return "����";
	}
}

class Zookeeper{//������ Ŭ����
	void feed(Lion lion) {//���ڿ��� �����ִ� �żҵ�  //feed(�Ű����� �Ű�����)
		System.out.println(lion + "���� ��� �ֱ�");
	}
}
public class JAVA2_first_�پ缺_���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1 = new Lion();//Lion�ν��Ͻ� ����
		Zookeeper james = new Zookeeper();//james��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion1);//james�� lion1���� ���̸� ��
		System.out.println(lion1);
	}

}
