package nine;

 

class Data1{//�����ڸ� �������� �ʾƼ� �����Ϸ��� �⺻ �����ڸ� �ݵ��
	int value;
}
 
class Data2{//�����ڸ� �����ؼ� �����Ϸ��� �⺻ �����ڸ� ������ �ʴ´�.
	int value;
	Data2(){}//overloading ����, �Ű����� ���� �޶����.
	Data2(int x){//�Ű������� �ִ� ������.
		value = x;	
	}
} 
//////////////////////////////////////////
class Car2{
	String color; //����
	String gearType;//���ӱ� ����-auto(�ڵ�),manual(����)
	int door;   //���� ����
	
	
	Car2(){}//car+��ȣ�� �ֱ⶧���� car2�� �޼ҵ���
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

//////////////////////////////////////
class Car3{
	String color; //����
	String gearType;//���ӱ� ����-auto(�ڵ�),manual(����)
	int door;   //���� ����
	
	Car3(){
		this("white","auto",4); //�⺻���� �̷��� �����ϱ�
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
public class Nine_Class_������� {

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
		
		System.out.println("c1�� color" + c1.color + ", gearType = " + c1.gearType + ", door = "+ c1.door);
	 
		System.out.println("c2�� color" + c2.color + ", gearType = " + c2.gearType + ", door = "+ c2.door);
	
////////////////////////////////////////////////////
		Car3 c3 = new Car3();
		Car3 c4 = new Car3("blue");
		System.out.println("c3�� color" + c3.color + ", gearType = " + c3.gearType + ", door = "+ c3.door);
		System.out.println("c4�� color" + c4.color + ", gearType = " + c4.gearType + ", door = "+ c4.door);
	}
}

	
	 