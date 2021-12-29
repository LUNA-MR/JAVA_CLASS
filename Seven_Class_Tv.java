package seven;
class Tv{
	//Tv의 속성(멤버변수)
	String color;//색상
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	//티비의 기능(메소드)
	void power() {power = !power;} //*tv를 켜거나 쓰는 기능을 하는 메서드
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
public class Seven_Class_Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;   //Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv(); // Tv인스턴스를 생성한다.
		t.channel = 7;
		t.channelDown();//tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		System.out.println("현재 채널은" + t.channel + "입니다.");
		
		
	}

}
