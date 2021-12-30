package ten;

 
class Car2{
	int wheel;
	int speed;
	String color;
	
	Car2(String color){this.color = color;}
}

class SportsCar extends Car2{
	int speedlimit;//제한속도 km
	
	SportsCar(String color, int speedlimit){
		super(color) ;//안적어도 자동으로 반영되는것임
		//this.color = color;
		this.speedlimit = speedlimit;
	}
}


public class Ten_빈생성자호출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportsCar1 = new SportsCar("red", 330);
		System.out.println(sportsCar1.color);
		System.out.println(sportsCar1.speedlimit);
	}

}
