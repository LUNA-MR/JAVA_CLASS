package ten;

class Person{// ���Ŭ����
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("�Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
	
}

class Student extends Person{//��� Ŭ������ ����� �л� Ŭ����
	void learn (){
		System.out.println("����");
	}
}

class Teacher extends Person{//��� Ŭ������ ����� ������ Ŭ����
	void teach(){
		System.out.println("����ġ��");
	}
}


public class Ten_��ü����_��Ӱ��پ缺 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���
		 Student s1 = new Student();//�л� �ν��Ͻ� s1����
		 s1.breath();//��� Ŭ������ breath�޼��带 ��� �޾���
		 s1.learn();
		 
		 Teacher t1 = new Teacher();//���� �ν��Ͻ� t1����
		 t1.eat();//��� Ŭ������ eat�޼��带 ��ӹ޾���
		 t1.teach();
		 
	}

}
