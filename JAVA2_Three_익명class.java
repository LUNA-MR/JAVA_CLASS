package java2_third;
 

class OuterClass1{
	//a와b라는 메서드를 가진 클래스 
	void a() {
		System.out.println("method a");
	}
	void b() {
		
	}
}
public class JAVA2_Three_익명class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임시함수 임시class ->빈도가 적은 함수를 쓸때 사용함
		//같은 클래스의 인스턴스 생성이나 사용이 다름
		OuterClass1 o = new OuterClass1() {
			void a() {
				//익명 클래스 안에 있는 메서드는 객체o를 통해서만 가능하다
				System.out.println("새롭게 정의한 익명 클래스의 메서드 입니다.");
			}
		};//익명 클래스는 반드시 마지막에 ;를 붙여야 한다. 
		//익명 클래스로 오버라이드한 메서드를 출력
		o.a();//새롭게 정의한 익명 클래스의 메서드
		OuterClass1 ok = new OuterClass1();
		o.a(); //새롭게 정의한 익명 클래스의 메서드 입니다. 
		
		//익명 클래스는 일회용이므로 다시 기존의 메서드가 출력
		ok.a();  //method a
				}

}
