package ten;

 
class Car2{
	int wheel;
	int speed;
	String color;
	
	Car2(String color){this.color = color;}
}

class SportsCar extends Car2{
	int speedlimit;//���Ѽӵ� km
	
	SportsCar(String color, int speedlimit){
		super(color) ;//����� �ڵ����� �ݿ��Ǵ°���
		//this.color = color;
		this.speedlimit = speedlimit;
	}
}


public class Ten_�������ȣ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportsCar1 = new SportsCar("red", 330);
		System.out.println(sportsCar1.color);
		System.out.println(sportsCar1.speedlimit);
	}

}
