package java2_second;
//�߻� �޼��� // ���������� ���� ����.

 

abstract class MyAbsParent{
	protected String name="MyAbsParent";
	//�Ϲ� �޼���
	public void show() {
		System.out.println(name);
	}
	//�����ΰ� ���� �߻� �޼ҵ�
	public abstract void abstrctShow();
}

class MyChild extends MyAbsParent{
	//�߻� �޼���� �ݵ�� ������ �ؾ� �Ѵ�. 
	@Override
	public void abstrctShow() {
		System.out.println("MyChild's abstracShow()");
	}
}
public class JAVA2_two_Abstract_�߻�޼ҵ�_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild child = new MyChild();
		child.show(); //MyAbsParent//��ӹ��� �Ϲ� �޼��� ȣ��
		child.abstrctShow();//MyChild's abstractShow()//�����ǵ� �߻� �޼��� ȣ��
	}

}
