package seven;

public class Seven_Class_�ż���ȣ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car mycar1 = new Car(); //car�ν��Ͻ� ����, Car���⿡ ���� ��ȣǥ �߱� ���̳� ���� ��ġ Ȯ�� 
	Car mycar2 = new Car(); //car�ν��Ͻ� �ϳ� �� ����, ���� ���� �ƴ�
	
	mycar1.color = "red" ; //mycar1�� ���󻡰�
	mycar2.color = "black";//mycar2�� ���� ����
	mycar1.speedUp(); //mycar1���� �޼ҵ� ȣ��
	mycar2.wiper(); // mycar2�� ������ �޼��� ȣ��
	
	System.out.println("mycar1�� ��: "+ mycar1.color);
	System.out.println("mycar2�� ��: " + mycar2.color);
	System.out.println("mycar1�� �ӵ� : " + mycar1.speed);
	System.out.println("mycar2�� �ӵ� : " + mycar2.speed);
	System.out.println("mycar1�� ������ �۵�����  : " + mycar1.wiperOn);
	System.out.println("mycar2�� ������ �۵����� : " + mycar2.wiperOn);
	}

}
