package eight;

 
class Account{
	String name;//���¸���
	String no;//���¹�ȣ
	long balance; //�����ܰ�
}
  
public class Eight_Class_Mathod {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account chulsoo = new Account();ö���� ����
		
		Account chulsoo;
		chulsoo = new Account();
		
		Account yonghee = new Account();//������ ����
		
		chulsoo.name = " ö��";   //ö���� ���¸���
		chulsoo.no = "12345";     //ö���� ���¹�ȣ
		chulsoo.balance = 1000;    //ö���� �����ܰ�
		 
		yonghee.name = "����";   //������ ���¸���
		yonghee.no = " 78901";   //������ ���¹�ȣ
		yonghee.balance = 500;   //������ �����ܰ�
		
		chulsoo.balance -= 200;//ö���� 200���� ����
		yonghee.balance += 100;//���� 100���� ����
		
		System.out.println(" ---ö���� ���� ---");
		System.out.println(" ���¸��� : " + chulsoo.name);
		System.out.println(" ���¹�ȣ : " + chulsoo.no);
		System.out.println(" �����ܰ� : " +chulsoo.balance);
		
		System.out.println(" ---������ ����---");
		System.out.println("���¸���:"+yonghee.name);
		System.out.println("���¹�ȣ:" + yonghee.no);
		System.out.println("�����ܰ�:"+yonghee.balance);
	}
}
		
 
 