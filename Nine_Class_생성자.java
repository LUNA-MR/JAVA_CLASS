package nine;

class Cellphone{
	String model ="Galaxy 8";
	String color;
	int capacity;
	//생성자의 특징1)캘래스의 이름과 같다 2)반환형이 없다3)인스턴스 생성시 단 한번만 자동 실행된다->초기값 만드는 용도로 사용
	//생성자를 정의하지 않으면 void생성자가 기본으로 제공
	//생성자를 정의하면 자바가 제공되는 void생성자가 사라짐
	//void 생성자를 사용할려면 딸로 정의를 내려줘야 함
	
	
	
	
	//Cellphone 은 class이름과 같은걸로 생성하기
	
	Cellphone(String color, int capacity){
		//매개변수가 있는 생성자
		this.color = color;
		this.capacity = capacity;
	}
}	
public class Nine_Class_생성자 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone myphone  = new Cellphone("silver", 64);
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
