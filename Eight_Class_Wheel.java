package eight;

 

class Cars{
	static int wheel = 4;//클래스 변수
	int speed; //인스턴스 변수
}

 
public class Eight_Class_Wheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cars.wheel);//클래스 변수 접근 가능
		//System.out.println(Cars.speed);//에러 발생! 인스턴스 변수 접근 불가
		
		Cars myCar1 = new Cars();
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);//인스턴스 생성 후에는 접근 가능
		
		Cars myCar2 = new Cars();
		System.out.println("변경 전");
		System.out.println("mycar1.speed:"+myCar1.speed);
		System.out.println("mycar2.speed:"+myCar2.speed);
		System.out.println("mycar1.wheel:"+myCar1.wheel);
		System.out.println("mycar2.wheel:"+myCar2.wheel);
		myCar2.speed = 100;
		myCar2.wheel = 5;
		System.out.println("변경 후 ");
		System.out.println("mycar1.speed"+myCar1.speed);
		System.out.println("mycar1.wheel"+myCar1.wheel);
		System.out.println("mycar2.speed"+myCar2.speed);
		System.out.println("mycar2.wheel"+myCar2.wheel);
	}

}
