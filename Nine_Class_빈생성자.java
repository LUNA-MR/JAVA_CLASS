package nine;

 

class Data1{//생성자를 정의하지 않아서 컴파일러가 기본 생성자를 반든다
	int value;
}
 
class Data2{//생성자를 정의해서 컴파일러가 기본 생성자를 만들지 않는다.
	int value;
	Data2(){}//overloading 조건, 매개변수 개수 달라야함.
	Data2(int x){//매개변수가 있는 생성자.
		value = x;	
	}
} 
//////////////////////////////////////////
class Car2{
	String color; //색상
	String gearType;//변속기 종류-auto(자동),manual(수동)
	int door;   //문의 개수
	
	
	Car2(){}//car+괄호가 있기때문에 car2는 메소드임
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

//////////////////////////////////////
class Car3{
	String color; //색상
	String gearType;//변속기 종류-auto(자동),manual(수동)
	int door;   //문의 개수
	
	Car3(){
		this("white","auto",4); //기본값을 이렇게 설정하기
	}
	Car3(String color){
		this(color,"auto",4);
	}
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
public class Nine_Class_빈생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		
		Data2 d2 = new Data2();
		
		Data2 d3 = new Data2(5);
		System.out.println(d3.value);
		
		////////////////////////////////
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car2 c2 = new Car2("black","manual",4);
		
		System.out.println("c1의 color" + c1.color + ", gearType = " + c1.gearType + ", door = "+ c1.door);
	 
		System.out.println("c2의 color" + c2.color + ", gearType = " + c2.gearType + ", door = "+ c2.door);
	
////////////////////////////////////////////////////
		Car3 c3 = new Car3();
		Car3 c4 = new Car3("blue");
		System.out.println("c3의 color" + c3.color + ", gearType = " + c3.gearType + ", door = "+ c3.door);
		System.out.println("c4의 color" + c4.color + ", gearType = " + c4.gearType + ", door = "+ c4.door);
	}
}

	
	 