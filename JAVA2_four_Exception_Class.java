package java2_four_exeption;

 

class AgeException extends Exception{
	 
	//사용자 생성
	public AgeException() {}
	public AgeException(String message){
		super(message);
	//메세지 가져오기 생성자중 문자열을 받는 생성자를 만듬. 
	//상속자에게 메세지를 전달 super
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		//super.printStackTrace();
	}
}
public class JAVA2_four_Exception_Class {
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	//	ticketing으로 발생 throws AgeException 으로 전달 
//ticketing함수 만들기 예외처리 해야하니까 ageexception로 던지기? throws excpetion이 받아서 cath로 던져줌.
		
		//catch(Ageexception e)  ageexception있는지 확인하기 해당하면 try skdha, 아니면 catch가 나옴. 
		int age = -19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
	}

}
