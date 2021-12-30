package ten;
//오버라이딩 동일 클래스 이름의 경우 자식클래스가 우선순위로 적용된다. 
class Student2{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!");
	}
}

class Leader extends Student2{
	void lead() {
		
	}

	void say() {
	System.out.println("선생님꼐 인사");
}
}
public class Ten_객체지향_다중상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader1 = new Leader();
		leader1.eat();//상속 받은 메서드 사용
		leader1.say();//오버 라이딩한 메서드 사용
}

}
