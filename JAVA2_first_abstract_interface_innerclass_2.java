package java2_first;


//override�� ������� ��� ����Ǵ���

class Myparent2nd{
	protected int pi = 100;
	public void pDisplay() {
		System.out.println("Myparent2nd ù��°  : pDisplay():pi=" + pi);			
	}
}
class MyChild2nd extends Myparent2nd{
	protected int ci = 200;
	//�����ǵ� �޼���
	@Override
	public void pDisplay() {
		System.out.println("Override pDisplay(): pi"+pi);
		
	}
	public void cDisplay() {
		System.out.println("cDisplay():ci"+ci);	
	}
} 

public class JAVA2_first_abstract_interface_innerclass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 			// TODO Auto-generated method stub
			MyChild2nd cobj = new MyChild2nd();
			cobj.pDisplay(); //���� Ŭ�����κ��� ��ӹ��� �ż���v//override pldisplay():pi=100
			cobj.cDisplay();//����Ŭ�������� �߰��� �޼��� // cdisplay():ci=200
			
			Myparent2nd pobj = cobj;
			//�����ǵ� �޼���� ��ĳ������ �Ǹ� ������ ���� Ŭ�����Ǹż��尡 ���еǰ� 
			//���� Ŭ�������� �����ǵ��� �޼��尡 ȣ��ȴ�.
			pobj.pDisplay();//override pdisplay():pi= 100
		}

	

}
