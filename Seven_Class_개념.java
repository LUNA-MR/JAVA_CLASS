package seven;
class Car{
	boolean powerOn ; //�õ� -> on/off = Truen/ False
	String color;//������ ���� ���������ϱ� 
	int wheel; // ���� ���� 
	int speed; //�ӷ� ���� ���� ���� 100.4�ϼ��� ������ �����ϰ� ������
	boolean wiperOn;//���� ->on/off�ΰ��� �����ϱ� 
 
	
	void power() {//class�ȿ� �ִ� �͵��� �޼ҵ�� �θ� 
		powerOn = !powerOn;//�õ� �޼ҵ�
	  //���� True ��  �ݴ��� false�� ����ֱ� 
	//�ڵ��� ������ �ɷ������� �õ��� ����, ���� ������ ���� 
		//void �̱� ������ return�� ����.
	}
	void speedUp() {
		speed++; // ���� �޼���
	//ȥ�� �϶��� �տ� ++�̵� �ڵ� �������
    //������ ������ �ӵ��� �ö�
	}
	void speedDown() {
		speed--;//�극��ũ �޼���
	//�극��ũ ������ �ӵ��� �پ��
	}
	void wiper() {
		wiperOn = !wiperOn;//������ �޼���
	}
}
public class Seven_Class_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar;//Ŭ������ ��ü�� ������ �� �ִ� �������� ����
		myCar = new Car(); //Ŭ������ ��ü�� �����ϰ� ��ü�� �ּҸ� ���������� ����
		//���ο� ������ ���� �ű⿡ ����
		//myCar�� �ּҰ� �����
		//����mycar ,  .~ : �޼ҵ�?
		System.out.println("�õ� ó�� �ʱ�ȭ : " + myCar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ : " + myCar.color);
		System.out.println("������ �� �ʱ�ȭ: "+ myCar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ : " + myCar.speed);
		System.out.println("������ �۵� �ʱ�ȭ:" + myCar.wiperOn);
		myCar.power();//������ �ִ����� �ݴ�� �ٲ���. �õ� �޼��� ����
		System.out.println("�õ� �޼��� ���� :" + myCar.powerOn);
		myCar.power();//������ �ִ����� �ݴ�� �ٲ���. �õ� �޼��� ����
		System.out.println("�õ� �޼��� �ٽ� ���� :" + myCar.powerOn);
		myCar.color = "black" ; // ���� ������ black����
		System.out.println("���� ���� ���� :" + myCar.color);
		
	}

}
