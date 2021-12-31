package java2_four_exeption;

public class JAVA2_four_Exception_throw {
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();/*
		try{
		methodC();
		}catch(Exception e){
		System.out.println("methodB에서 처리")
		}*/
	}
	public static void methodC() throws Exception{
		Exception e  = new Exception();		 
		throw e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodA();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("메인에서 처리");
		}
	}

}
