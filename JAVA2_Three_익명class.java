package java2_third;
 

class OuterClass1{
	//a��b��� �޼��带 ���� Ŭ���� 
	void a() {
		System.out.println("method a");
	}
	void b() {
		
	}
}
public class JAVA2_Three_�͸�class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ӽ��Լ� �ӽ�class ->�󵵰� ���� �Լ��� ���� �����
		//���� Ŭ������ �ν��Ͻ� �����̳� ����� �ٸ�
		OuterClass1 o = new OuterClass1() {
			void a() {
				//�͸� Ŭ���� �ȿ� �ִ� �޼���� ��üo�� ���ؼ��� �����ϴ�
				System.out.println("���Ӱ� ������ �͸� Ŭ������ �޼��� �Դϴ�.");
			}
		};//�͸� Ŭ������ �ݵ�� �������� ;�� �ٿ��� �Ѵ�. 
		//�͸� Ŭ������ �������̵��� �޼��带 ���
		o.a();//���Ӱ� ������ �͸� Ŭ������ �޼���
		OuterClass1 ok = new OuterClass1();
		o.a(); //���Ӱ� ������ �͸� Ŭ������ �޼��� �Դϴ�. 
		
		//�͸� Ŭ������ ��ȸ���̹Ƿ� �ٽ� ������ �޼��尡 ���
		ok.a();  //method a
				}

}
