package ten;

 

class USer{
	//public String name;
	private String name;  
	//public int age;
	private int age; //�������� ��� �տ� �ƹ��͵� �Ⱥ��̸� private; ���� ���� ����
	//���� class�ܿ��� ���� �Ұ� 
	//�޼ҵ带 ���ؼ��� ���ٰ�������
	USer(String name, int age){//�Ű������� ���� ������
		this.name = name;
		this.age = age;
	}
	
	//private�� ��� ���� �����ѰŴ� set��
	//1. ���� private�� ������� ������ �Ʒ� 4�� public �� �ʿ���.(�ʼ��� �ƴ�)
	public void setName(String name) {
		//setName �� ���� �� �ʿ������  ��������� set�� ���� ���� �Ϲ������� ����� ��
		this.name = name;
		 
	}
	public String getName() {
		//�̸��� �ʿ��� ���? �������°�?
		return name;
	}
	public void setAge(int age) {
//		 if(age<150) {
			this.age= age;
	
		//}
	}
	public int getAge() {
		return age;
	}
}

public class Ten_GET_SET���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USer user1 = new USer("ö��", 20);//�ν��Ͻ� ����
		USer user2 = new USer("����", 19);//�ν��Ͻ� ����
		//user2.age = 99;//error�߻�, ������ ���� �Ұ�
	
		
		user2.setAge(2021);
		System.out.println(user2.getName()+"�� ���̴� : "+user2.getAge());
	
		
		
		//	System.out.println(user1.name + "�� ���̴� " + user1.age); //private��� ������
	//	user2.age=2021;
	//	System.out.println(user2.name+ "�� ���̴�"+user2.age);
		}

}
