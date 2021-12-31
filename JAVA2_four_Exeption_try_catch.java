package java2_four_exeption;

public class JAVA2_four_Exeption_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = {2,0};
			int b = 4;
			System.out.println("예외 처리 공부 중1");
			int c = b/a[0];
			System.out.println("예외 처리 공부 중 2");
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			//0이 있을경우 출력됨
			System.out.println("산술 오류 발생");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			//업는 배열순서를 입력하면 출력됨
			System.out.println("배열 길이 오류 발생입니다.");
		}
		System.out.println("예외 처리 공부 중3");
	}

}
