package nine;

class Check{
	//instanceVariable : iv
	//classVariable:cv
	//instaneMethod:im
	//classMethod:cm
	public Check() {
		// TODO Auto-generated constructor stub
	}static int cv=5;//class����
	int iv =4;//�ν��Ͻ�����
	
	static void cm(){//claa method
	}
	void im(){//�ν��Ͻ� �޼ҵ� 
		}
	
	
	static void cm_Imember() {
		//Ŭ���� �޼��尡 �ν��Ͻ� ����� ����
		//System.out.println(iv);//�����߻�
		//im();�����߻�
		
	}
	void im_Cmember() {
		//�ν��Ͻ� �޼ҵ尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	static void cm_Cmerber() {
		//Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	void im_Imember() {
		//�ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}
public class Nine_Static_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check.cm_Imerber();//����
		Check.cm_Cmerber();//����
		Check myinstanceCheck = new Check();
		myinstanceCheck.im_Cmember();//����
		myinstanceCheck.im_Imember();//����
	}
}


