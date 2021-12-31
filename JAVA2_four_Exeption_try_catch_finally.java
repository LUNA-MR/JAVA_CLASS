package java2_four_exeption;

public class JAVA2_four_Exeption_try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b=2;
	 
		try {
			System.out.println("외부로 접속");
			int c = b/a;
			System.out.println("연결 해제");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("오류가 발생했습니다.");
			//System.out.println("연결 해제");
		}
		finally {
			//예외가 발생할 경우와 발생하지 않을 경우 모두 출력
			System.out.println("연결 해제");
		}
		System.out.println("여기도 수행됩니다.");
	}

}
