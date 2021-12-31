package java2_four_exeption;

 

public class JAVA2_four_Exeption_고의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의 예외"); //괄호안에 "글"이 없으면 출력했을때 null이 나옴.
			//e 객체를 만들어서 throw e를 하게 되면 catch에서 진자 캐치해서 e를 받음
			throw e;	
		}//1. 고의 발생 throw사용해서 catch가 e를 받음
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
			//e.getMessage를 사용하여 위의 "고의 예외"를 받음.
		}
	}

}
