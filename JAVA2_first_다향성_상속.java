package java2_first;
//�پ缺 = ��Ӱ��踦 ����.
class A{
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A { //B�� A�� ���
	void methodB() {
		System.out.println("methodB");
	}
}

 
 
public class JAVA2_first_���⼺_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();//B�� �޼ҵ� B�� ���� ���� ���� new �ڿ� �ν��Ͻ� �տ��� ���� b�� ������ ����µ� �տ� b ���� a�� ����. //���� A�ڸ��� br�� ���µ�, A�� �Ա� ������ A�� �޼ҵ带 ��밡��.
		// B obj = new B();�̷��� �ϸ� �θ�, �ڽ� �Ѵ� ��� ���� 
		obj.methodA();//�տ� a�� ���Ƿν� ���� ��a�� ���Ƿ�  class a�� ��밡��
//		obj.methodB(); error��
	}

}
