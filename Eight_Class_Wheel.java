package eight;

 

class Cars{
	static int wheel = 4;//Ŭ���� ����
	int speed; //�ν��Ͻ� ����
}

 
public class Eight_Class_Wheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cars.wheel);//Ŭ���� ���� ���� ����
		//System.out.println(Cars.speed);//���� �߻�! �ν��Ͻ� ���� ���� �Ұ�
		
		Cars myCar1 = new Cars();
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);//�ν��Ͻ� ���� �Ŀ��� ���� ����
		
		Cars myCar2 = new Cars();
		System.out.println("���� ��");
		System.out.println("mycar1.speed:"+myCar1.speed);
		System.out.println("mycar2.speed:"+myCar2.speed);
		System.out.println("mycar1.wheel:"+myCar1.wheel);
		System.out.println("mycar2.wheel:"+myCar2.wheel);
		myCar2.speed = 100;
		myCar2.wheel = 5;
		System.out.println("���� �� ");
		System.out.println("mycar1.speed"+myCar1.speed);
		System.out.println("mycar1.wheel"+myCar1.wheel);
		System.out.println("mycar2.speed"+myCar2.speed);
		System.out.println("mycar2.wheel"+myCar2.wheel);
	}

}
