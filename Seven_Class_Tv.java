package seven;
class Tv{
	//Tv�� �Ӽ�(�������)
	String color;//����
	boolean power; //��������(on/off)
	int channel; //ä��
	
	//Ƽ���� ���(�޼ҵ�)
	void power() {power = !power;} //*tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
public class Seven_Class_Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;   //Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv(); // Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;
		t.channelDown();//tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		System.out.println("���� ä����" + t.channel + "�Դϴ�.");
		
		
	}

}
