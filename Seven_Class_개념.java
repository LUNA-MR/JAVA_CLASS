package seven;
class Car{
	boolean powerOn ; //시동 -> on/off = Truen/ False
	String color;//차량의 색상 여러가지니까 
	int wheel; // 바퀴 숫자 
	int speed; //속력 숫자 차에 따라 100.4일수도 있지만 간단하게 정수로
	boolean wiperOn;//와잎 ->on/off두개만 있으니까 
 
	
	void power() {//class안에 있는 것들은 메소드라 부름 
		powerOn = !powerOn;//시동 메소드
	  //원래 True 면  반대인 false를 집어넣기 
	//자동차 실행이 걸려있으면 시동을 끄고, 켜져 있으면 끄기 
		//void 이기 때문에 return값 없음.
	}
	void speedUp() {
		speed++; // 엑셀 메서드
	//혼자 일때는 앞에 ++이든 뒤든 상관없음
    //엑셀은 밟으면 속도가 올라감
	}
	void speedDown() {
		speed--;//브레이크 메서드
	//브레이크 밟으면 속도가 줄어듬
	}
	void wiper() {
		wiperOn = !wiperOn;//와이퍼 메서드
	}
}
public class Seven_Class_개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar;//클래스의 객체를 참조할 수 있는 참조변수 선언
		myCar = new Car(); //클래스의 객체를 생성하고 객체의 주소를 참조변수에 저장
		//새로운 변수를 만들어서 거기에 저장
		//myCar에 주소가 저장됨
		//변수mycar ,  .~ : 메소드?
		System.out.println("시동 처음 초기화 : " + myCar.powerOn);
		System.out.println("차의 색상 초기화 : " + myCar.color);
		System.out.println("바퀴의 수 초기화: "+ myCar.wheel);
		System.out.println("속력 초기화 : " + myCar.speed);
		System.out.println("와이퍼 작동 초기화:" + myCar.wiperOn);
		myCar.power();//기존의 있던값을 반대로 바꿔줌. 시동 메서드 실행
		System.out.println("시동 메서드 동작 :" + myCar.powerOn);
		myCar.power();//기존의 있던값을 반대로 바꿔줌. 시동 메서드 실행
		System.out.println("시동 메서드 다시 동작 :" + myCar.powerOn);
		myCar.color = "black" ; // 색상 변수에 black대입
		System.out.println("현재 차의 색상 :" + myCar.color);
		
	}

}
