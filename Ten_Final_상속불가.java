package ten;

class FinalClass{//final�� �پ��°��� ��Ӹ� �Ұ���
	int number = 4;//���
}
class Parents extends FinalClass // error�߻�
{
	final void finalMethod() { //�������̵� �Ұ��� �޼ҵ� //��Ӱ����ϳ� �������̵� �Ұ�
	// void finalMethod() {
		System.out.println("��� �Ұ��� �޼ҵ�");
		}
}
class Son extends Parents{ //parent��� �޴� �� ���� ������
	//void finalMethod() {//finalmethod�� ��ӹ������� ���� �߻�
}

public class Ten_Final_��ӺҰ�{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		member1.number = 5;//����� ���� �Ұ�
		 
	}
}
