package java2_second;
interface MyInterface{
	//�߻�Ŭ���� ��ü��������
	//4������ ���� ����. ���� �ȿ����� ������ public static final ���� 
	//finall�� �Ӽ� �ʱ�ȭ�ϱ� = 10;�̷������� 
	int w = 10;//public static final����
	static int x= 20;//public final����
	final int y = 30;// public static ����
	public static final int z = 40;
}

public class JAVA2_two_Interfae_publicStaticFinal���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyInterface mi = new MyInterface();//complie Error // �ܵ����� ��ü���� �Ұ� 
		//MyInterface.w  = 50; //Compile Error����� ���� ���ٲٱ� ������ ����ǰ��� �ٲٷ��� �õ��߱⶧���� ���� �ߴ°���
		System.out.println("w =  " + MyInterface.w);
		System.out.println("x =  " + MyInterface.x);
		System.out.println("y =  " + MyInterface.y);
		System.out.println("z =  " + MyInterface.z);
	}

}
