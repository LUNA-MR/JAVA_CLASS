package java2_first;

class Myparent1st{
	protected int pi = 100;
	public void pDisplay() {
		System.out.println("pDisplay():pi=" + pi);			
	}
}
class MyChild1st extends Myparent1st{
	protected int ci = 200;
	public void cDisplay() {
		System.out.println("cDisplay(): ci"+ci);
		
	}
}
public class JAVA2_first_���_�پ缺_���ٸ���abstract_interface_innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild1st cobj = new MyChild1st();
		cobj.pDisplay(); //���� Ŭ�����κ��� ��ӹ��� �ż���
		cobj.cDisplay();//����Ŭ�������� �߰��� �޼���
		Myparent1st pobj = cobj;//��ĳ����(���������� ����)
		pobj.pDisplay();
		//��ĳ���õ� ���� Ŭ�������� �����δ� Ȯ��� ���� Ŭ������ �ɹ��� ������ �� ���� 
		//pobj.cDisplay();//����
	}

}
