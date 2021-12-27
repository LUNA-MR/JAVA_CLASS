//메일로 질문하기 : allenis@naver.com



package third;

//if-elif-else를 위해서import함
import java.util.Scanner; // java안에 input해주기 위해서 import해야함.
import java.util.*; // * :자바 안에 모든것을 긁어온다.

public class Third_if {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;  
		
		//if문만 쓸경우
		if (a>3) {//if문은 조건이 중요함. if {이 안에는 여러 문장이 가능함.}
			System.out.println("a는 3보다 큽니다.");
		}
		System.out.println("검사가 끝났습니다.");
	 
		//if -else문
		
		int age = 20;
		if(age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else {
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
		System.out.println("나이를 입력하세요 : ");
		
		//if(조건) - else if(조건) -else
		Scanner input = new Scanner(System.in);
		int ag;
		//1)정수를 받음
		//ag = input.nextInt();//
		String tmp;
		tmp = input.nextLine();
		ag = Integer.parseInt( tmp);
		
		if (ag>60) {
			System.out.println("61세 이상입니다.");
			System.out.println("경로 우대 요금이 적용됩니다.");
		}
		else if (ag>19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		else if(ag>13) {
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		else if(ag>8) {
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		}
		else {
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");		
		}
		System.out.println("결제를 진행해 주세요.");
		
		String id, password;
	
		System.out.printf("아이디를 입력해주세요:");
		id = input.nextLine();
		
		if (id.equals("java")) {
			System.out.println("아이디 일치");
			System.out.printf("비밀번호를 입력해 주세요:");
			password = input.nextLine();
			if (password.equals("abc123")) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 불일치");
			}
		}
		else {
			System.out.println("아이디 불일치");
		}
	}
}
