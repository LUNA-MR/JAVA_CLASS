package java2_first;

 
 
//���� ����  ����;
abstract class Animals{
	private String name;//�̸�
	public Animals(String name) {this.name = name;}
	public abstract void bark(); //¢�´�
	public abstract String toString() ;//���ڿ� ǥ���� ��ȯ�Ѵ�.
	
	public String getName() {return name;}
	public void instroduce() {
		System.out.println(toString() + "�Դϴ�.");
		bark();
	 
	}
}
//����� Ŭ����
class Cat extends Animals{
	private int age;//����
	public Cat(String name, int age) {super(name); this.age =age;}
	public void bark() {System.out.println("�߿�!");}
	public String toString() {return age + "����" + getName();	}
		
	
}
//�� Ŭ����
class Dog extends Animals{
	private String type;// ����
	public Dog(String name, String type) {
		super(name); this.type = type;
		
	}
	public void bark() {System.out.println("�۸�!!");}
	public String toString() {return type +"�� "+ getName();
		
	}
}

public class JAVA2_first_�߻���_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals[] a = {
			new Dog("�ٵ���","��찳"),
			new Cat("�Ʒ���", 7),
			new Dog("���"," ������")};
	for(Animals k : a) {
		k.instroduce();//k�� �����ϰ� �ִ� �ν��Ͻ��� ���� ���� 
		System.out.println();//�޼ҵ� ȣ��ȴ�.
	}
	}

}
