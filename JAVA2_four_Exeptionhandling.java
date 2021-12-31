package java2_four_exeption;

public class JAVA2_four_Exeptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1.에러가 나오는 경우
	//	int num = 10;
	//	int num2 = 0;
		
	//	System.out.println("**정수 값을 0으로 나누는 연산**");
		//부적절한 연산 수행
	//	System.out.println("10/0=" + (num/num2));//0욿 나누었기 때문에 오류가 뜸 오류 뜨긴전에는 정상작동이라 화면에 출력됨.
	//	System.out.println("try/catch구문 밖 문장 수행");
		
		
 //2.try-catch 구문
		int num = 10;
		int num2 = 0;
		
		try {
		 System.out.println("**정수 값을 0으로 나누는 연산**");			 
		 System.out.println("10/0=" + (num/num2)); 
		 //예외가 발생을 안할경우 아래 한줄이 나옴
		 System.out.println("**정수값을 0으로 나누는 연산 완료**");
		}catch (Exception e) {
			//예외가 발생할 경우 출력되는 것임
			System.out.println("0으로 나눌 수 없습니다.");
			// TODO: handle exception
		}
		System.out.println("프로그램을 정상 수행합니다.");	
	}
//이렇게 예외가 발생하면 비정상적인 종료가 발생하게 되는데, 비정상적인 종료를 방지하고자 "예외처리"를 만듬.
}
