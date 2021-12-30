package ten;

class Leader2 extends Student2{
	void lead() {}
	

	void say() {
		System.out.println("선생님께 인사");//overridng
		super.say();//상위 클래스의 메소드 참조
	}
}

public class Ten_객체_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader2 leader2 = new Leader2();
		leader2.say();//오버라이딩한 메서드 사용
		
	}

}
