package java2_four_exeption;

 

class AgeException extends Exception{
	 
	//����� ����
	public AgeException() {}
	public AgeException(String message){
		super(message);
	//�޼��� �������� �������� ���ڿ��� �޴� �����ڸ� ����. 
	//����ڿ��� �޼����� ���� super
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		//super.printStackTrace();
	}
}
public class JAVA2_four_Exception_Class {
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");
		}
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	//	ticketing���� �߻� throws AgeException ���� ���� 
//ticketing�Լ� ����� ����ó�� �ؾ��ϴϱ� ageexception�� ������? throws excpetion�� �޾Ƽ� cath�� ������.
		
		//catch(Ageexception e)  ageexception�ִ��� Ȯ���ϱ� �ش��ϸ� try skdha, �ƴϸ� catch�� ����. 
		int age = -19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
	}

}
