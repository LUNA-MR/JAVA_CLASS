package nine;

class Check{
	//instanceVariable : iv
	//classVariable:cv
	//instaneMethod:im
	//classMethod:cm
	public Check() {
		// TODO Auto-generated constructor stub
	}static int cv=5;//class변수
	int iv =4;//인스턴스변수
	
	static void cm(){//claa method
	}
	void im(){//인스턴스 메소드 
		}
	
	
	static void cm_Imember() {
		//클래스 메서드가 인스턴스 멤버에 접근
		//System.out.println(iv);//에러발생
		//im();에러발생
		
	}
	void im_Cmember() {
		//인스턴스 메소드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	static void cm_Cmerber() {
		//클래스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	void im_Imember() {
		//인스턴스 메서드가 인스턴스 멤버에 접근
		System.out.println(iv);
		im();
	}
}
public class Nine_Static_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check.cm_Imerber();//에러
		Check.cm_Cmerber();//성공
		Check myinstanceCheck = new Check();
		myinstanceCheck.im_Cmember();//성공
		myinstanceCheck.im_Imember();//성공
	}
}


