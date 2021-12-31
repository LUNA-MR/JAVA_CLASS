package java2_second;
//public ���� ��� ����
//final �ѹ� ���ϸ� ���̻� ���� �Ұ� 
//static ��ü ���� ���ص� ��� ����
//�߻�Ŭ������ ��ӹް� �Ǹ� �ٸ� class�� �� ��� ���� �� ����
//class�� ���� ��� , ����� �ϳ��� ���� �� �ֵ�. 
//�������̽��� ����ϸ� ����ϳ��� �ް�  implements�� �Ἥ ������ �߰� �ϴ� �� ��, ����� �ϳ� �� ���� �� �ִ� ������ �ִ�. 


//�������̽�
interface Providable{
	void leisureSports();//public abstract �����ϴ��� �����Ϸ��� �˾Ƽ� �ٿ���
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{ //�߻�Ŭ������ �����ϰ� �Ʒ� ������ �����ؾ���.
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
		}
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
		
	}
	public void food() {
		System.out.println("���� ����� ����");
		
	}
}
class TourGuide{
	private Providable tour = new KoreaTour();
	//�������̽��� Ÿ�� ����
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
 }
public class JAVA2_two_Interface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}

}
