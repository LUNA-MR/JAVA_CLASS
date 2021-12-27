package java2_eight입출력;
//이전엔 한 바이트만 받았는데 
//Scanner를 사용하면 캐릭터형이나 등 숫자,문자,형변화 필요없이 가능
//Scanner의 객체를 생성하되 System.in을 매개 변수로 던저줌. 
//nextLine : 문자열 받음
//nextINT:정수 받음
//즉,scanner 문자열 입력받는 메소드, 정수 받는 메소드, 이요해서 바로집어넣을수있음

import java.util.Scanner;
 

public class Scanner입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//표준 입출력
		//화면에 출력하고 입력받는 표준 입출력 클래스
		//Scanner테스트하기
		//표준 입력 System.in을 사용하면 바이트 단위 자료만 처리할 수 있지만 
		//Scanner는 다양한 자료형을 입력할 수있음
		//표준 입력을 매개 변수로 Scanner클래스를생성
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름:");
		String name = scanner.nextLine(); //nextLine():문자열 입력
		System.out.println("직업:");
		String job = scanner.nextLine();//nextLine():믄자열 입력
		System.out.println("사번:");
		int num = scanner.nextInt();//nextInt():정수입력
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
