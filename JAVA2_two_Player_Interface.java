package java2_second;

 
//Ŭ������ ����鼭 interface player�� ����鼭 �������̵� �������. 
//�ۺ� strat�����Ǿ�  ���� ->java complie�� �˾Ƽ� �ٿ��� �ΰ� �������̵��� ���� �ؿ� �� ����
interface Player{
	void play();  //���
	void stop(); //����
}

//���� �÷��̾�
class VideoPlayer implements Player{
	//static ��ü ���� ����
	//videoplayer= ������
	private int id; //������ȣ
	private static int count = 0 ; //������� �Ҵ�� ������ȣ
	
	public VideoPlayer() {  //������
		id = ++count;
	}
	public void play() {  //���
		System.out.println("���� �������");
			}
	public void stop() { //����
		System.out.println("���� �������!");
	}
	public void printInfo() { //������ȣ ǥ��
		System.out.println("�� ����� ������ȣ�� {"+ id +"}�Դϴ�.");
	}
}




//cd�÷��̾� 
class CDPlayer implements Player{
//player�� ����
//play = stop �������̵�, ��� �ΰ� ���� 
	public void play() { //���
		System.out.println("CD ��� ����!");
	}
	public void stop() {//����
		System.out.println("CD ��� ����!");
	}
	public void cleaning() {//��� ����
		System.out.println("��带 û���߽��ϴ�. ");
	}
}
public class JAVA2_two_Player_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] a = new Player[2];
		//[2] �迭 ����  vs ()�� ��ü���� ���� �ϱ�!
		a[0] = new VideoPlayer(); //���� �÷��̾�
		a[1] = new CDPlayer(); //CD�÷��̾�
		
		//�پ缺�� �̿�. �ΰ��� �ٸ� Ŭ������ ���� �� �ִ°��� interface���� ���?
// for each�������� �ε��� ��ȣ�� ���� �ʿ���� ������ 
		//for(player p�迭�̸�ew CDplayer: a �ݺ�Ƚ����)�� ���ϴ� ����.
		for (Player p:a) {
			p.play();//���
			p.stop();//����
			System.out.println();
		}
			
			
	 //������ȣ 5������ �������� �غ��� 
	//	VideoPlayer[]b = new VideoPlayer[3];
	 
		 
		
	//	for(Player x:b) {
	//		if (x == b[3]){
	//			System.out.println();
		//	}		
	//	}

	    //teacher:
		VideoPlayer[] b1 = new VideoPlayer[4];
		for (int i = 0; i < b1.length;i++) {
			b1[i] = new VideoPlayer();
		}
		b1[b1.length - 1 ].printInfo();
	}

	 
}
